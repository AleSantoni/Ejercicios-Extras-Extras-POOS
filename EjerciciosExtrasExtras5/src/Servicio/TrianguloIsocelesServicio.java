/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.TrianguloIsoceles;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superfici
 * @author BeluS
 */
public class TrianguloIsocelesServicio {
    
    public TrianguloIsoceles CargarTriangulo() {
        Scanner leer = new Scanner(System.in);
        TrianguloIsoceles Tr1 = new TrianguloIsoceles();
        System.out.println("Ingrese la base");
        Tr1.setBase(leer.nextDouble());
        System.out.println("Ingrese el valor del lado");
        Tr1.setLado(leer.nextDouble());

        return Tr1;
    }

    public double CalcularArea(TrianguloIsoceles Tr1) {
        double area;
        double H = Math.sqrt(Math.pow(Tr1.getLado(), 2) - Math.pow(Tr1.getBase()/2, 2));
        
         area = (Tr1.getBase() * H) / 2;
         DecimalFormat df = new DecimalFormat("0.00");

    // Formatear el número con dos decimales y guardarlo en una cadena
    String perimetroFormateado = df.format(area);

        System.out.println("Area" + perimetroFormateado);
        return area;
    }

    public void CalcularPerimetro(TrianguloIsoceles Tr1) {
        double perimetro;
        perimetro = Tr1.getBase() + 2 * Tr1.getLado();
        System.out.println("Perimetro" + perimetro);
    }
   
}
    
    
