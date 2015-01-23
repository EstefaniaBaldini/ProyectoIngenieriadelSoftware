/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 * @author Estefania Baldini
 * @author Abel Márquez
 */
public class Usuario {
    
    private static String nombre, apellido, cedula, username, email, direccion, password, rol;
    private Date DoB;

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Usuario.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Usuario.apellido = apellido;
    }

    public static String getCedula() {
        return cedula;
    }

    public static void setCedula(String cedula) {
        Usuario.cedula = cedula;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Usuario.username = username;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Usuario.email = email;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        Usuario.direccion = direccion;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Usuario.password = password;
    }

    public static String getRol() {
        return rol;
    }

    public static void setRol(String rol) {
        Usuario.rol = rol;
    }

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date DoB) {
        this.DoB = DoB;
    }
   
}
