/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Abel Márquez
 */
public class Pago {
    
    private String numeroTDC;
    private Date fechaVencimientoTDC;
    private int codigoSeguridadTDC;
    private String marcaComercial;

    public String getNumeroTDC() {
        return numeroTDC;
    }

    public void setNumeroTDC(String numeroTDC) {
        this.numeroTDC = numeroTDC;
    }

    public Date getFechaVencimientoTDC() {
        return fechaVencimientoTDC;
    }

    public void setFechaVencimientoTDC(Date fechaVencimientoTDC) {
        this.fechaVencimientoTDC = fechaVencimientoTDC;
    }

    public int getCodigoSeguridadTDC() {
        return codigoSeguridadTDC;
    }

    public void setCodigoSeguridadTDC(int codigoSeguridadTDC) {
        this.codigoSeguridadTDC = codigoSeguridadTDC;
    }

    public String getMarcaComercial() {
        return marcaComercial;
    }

    public void setMarcaComercial(String marcaComercial) {
        this.marcaComercial = marcaComercial;
    }
    
    
    
}
