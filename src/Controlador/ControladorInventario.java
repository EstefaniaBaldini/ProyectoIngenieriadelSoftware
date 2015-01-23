/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloInventario;
import javax.swing.JComboBox;

/**
 * @author Estefania Baldini
 * @author Abel Márquez
 */

public class ControladorInventario {
    
    public static void agregarProductos (String titulo, String precio, String descripcion, String categoria, String cantidad) {
        
        //Esta funcion recibe los datos del producto a agregar
        int precioInt = Integer.parseInt(precio);
        int cant = Integer.parseInt(cantidad);
        ModeloInventario.agregarProductos(titulo, precioInt, descripcion, categoria, cant);
        
    }
    
    
    public static void agregarCategorias (JComboBox categorias, String nuevaCategoria) {
        
        Object content = nuevaCategoria;
        categorias.addItem(content);
        
    }
    
}
