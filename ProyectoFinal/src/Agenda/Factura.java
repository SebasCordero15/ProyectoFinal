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
public class Factura extends Servicios {
private int numfactura;
    private int totalEstadia;
   private int totalDogWalking;
    private int totalGromming;
    private int Montototal;

    public Factura( String nombre, String nombreP, String cedula, int cantidadN, String Habitacion, Date fechaIngreso, Date fechaSalida, int dogWalking, String grooming, int numfactura, int totalEstadia, int totalDogWalking, int totalGromming, int Montototal) {
        super(nombre, nombreP, cedula, cantidadN, Habitacion, fechaIngreso, fechaSalida, dogWalking, grooming);
        this.numfactura = numfactura;
        this.totalEstadia = totalEstadia;
        this.totalDogWalking = totalDogWalking;
        this.totalGromming = totalGromming;
        this.Montototal = Montototal;
    }

    public Factura() {
        this.numfactura = 0;
        this.totalEstadia = 0;
        this.totalDogWalking = 0;
        this.totalGromming = 0;
        this.Montototal = 0;
    }

    
   
    
    
    
    
    
    

  
    public String i() {
        return super.toString()+
         "Factura" +
                "\n Subtotal Estadia: " + totalEstadia +
                "\n Subtotal DogWalking: " + totalDogWalking +
                "\n Subtotal Gromming: " + totalGromming +
                "\n Monto Total: " + Montototal + "\n";
                }

    public int getTotalEstadia() {
        return totalEstadia;
    }

    public void setTotalEstadia(int totalEstadia) {
        this.totalEstadia = totalEstadia;
    }

    public int getTotalDogWalking() {
        return totalDogWalking;
    }

    public void setTotalDogWalking(int totalDogWalking) {
        this.totalDogWalking = totalDogWalking;
    }

    public int getTotalGromming() {
        return totalGromming;
    }

    public void setTotalGromming(int totalGromming) {
        this.totalGromming = totalGromming;
    }

    public int getMontototal() {
        return Montototal;
    }

    public void setMontototal(int Montototal) {
        this.Montototal = Montototal;
    }

    public int getNumfactura() {
        return numfactura;
    }

    public void setNumfactura(int numfactura) {
        this.numfactura = numfactura;
    }

}
