/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author fersieghe
 */
public class Status {
    
    
    private static String status = "Offline";

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        Status.status = status;
    }

}
