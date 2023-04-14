/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraextra4;

import Servicio.FechaServicio;
import entidad.Fecha;

/**
 *
 * @author BeluS
 */
public class EjercicioExtraExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FechaServicio fs= new FechaServicio();
       Fecha f1=new Fecha();
       fs.verificarAño(f1);
       fs.diasMes(f1);
  
       fs.fechaAnterior(f1);
       
       
    
}
}