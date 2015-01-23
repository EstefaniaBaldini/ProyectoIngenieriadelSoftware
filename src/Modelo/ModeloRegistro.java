/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.util.Date;
import java.util.logging.Logger;


/**
 *
 * @author Abel Márquez
 * @author Estefania Baldini
 */
public class ModeloRegistro {
    
    
    /**
      * Esta funcion se encarga de validar la existencia de un usuario en la aplicacion
     * @param Ffichero
     * @param username
     * @return true or false dependiendo si se encontrï¿½ el usuario en la aplicacion
     */
	
	public static boolean usuarioEnSistema (File Ffichero,String username) {
		//Logger log = Logger.getLogger("Entro a buscar en el sistema...");
		ModeloTXT busca=new ModeloTXT();
		/* REVISAR EN TXT SI EXISTE O NO EL USUARIO */
		//File Ffichero=new File("c:\\Usuario.txt");
	   if ( busca.buscarEnTXT(Ffichero, username)) {
		  
		//log.info("Archivo no encontrado."); 
		return true;
	   }
	   else {
		//log.info("Usuario no encontrado.");
		return false;
		
                }
	}
    
    public static void RegistroUsuario (String Nombre, String Apellido, String cedula, String username, 
            String password, String email, Date fechanacimiento, String direccion) {
        
      //  Logger log = Logger.getLogger("Funcion que registra un usuario");
        
        Usuario usuarioNuevo = new Usuario();
        usuarioNuevo.setNombre(Nombre);
        usuarioNuevo.setApellido(Apellido);
        usuarioNuevo.setCedula(cedula);
        usuarioNuevo.setUsername(username);
        usuarioNuevo.setEmail(email);
        usuarioNuevo.setDireccion(direccion);
        usuarioNuevo.setPassword(password);
     //   usuarioNuevo.setDoB(fechanacimiento);
        usuarioNuevo.setRol("Comprador");
        
        //Primero debe revisar si ya existe un correo asociado y cedula
       //Almacenarlo en un TXT para finalizar el registro.
        
        ModeloTXT guardar= new ModeloTXT();
		
		File Ffichero=new File("Usuario.txt");
		System.out.println(Ffichero);
                boolean usuarioEnSistema = false;
                
                String cadenaRegistro;
                
                cadenaRegistro = Nombre + ";" + Apellido + ";" + cedula + ";"
                         + username + ";" + password + ";" + email + ";" + direccion + ";" + "Comprador";
                
                usuarioEnSistema = usuarioEnSistema(Ffichero, username);
                
                
                if (!usuarioEnSistema) {  //El usuario no esta en el sistema, asi que se procede a guardar los datos en un TXT para registrarlo
			
			/* GUARDAR EN TXT */
			  //  log.info("Guardando...");
		        guardar.guardarEnTXT(Ffichero, cadenaRegistro);
		        

		}
		
		else {  //Usuario existe, asi que no debe registrar nada. Imprimir que el usuario ya existe
			
			//log.info("Correo ya registrado");
			
		}
      
        
    }
    
}
