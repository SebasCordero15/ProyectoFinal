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
    private int cantidadG;
    private int cantidadDW;
    private int ganancias;

    public Factura(String nombre, String nombreP, String cedula, int cantidadN, String Habitacion, Date fechaIngreso, Date fechaSalida, int dogWalking, String grooming, int numfactura, int totalEstadia, int totalDogWalking, int totalGromming, int Montototal) {
        super(nombre, nombreP, cedula, cantidadN, Habitacion, fechaIngreso, fechaSalida, dogWalking, grooming);
        this.numfactura = numfactura;
        this.totalEstadia = totalEstadia;
        this.totalDogWalking = totalDogWalking;
        this.totalGromming = totalGromming;
        this.Montototal = Montototal;
        this.ganancias = ganancias;
        this.cantidadG = cantidadG;
        this.cantidadDW = cantidadDW;

    }

    public Factura() {
        this.numfactura = 0;
        this.totalEstadia = 0;
        this.totalDogWalking = 0;
        this.totalGromming = 0;
        this.Montototal = 0;
        this.ganancias = 0;
        this.cantidadG = 0;
        this.cantidadDW = 0;
    }

    public String toString() {
        return super.toString()
                + "Factura"
                + "\n Subtotal Estadia: " + totalEstadia
                + "\n Subtotal DogWalking: " + totalDogWalking
                + "\n Subtotal Gromming: " + totalGromming
                + "\n Monto Total: " + Montototal + "\n";
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

    public void setNumfactura(String text) {
        this.numfactura++;
    }

    public int getCantidadG() {
        return cantidadG;
    }

    public void setCantidadG() {
        this.cantidadG++;
    }

    public int getCantidadDW() {
        return cantidadDW;
    }

    public void setCantidadDW() {
        this.cantidadDW++;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias() {
        this.ganancias++;
    }

    public void realizarConteo(String g) {
        if (g.equalsIgnoreCase("SI")) {
            this.cantidadG++;
        }
        this.cantidadDW++;
    }

    public void realizarConteoD(int dw) {
        dw = this.cantidadDW++;
    }

    public void realizarConteoGanancias(int mt) {
        this.ganancias += mt;
    }

    public String verEstadistica() {
        return "\nCantidad Grooming: " + this.cantidadG
                + "\n Cantida de DogWalking: " + this.cantidadDW
                + "\n El hotel a generado: " + this.ganancias;
    }

}
