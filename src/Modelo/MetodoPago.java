/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * @author Estefania Baldini
 * @author Abel Márquez
 */
public class MetodoPago {
    
    private static String numeroTDC,marcaComercial, fechaVencimientoTDC;
    private long codigoSeguridadTDC;

    public static String getNumeroTDC() {
        return numeroTDC;
    }

    public static void setNumeroTDC(String numeroTDC) {
        MetodoPago.numeroTDC = numeroTDC;
    }

    public static String getMarcaComercial() {
        return marcaComercial;
    }

    public static void setMarcaComercial(String marcaComercial) {
        MetodoPago.marcaComercial = marcaComercial;
    }

    public static String getFechaVencimientoTDC() {
        return fechaVencimientoTDC;
    }

    public static void setFechaVencimientoTDC(String fechaVencimientoTDC) {
        MetodoPago.fechaVencimientoTDC = fechaVencimientoTDC;
    }

    public long getCodigoSeguridadTDC() {
        return codigoSeguridadTDC;
    }

    public void setCodigoSeguridadTDC(int codigoSeguridadTDC) {
        this.codigoSeguridadTDC = codigoSeguridadTDC;
    }


    
    
    
}
