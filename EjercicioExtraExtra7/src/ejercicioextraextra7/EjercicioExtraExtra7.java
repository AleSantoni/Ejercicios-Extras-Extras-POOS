/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraextra7;

import Servicio.AutoServicio;
import entidad.Auto;

/**
 *
 * @author BeluS
 */
public class EjercicioExtraExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoServicio as=new AutoServicio();
        Auto a1=as.crearFicha();
     as.cambiarTitularidad(a1);
        System.out.println("");
        as.modificarKm(a1);
        System.out.println("");
        as.cambioAceite(a1);
    }
    
}
