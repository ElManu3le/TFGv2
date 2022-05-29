/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author elman
 */

public class Persona {
    private final StringProperty dni = new SimpleStringProperty();
    private final StringProperty nombre = new SimpleStringProperty();
    private final StringProperty apellidos = new SimpleStringProperty();
    private final StringProperty genero = new SimpleStringProperty();
    private final StringProperty ciudad = new SimpleStringProperty();
    private final StringProperty cp = new SimpleStringProperty();


    public String getCp() {
        return cp.get();
    }

    public void setCp(String value) {
        cp.set(value);
    }

    public StringProperty cpProperty() {
        return cp;
    }
    
    

    public String getCiudad() {
        return ciudad.get();
    }

    public void setCiudad(String value) {
        ciudad.set(value);
    }

    public StringProperty ciudadProperty() {
        return ciudad;
    }

    public String getGenero() {
        return genero.get();
    }

    public void setGenero(String value) {
        genero.set(value);
    }

    public StringProperty generoProperty() {
        return genero;
    }

    public String getApellidos() {
        return apellidos.get();
    }

    public void setApellidos(String value) {
        apellidos.set(value);
    }

    public StringProperty apellidosProperty() {
        return apellidos;
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String value) {
        nombre.set(value);
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public String getDni() {
        return dni.get();
    }

    public void setDni(String value) {
        dni.set(value);
    }

    public StringProperty dniProperty() {
        return dni;
    }
    
    /*
    String dni;
    String nombre;
    String apellidos;
    String genero;
    String ciudad;
    String cp;

    public Persona(String dni, String nombre, String apellidos, String genero, String ciudad, String cp) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.ciudad = ciudad;
        this.cp = cp;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
*/
    
    
    
}
