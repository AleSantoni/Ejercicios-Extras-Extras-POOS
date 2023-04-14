/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraextra2poo;

import Servicio.TiempoService;
import entidad.Tiempo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BeluS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        TiempoService ts=new TiempoService();
        Tiempo t1=ts.ingresarHora();
        ts.imprimirHoraCompleta(t1);
    while(true){
      DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
 Date date = new Date();
  System.out.println("Hora actual: " + dateFormat.format(date));
  Thread.sleep(1000); // Espera un segundo para actualizar la hora
  
  
    }
    }
    
}
