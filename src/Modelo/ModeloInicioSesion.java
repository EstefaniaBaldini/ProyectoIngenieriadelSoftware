/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import org.apache.log4j.Logger;

/**
 *
 * @author Abel Márquez
 * @author Estefania Baldini
 */
public class ModeloInicioSesion {
    
    
    public static String inicioSesion (String username, String password) {
        
        File usuarios = new File("Usuario.txt");
        
    //    boolean existe = ModeloRegistro.usuarioEnSistema(usuarios, username);
        String usuario = ModeloTXT.devolverLinea(username, "Usuario.txt");
        String datosdeUsuario[] = usuario.split(";");
        
        if (/*(existe) && */(datosdeUsuario[4].equals(password))){  //Existe se refiere a si existe el usuario en el sistema
        //Si encuentra el usuario y todo sale bien

            Logger log = Logger.getLogger("Inicio de Sesion");
            log.info("Usuario encontrado, iniciando sesion");
        Usuario user = new Usuario();
         user.setNombre(datosdeUsuario[0]);
         user.setApellido(datosdeUsuario[1]);
         user.setCedula(datosdeUsuario[2]);
         user.setUsername(datosdeUsuario[3]);
         user.setEmail(datosdeUsuario[5]);
         user.setDireccion(datosdeUsuario[6]);
         user.setPassword(datosdeUsuario[4]);
         user.setRol(datosdeUsuario[7]);
      
         Status status = new Status();
         status.setStatus("Online"); // Indica true si hay alguien con la sesion iniciada
         return ("Inicio de Sesion Exitoso"); 
         
        }
        
        return ("Error en el sistema");
    }
    
}
