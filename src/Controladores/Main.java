/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

import java.io.IOException;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author elman
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage){
        
        try {
        Parent parent = FXMLLoader.load(getClass().getResource("/Vista/PrimeraVentana.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        //primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.show();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        // TODO code application logic here
    }
    
}
