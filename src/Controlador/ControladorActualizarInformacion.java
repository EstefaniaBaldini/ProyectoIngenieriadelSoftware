/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorRegistro.RegistroUsuario;
import Modelo.ModeloTXT;
import Modelo.Usuario;
import Vista.VentanaBase;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.io.File;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Abel Márquez
 * @author Estefania Baldini
 */
public class ControladorActualizarInformacion {
    
  //  Logger log = Logger.getLogger("Clase Controladora de Actualizacion de Informacion");
    
    public static String chequeoCampos (JTextField nombre, JTextField apellido, 
            JTextField cedula, JTextArea Direccion, JTextField email,
            JPasswordField password, JPasswordField comprobacion,
            JLabel errorCampos, JTextField username, VentanaBase ventana) {
		
		//ESTO VA EN EL CONTROLADOR
		
		int errores = 0;
                String pass1 = "0", pass2 = "0";
		
		if (nombre.getText().equals("") || apellido.getText().equals("") || email.getText().equals("") || comprobacion.getPassword().equals("")
				  || password.getPassword().equals("") || comprobacion.getPassword().equals(""))  {    //Si algun campo estï¿½ lleno, debe mostrar la etiqueta de error
			
			
				errorCampos.setVisible(true);  //Con esto habilita la etiqueta de error
                                errorCampos.setText("Campos incompletos, por favor revise nuevamente.");
				errorCampos.setForeground(Color.red); // Y la pone en color rojo	
				errores++;
                                
                                pass1 = password.getPassword().toString();
                                pass2 = comprobacion.getPassword().toString();
			
		}
	    	    
		//if (!password.getPassword().equals(comprobacion.getPassword()))  {																	
				
                  if (!pass1.equals(pass2))  {
			    if (!password.getPassword().equals("")) {
				errorCampos.setText("Contrasenas no son iguales, ingrese de nuevo.");					
				errorCampos.setVisible(true);  //Con esto habilita la etiqueta de error
				errorCampos.setForeground(Color.red);  // Y la pone en color rojo
				errores++;
				
			    }
		}
		
		if ((password.getPassword().length < 4 || password.getPassword().length > 12) && password.getPassword().equals("")){ 
			//Si la contraseï¿½a tiene entre 4 y 12 caracteres.
			
                    //REVISAR AQUI, CORRECCION??
			errorCampos.setText("La contrasena debe tener entre 4 y 12 caracteres");
			errorCampos.setVisible(true);  //Con esto habilita la etiqueta de error
			errorCampos.setForeground(Color.red);  // Y la pone en color rojo
			errores++;			
		}
		
		
		
		if (errores > 0) {
		      return ("ErrorSistema");  }
		else {
                //         Logger msj = Logger.getLogger("Valores en los campos funcionan, continua a actualizar informacion");
                         //Si entra por aca, todo está en orden y procederá a  ACTUALIZAR INFORMACION DEL USUARIO
                       String nuevalinea = nombre.getText() + ";" + apellido.getText()+ ";" +
                                     cedula.getText() + ";" +  username.getText() + ";" +  password.getText()+ ";" + 
                                         email.getText() + ";" + Direccion.getText() + ";" + Usuario.getRol();
                       
                       
             //          msj.info("Entrando al archivo");
                       File archivo = new File("Prueba.txt");
                       String lineaprueba = ModeloTXT.devolverLinea("Usuario.txt");
                       System.out.println(ModeloTXT.devolverLinea("Usuario.txt"));
                                ModeloTXT.ModificarFichero(archivo, ModeloTXT.devolverLinea("Prueba.txt"), nuevalinea);
                       /*     RegistroUsuario( nombre.getText(), apellido.getText(), 
                                     cedula.getText(), username.getText(), password.getPassword().toString(),  
                                         email.getText(),  DoB.getDate(),  Direccion.getText()); */
					
			}
			
				return ("ActualizacionCompleta");
			}
			
public static void agregarMetodoPago (String metodoPago) {

    //Agrega en el TXT el metodo de pago con la cedula del cliente que esta en la sesion actual
    Logger log = Logger.getLogger("Metodo agregar pago a un usuario");
    log.info("Prosigue con la funcion a guardar en el archivo que almacena los metodos de pago");
    File archivoMetPago = new File("MetodoPago.txt");
    ModeloTXT.guardarEnTXT(archivoMetPago, metodoPago);

}

public static void actualizarMetodoPago (String metodoPagoActualizado) {
    
                               File archivo = new File("MetodoPago.txt");
                                ModeloTXT.ModificarFichero(archivo, ModeloTXT.devolverLinea("MetodoPago.txt"), metodoPagoActualizado);
    
}

}
/*} */
