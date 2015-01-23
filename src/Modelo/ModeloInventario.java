/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.util.logging.Logger;

/**
 * @author Estefania Baldini
 * @author Abel Márquez
 */
public class ModeloInventario {
    
    public static void agregarProductos(String nombre, int precio, String descripcion, String categoria, int cant) {
        
        Logger log = Logger.getLogger("Adicion de productos");
                ModeloTXT guardar= new ModeloTXT();
		
		File Ffichero=new File("Productos.txt");
		System.out.println(Ffichero);
    
                                        String cadenaRegistro;
                
                                                cadenaRegistro = nombre + ";" + precio + ";" + descripcion + ";" + categoria + ";" + cant + ";" + "Disponible";
                                                    log.info("Crea el arreo con todos los datos del producto y lo guardara ahora");
                         guardar.guardarEnTXT(Ffichero, cadenaRegistro);
    }
    
     public static void actualizarProductos(String nombre, int precio, String descripcion, String categoria, int cant) {
        
             
    }
    
}
