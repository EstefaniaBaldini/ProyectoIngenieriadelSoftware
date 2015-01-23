/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloInicioSesion;
import org.apache.log4j.Logger;

/**
 *
 * @author Usuario
 */
public class ControladorInicioVendedor {
    public static String inicioVendedor (String username, String password) {
        
        Logger log = Logger.getLogger("Metodo de inicio de sesion");
        
        String resultado = ModeloInicioSesion.inicioSesion(username, password);
        log.info("La variable resultado contiene una frase que dicta si la operacion es correcta");
        if (resultado.equals("Inicio de Sesion Exitoso")) {
            log.info("Si todo es correcto, esta funcion devuelve un booleano true");
            return ("true");
        }
        
  return ("false");
    
}}
