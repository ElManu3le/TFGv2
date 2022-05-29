/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vista;

import Connectar.ConnectarDB;
import Modelos.Persona;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author elman
 */
public class TablaControladorController implements Initializable {

    @FXML
    private TableView<Persona> tablaPersonas;
    @FXML
    private TableColumn<Persona, String> dniColum;
    @FXML
    private TableColumn<Persona, String> nombreColum;
    @FXML
    private TableColumn<Persona, String> apellidosColum;
    @FXML
    private TableColumn<Persona, String> generoColum;
    @FXML
    private TableColumn<Persona, String> ciudadColum;
    @FXML
    private TableColumn<Persona, String> cpColum;

    private ObservableList<Persona> listaPersonas;

    @FXML
    private TextField dniTextField;
    @FXML
    private TextField nombreTextField;
    @FXML
    private TextField apellidosTextField;
    @FXML
    private TextField generoTextField;
    @FXML
    private TextField ciudadTextField;
    @FXML
    private TextField cpTextField;

    Stage stage;
    String query;
    Connection conection = null;
    private ConnectarDB connectDB = null;
    PreparedStatement prepare = null;
    ResultSet result = null;
    Persona persona;
    @FXML
    private Button btnAgregar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        connectDB = new ConnectarDB();
        cargarDatos();
    }

    @FXML
    /**fUNCION iNSERTAR DATOS EN LA TABLA Y MYSQL */
    private void agregarTabla() {

        conection = ConnectarDB.ConnectionDB();
        String sql = "insert into prueba(dni, nombre, apellidos, genero, ciudad, codigo_postal)values(?,?,?,?,?,?)";
        try {
            prepare = conection.prepareStatement(sql);
            prepare.setString(1, dniTextField.getText());
            prepare.setString(2, nombreTextField.getText());
            prepare.setString(3, apellidosTextField.getText());
            prepare.setString(4, generoTextField.getText());
            prepare.setString(5, ciudadTextField.getText());
            prepare.setString(6, cpTextField.getText());

            prepare.execute();
            JOptionPane.showMessageDialog(null, "Añadido a la db");

        } catch (Exception e) {
        }

    }

    private void cargarDatos() {

        try {

            listaPersonas = FXCollections.observableArrayList();

            query = "SELECT * FROM prueba";
            conection = ConnectarDB.ConnectionDB();
            result = conection.createStatement().executeQuery(query);
            while (result.next()) {
                Persona person = new Persona();
                person.setDni(result.getString("dni"));
                person.setNombre(result.getString("nombre"));
                person.setApellidos(result.getString("apellidos"));
                person.setGenero(result.getString("genero"));
                person.setCiudad(result.getString("ciudad"));
                person.setCp(result.getString("codigo_postal"));

                listaPersonas.add(person);

            }

            dniColum.setCellValueFactory(new PropertyValueFactory<>("dni"));
            nombreColum.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            apellidosColum.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
            generoColum.setCellValueFactory(new PropertyValueFactory<>("genero"));
            ciudadColum.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
            cpColum.setCellValueFactory(new PropertyValueFactory<>("codigo_postal"));

            tablaPersonas.setItems(listaPersonas);

        } catch (SQLException ex) {
            Logger.getLogger(TablaControladorController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void close(MouseEvent event) {
         Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    

}
