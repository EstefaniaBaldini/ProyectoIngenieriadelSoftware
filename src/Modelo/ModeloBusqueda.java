/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.apache.log4j.Logger;

/**
 * @author Estefania Baldini
 * @author Abel Marquez
 */
public class ModeloBusqueda {
    
    public static String busquedaDeProductos (String nombre, String categoria) {
        
        Logger log = Logger.getLogger("Metodo busqueda de productos");
        
        String stringChequeo [] = null ; 
        String productosFinales = "";
        String productos = ModeloTXT.devolverProducto();     
        System.out.println(productos); //Todos los productos encontrados, debo separarlos y dependiento de la categoria, irlos almacenando para agregarlos a la ventana
        
        String productosSeparados [] = productos.split("/");
        int cantidadProductos = productosSeparados.length;
        
        for (int i=0 ; i < cantidadProductos; i++) {
            
             stringChequeo = productosSeparados[i].split(";");
              log.info("Se realia el FOR para recorrer los productos");
              if ((((stringChequeo[3].equals(categoria)) || (stringChequeo[0].contains(nombre)))) && (stringChequeo[5].equals("Disponible"))) {
                   // Si las categorias son las mismas, es un producto que debera aparecer en la ventana y si esta disponible tambien!
                  
                  productosFinales = productosFinales + "/" + productosSeparados[i];
                  System.out.println(productosSeparados[i] + "  añadido");
                  log.info("Hay un arreglo con todos los productos juntos");
              } 
        }
      //  System.out.println("Productos que cumplen con la busqueda : " + " " + productosFinales);
        return (productosFinales);

    }
    
}
