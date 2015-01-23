package Controlador;

import Modelo.ModeloRegistro;
import Vista.VentanaBase;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.io.File;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Abel Márquez
 * @author Estefania Baldini
 */
public class ControladorRegistro {
    
    /**
     * Método que vacia todos los campos de la planilla de registro

     */
    
    public static void VaciarCampos (JTextField nombre, JTextField apellido, 
            JTextField cedula, JTextField Direccion, JTextField email,
            JPasswordField password, JPasswordField comprobacion, 
                        JTextField username, JLabel errorCampo, JDateChooser DoB) {
        
                    nombre.setText("");
		    apellido.setText("");
                    cedula.setText("");
                    username.setText("");
		    email.setText("");
		    Direccion.setText("");
		    password.setText("");
		    comprobacion.setText("");
                    errorCampo.setVisible(false);
                    DoB.setDate(null);
        
    }
    
        /**
     *  Esta funcion permite registrar un usuario
     * 
     * @param Nombre - Nombre del nuevo usuario
     * @param Apellido - Apellido del nuevo usuario
     * @param cedula - Cedula del usuario a registrar
     * @param username - Username del usuario a registrar
     * @param password - contraseña del usuario a registrar
     * @param email - email del usuario a registrar
     * @param fechanacimiento - fecha de nacimiento del usuario a registrar
     * @param direccion - direccion del usuario a registrar
     */
    public static void RegistroUsuario (String Nombre, String Apellido, String cedula, String username, 
            String password, String email, Date fechanacimiento, String direccion) {
        
            ModeloRegistro.RegistroUsuario(Nombre, Apellido, cedula, username,
                    password, email, fechanacimiento, direccion);
        
    }
      
    public static String chequeoCampos (JTextField nombre, JTextField apellido, 
            JTextField cedula, JTextArea Direccion, JTextField email,
            JPasswordField password, JPasswordField comprobacion,
            JLabel errorCampos, JTextField username, JDateChooser DoB, VentanaBase ventana) {
		
		//ESTO VA EN EL CONTROLADOR
		
		int errores = 0;
                String pass1 = "0", pass2 = "0";
		
		if (nombre.getText().equals("") || apellido.getText().equals("") || email.getText().equals("") || comprobacion.getPassword().equals("")
				  || password.getPassword().equals("") || comprobacion.getPassword().equals(""))  {    //Si algun campo estï¿½ lleno, debe mostrar la etiqueta de error
			
			
				errorCampos.setVisible(true);  //Con esto habilita la etiqueta de error
                                errorCampos.setText("Campos incompletos, por favor revise nuevamente.");
				errorCampos.setForeground(Color.red); // Y la pone en color rojo	
				errores++;
                                
                                pass1 = password.getText();
                                pass2 = comprobacion.getText();
			
		}
	    	    
		//if (!password.getPassword().equals(comprobacion.getPassword()))  {																	
				
                  if (!pass1.equals(pass2))  {
			    if (!password.getPassword().equals("")) {
				errorCampos.setText("Campos incompletos, por favor revise nuevamente.");					
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
		
		System.out.println(pass1+ " ---> " + pass2 + "      " + password.getText());
		
		if (errores > 0) {
		      return ("ErrorSistema");  }
		else {
                     
                         //Si entra por aca, todo está en orden y procederá a registrar al usuario
                    
                         
                            RegistroUsuario( nombre.getText(), apellido.getText(), 
                                     cedula.getText(), username.getText(), password.getText(),  
                                         email.getText(),  DoB.getDate(),  Direccion.getText());
					
			}
			
				return ("RegistroAprobado");
			}
			
			
		}

