/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Auto;
import java.util.Date;
import java.util.Scanner;

/**
 *Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.


●
 * @author BeluS
 */
public class AutoServicio {
Scanner leer =new Scanner (System.in);
public Auto crearFicha(){
    Auto a1=new Auto();
    Date fechaVenc=new Date();
          
    System.out.println("Digite el nombre del titular del vehiculo->");
    a1.setNombre(leer.next());
    System.out.println("Digite el dia mes y año de vencimiento del carnet ");
    int dia=leer.nextInt();
    int mes=leer.nextInt()-1;
    int anio=leer.nextInt()-1900;
    a1.setCarnetvenc(fechaVenc);
    System.out.println("Digite el color del vehiculo->");
    a1.setColor(leer.next());
    System.out.println("Digite el modelo del  vehiculo ->");
    a1.setModelo(leer.next());
    System.out.println("Digite los kilometros  que tien el vehiculo->");
    a1.setKm(leer.nextInt());
    
    
    
    
   return a1; 
} 
    /*
● Que el usuario, modifique la titularidad del vehículo.
*/
public void cambiarTitularidad(Auto a1){
    System.out.println("El titular del vehiculo se llama ->"+ a1.getNombre());
    System.out.println("Ingrese el nombre del nuevo titular del vheiculo ->");
    a1.setNombre(leer.next());
    System.out.println("El nuevo titular se llama  " + a1.getNombre());
    
}
/*
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
*/
public void modificarKm(Auto a1){
    System.out.println("El auto tiene " + a1.getKm()+ " KM al comienzo del dia  ");
    
    System.out.println("Digite la cantidad de  kilometros recorridos hoy ->");
    int kmrecorridos=leer.nextInt();
    a1.setKm(a1.getKm()+kmrecorridos);
    System.out.println("La cantidad de kilometros que tiene el vehiculo en este momento es de " +a1.getKm());
    
    
    
}
/*
 Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
*/
public void cambioAceite(Auto a1){
  
    System.out.println("Verificaremos segun los kilometros recorridos si es necesario hacer el cambio de aceite pedido a los 10.000 km");
    System.out.println("");
    if(a1.getKm()>=10000){
        System.out.println("Es necesario realizar el cambio de aceite  el auto tiene "+ a1.getKm() );
    }else {
        System.out.println("Todavia no es necesario realizar el cambio de aceite   " );
    }
    
    
}
}
