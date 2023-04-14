/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;

/**
 *Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),


 * @author BeluS
 */
public class Auto {
    private String nombre;
    private Date carnetvenc;
    private String color;
    private String modelo;
    private int Km=7500;

    public Auto() {
    }

    public Auto(String nombre, Date carnetvenc, String color, String modelo) {
        this.nombre = nombre;
        this.carnetvenc = carnetvenc;
        this.color = color;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getCarnetvenc() {
        return carnetvenc;
    }

    
    

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKm() {
        return Km;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarnetvenc(Date carnetvenc) {
        this.carnetvenc = carnetvenc;
    }

    
    

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKm(int Km) {
        this.Km = Km;
    }

  
    }
    
    
    

