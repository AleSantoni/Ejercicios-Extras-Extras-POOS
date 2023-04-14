/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextrasextras5;

import Servicio.TrianguloIsocelesServicio;
import entidad.TrianguloIsoceles;
import java.text.DecimalFormat;

/**
 *
 * @author BeluS
 */
public class EjerciciosExtrasExtras5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TrianguloIsocelesServicio ts=new TrianguloIsocelesServicio();
    TrianguloIsoceles Tr1 =new   TrianguloIsoceles();
      TrianguloIsoceles [] triangulos= new TrianguloIsoceles [4];
      double[] Areas= new double[4];
      double area;
      
        for (int i = 0; i <triangulos.length; i++) {
            System.out.println("Ingrese los datos para el Triangulo " + (i + 1) + ":");
            triangulos[i]=ts.CargarTriangulo();
              
        
            ts.CalcularPerimetro(triangulos[i]);
           area =ts.CalcularArea(triangulos[i]);
            Areas[i]=area;
            
        }
      double maxArea = Areas[0]; 
      
for (int i = 1; i < Areas.length; i++) { // Empezar a recorrer el array desde la segunda posición
    if (Areas[i] > maxArea) { 
        maxArea = Areas[i]; 
    }
}
 DecimalFormat df = new DecimalFormat("0.00");//intancio un objeto de la clase Decimalformat
String maxArea1 = df.format(maxArea);//ypara convertir el double en un string de dos decimales 
System.out.println("El valor máximo en el array 'Areas' es: " + maxArea1 );
    }
    
}
