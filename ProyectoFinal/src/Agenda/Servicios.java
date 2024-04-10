/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.sql.Date;

/**
 *
 * @author indir
 */
public class Servicios extends Agendar {
    
    
    private int dogWalking ;
    private String grooming;

    public Servicios( String nombre, String nombreP, String cedula, int cantidadN, String Habitacion, Date fechaIngreso, Date fechaSalida, int dogWalking, String grooming) {
        super(nombre, nombreP, cedula, cantidadN, Habitacion, fechaIngreso, fechaSalida);
        this.dogWalking = dogWalking;
        this.grooming = grooming;
    }

    public Servicios() {
        this.dogWalking = 0;
        this.grooming = "";
    }

    public int getDogWalking() {
        return dogWalking;
    }

    public void setDogWalking(int dogWalking) {
        this.dogWalking = dogWalking;
    }

    public String getGrooming() {
        return grooming;
    }

    public void setGrooming(String grooming) {
        this.grooming = grooming;
    }

    @Override
    public String toString() {
         return super.toString()+
                 
         "Servicios:" +
                 "\n    Cantidad de DogWalking:" + dogWalking +
                 "\n    Servicio de Grooming: " + grooming +"\n";
    }
    
    
    
    
    

   
    
    
    
}
