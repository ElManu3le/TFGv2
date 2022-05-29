/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author elman
 */
public class ConnectarDB {

    private static Connection cx;

    public static Connection ConnectionDB() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cx = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tfgdb?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "gt2rsmanuel620");
            JOptionPane.showMessageDialog(null, "Conexion Establecida");

            return cx;
        } catch (Exception e) {
            Logger.getLogger(ConnectarDB.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }

    }

}
