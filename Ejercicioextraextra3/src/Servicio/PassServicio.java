
package Servicio;

import entidad.Pass;
import java.util.Scanner;

public class PassServicio {
    Scanner leer =new Scanner(System.in);
    
    /*
    Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
    */
    
     public Pass ingresarDatos() {
         
         Pass p1=new Pass("ale715888", "Alejandro", 29715888);
         
         return p1;
    }
     
     public void modificarContraseña(Pass p1){
         String pasword;
         int cont=0;
         String pasword1;
      
         do {
             System.out.println("Digite la contraseña para poder ingresar ");
             pasword=leer.next();
             if (pasword.equals(p1.getPass())) {
                 System.out.println("Digite su nueva contraseña con una longitud de 10");
             pasword1=leer.next();
             if(pasword1.length()==10){
                  p1.setPass(pasword1);
                  System.out.println(p1.getPass());
                 System.out.println("Contraseña ingresada correctamente ->");
                
                 break;
            
                 
             }else{
                 System.out.println("No pudimios generar la contraseña, no se encuentra dentro de los parametros digite nuevamente la contraseña ");
             }
             
             }else{
                 cont++;
                 System.out.println("Contraseña incorrecta no podra modificar los datos ");
             }
             
             
         } while (cont!=3);
         
         
         
         
     }
    /*
     ● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
     */
     public void crearPass(Pass p1){
        String pasword;
     
        int cont=0;
         do {
             System.out.println("Digite una contraseña que contenga 10 caracteres ->");
             pasword=leer.next();
             if (pasword.length()==10) {
                 p1.setPass(pasword);
                 System.out.println("Contraseña generada correctamente ");
                 break;
             }else{
                 System.out.println("La contraseña no cumple con los requisitos ");
                 cont++;
             }
             
         } while (cont!=3);
         
         
     }
       /*
     ● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
     */  
         
     public void analizarPass(Pass p1){
        if (p1.getPass().contains("z")) {
            if (p1.getPass().chars().filter(i -> i == 'a').count() >= 2) {// este metodo  verifica si la letra a esta contenida en el string y si esta 2 veces 
             System.out.println("La contraseña es de nivel de seguridad ALTO");
            
        }else {
                System.out.println("La contraseña es de nivel de seguridad MEDIO");
                
            }
           
        } else {
             System.out.println("La contraseña es de nivel de seguridad BAJO");
        }

    } 
         
     /*
     ● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
     
     */    
     public void modificarNombre(Pass p1){
         boolean bandera=false;
         String pasword;
         do {
             System.out.println("Digite la contraseña para poder ingresar ");
             pasword=leer.next();
             if (pasword.equals(p1.getPass())) {
                 System.out.println("Digite su nombre ->");
                 p1.setNombre(leer.next());
                 
                 
             }else{
                 System.out.println("Pass incorrecto no podra modificar los datos ");
             }
             
         } while (bandera);
         
         
         
         
     }     
     public void modificarDni(Pass p1){
         boolean bandera=false;
         String pasword;
         do {
             System.out.println("Digite la contraseña para poder ingresar ");
             pasword=leer.next();
             if (pasword.equals(p1.getPass())) {
                 System.out.println("Digite su Dni->");
                 p1.setDni(leer.nextInt());
                 
                 
             }else{
                 System.out.println("Pass incorrecto no podra modificar los datos ");
             }
             
         } while (bandera);
         
     }
         
         
     
/*
     A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
     */     
       public void  menu(Pass p1){
           PassServicio ps=new PassServicio();
           String opc;
           do {
           System.out.println("**************MENU**************");
           System.out.println("A . Ingresar Contraseña");
           System.out.println("B. Mostrar nivel de contraseña");
           System.out.println("C . Modificar contraseña");
           System.out.println("D . Modificar Nombre");
           System.out.println("E . Modificar DNI");
           System.out.println("F . Salir");
           System.out.println("Digite la opcion deseada->");
           opc =leer.next().toUpperCase();
           switch(opc){
               case "A" :
                   ps.crearPass(p1);
                   break;
               case "B" :
                   ps.analizarPass(p1);
                   break;
               case "C":
                   ps.modificarContraseña(p1);
                   break;
               case "D" :
                   ps.modificarNombre(p1);
                   break;
               case "E" :
                   ps.modificarDni(p1);
                   break;
                   
               case "F":
                   System.out.println("Gracias que tenga un Buen dia ");
                   break;
               default :
                   System.out.println("Opcion ingresada incorrecta ");
               
               
               
               
               
               
               
           }   
          
           } while (!"F".equals(opc));
           
    
}   
     
     }
         
    

