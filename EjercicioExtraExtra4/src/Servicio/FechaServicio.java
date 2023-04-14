/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Fecha;
import java.util.Scanner;

/**
 *Se deberá en métodos independientes:
● Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
● Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
 * @author BeluS
 */
public class FechaServicio {
    Scanner leer=new Scanner (System.in);
    
    
    
    public void verificarAño(Fecha f1){
       
        boolean bandera=true;
        do {
             System.out.println("Ingrese un año cualquiera rntre 1900 y 2021");
             int anio=leer.nextInt();
             if (anio>=1900 && anio<=2021) {
                 f1.setAnio(anio);
                 System.out.println("El año guardado en el sistema es " +f1.getAnio());
                bandera=false;
        } else{
                 System.out.println("Año ingresado fuera del parametro se guardara el año por defecto"+ f1.getAnio());   
                 bandera=false;
             }
    }while (bandera);
    
}
    public void diasMes(Fecha f1){
        boolean bandera=true;
        do {
            System.out.println("Digite un mes del anio del 1 al 12");
        int mes=leer.nextInt();
        if (mes >=1 && mes <=12){
            f1.setMes(mes);
            bandera =false;
            
        }else{
            System.out.println("Valor ingresado incorrecto");
        }
        } while (bandera);
        switch  (f1.getDia()){
            case 1:
                System.out.println("USTED INGRESO MES "+f1.getMes() + "ENERO, QUE TIENE 31 días   ");
                break;
            case 2:
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "FEBRERO, QUE TIENE 28 días   ");
                   break;
             case 3:
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "MARZO, QUE TIENE 31 días   ");
                   break;
             case 4 :
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "ABRIL, QUE TIENE 30 días   ");
                   break;
                   case 5:
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "MAYO, QUE TIENE 31 días   ");
                   break;
                   case 6:
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "JUNIO, QUE TIENE  30 días   ");
                   break;
                   case 7:
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "JULIO, QUE TIENE 31 días   ");
                   break;
                   case 8:
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "AGOSTO QUE TIENE 31 días   ");
                   break;
                   case 9:
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "SEPTIEMBRE, QUE TIENE  30 días   ");
                   break;
                   case 10:
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "OCTUBRE, QUE TIENE  31 días   ");
                   break;
                   case 11:
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "NOVIEMBRE, QUE TIENE  30 días   ");
                   break;
                   case 12:
                   System.out.println("USTED INGRESO MES "+f1.getMes() + "DICIEMBRE, QUE TIENE  31 días   ");
                   break;
        }
        
        
        
    }
    
    public void fechaAnterior(Fecha f1){
        System.out.println("DIA = "+ f1.getDia()+ " \n MES "+ f1.getMes()+ " \n AÑIO: "+ f1.getAnio());
        System.out.println("La fecha anterior es : ");
        if (f1.getDia()==1){
            if (f1.getMes()==1){
                f1.setMes(12);
                f1.setAnio(f1.getAnio()-1);
                f1.setDia(31);
                System.out.println("DIA = "+ f1.getDia()+ " \n MES "+ f1.getMes()+ " \n AÑIO: "+ f1.getAnio());
                    
                    
             
            }else{
                f1.setMes(f1.getMes()-1);
                f1.setAnio(f1.getAnio());
            switch (f1.getMes()){
                    case 1:
                        f1.setDia(31);
                        break;
                    case 2:
                        f1.setDia(28);
                        break;
                     case 3:
                        f1.setDia(31);
                        break;
                         case 4:
                        f1.setDia(30);
                        break;
                         case 5:
                        f1.setDia(31);
                        break;
                         case 6:
                        f1.setDia(30);
                        break;
                         case 7:
                        f1.setDia(31);
                        break;
                         case 8:
                        f1.setDia(31);
                        break;
                         case 9:
                        f1.setDia(30);
                        break;
                         case 10:
                        f1.setDia(31);
                        break;
                         case 11:
                        f1.setDia(30);
                        break;
                         case 12:
                        f1.setDia(31);
                        break;
                    
          
          
             }
              System.out.println("DIA = "+ f1.getDia()+ " \n MES "+ f1.getMes()+ " \n AÑIO: "+ f1.getAnio());
        }
        }else{
            f1.setDia(f1.getDia()-1);
            f1.setMes(f1.getMes()-1);
            f1.setAnio(f1.getAnio());
            System.out.println("DIA = "+ f1.getDia()+ " \n MES "+ f1.getMes()+ " \n AÑIO: "+ f1.getAnio());
        }
        
       
    }
    
}