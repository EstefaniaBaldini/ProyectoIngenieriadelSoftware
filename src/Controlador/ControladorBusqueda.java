/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloBusqueda;
import Modelo.Status;
import Modelo.Usuario;
import java.util.logging.Logger;
import javax.swing.JMenuItem;

/**
 *
 * @author Abel Márquez
 * @author Estefania Baldini
 */
public class ControladorBusqueda {
    
    public static String busquedaPorNombreyCategoria (String nombre, String categoria) {
       
        Logger log = Logger.getLogger("Funcion que busca productos por nombre y categoria");
        return (ModeloBusqueda.busquedaDeProductos(nombre, categoria));
        
    }
    
}
