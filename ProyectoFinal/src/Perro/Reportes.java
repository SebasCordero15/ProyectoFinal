/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perro;

/**
 *
 * @author indir
 */
public class Reportes {
    private int cantHembras;
    private int cantMachos;
    private int cantEstadias;
    private int cantDogWalking;
    private int cantGrooming;
    private int gananciaTotal;
    
    public Reportes(){
        this.cantHembras = 0;
        this.cantMachos = 0;
        this.cantEstadias = 0;
        this.cantDogWalking = 0;
        this.cantGrooming = 0;
        this.gananciaTotal = 0;
    }

    public Reportes(int cantHembras, int cantMachos, int cantEstadias, int cantDogWalking, int cantGrooming, int gananciaTotal) {
        this.cantHembras = cantHembras;
        this.cantMachos = cantMachos;
        this.cantEstadias = cantEstadias;
        this.cantDogWalking = cantDogWalking;
        this.cantGrooming = cantGrooming;
        this.gananciaTotal = gananciaTotal;
    }
    
    

    public int getCantHembras() {
        return cantHembras;
    }

    public void setCantHembras(int cantHembras) {
        this.cantHembras++;
    }

    public int getCantMachos() {
        return cantMachos;
    }

    public void setCantMachos(int cantMachos) {
        this.cantMachos++;
    }

    public int getCantEstadias() {
        return cantEstadias;
    }

    public void setCantEstadias(int cantEstadias) {
        this.cantEstadias++;
    }

    public int getCantDogWalking() {
        return cantDogWalking;
    }

    public void setCantDogWalking(int cantDogWalking) {
        this.cantDogWalking++;
    }

    public int getCantGrooming() {
        return cantGrooming;
    }

    public void setCantGrooming(int cantGrooming) {
        this.cantGrooming++;
    }

    public int getGananciaTotal() {
        return gananciaTotal;
    }

    public void setGananciaTotal(int gananciaTotal) {
        this.gananciaTotal++;
    }
    
    public String verReporte(){
        return "Cantidad de hembras: " + this.getCantHembras()
                + "\nCantidad de machos: " + this.getCantMachos()
                + "\nCantidad total de estadias: " + this.getCantEstadias()
                + "\nCantidad total DogWalking: " + this.getCantDogWalking()
                + "\nCantidad total de Grooming: " + this.getCantGrooming()
                + "\nGanancias totales: " + this.getGananciaTotal();
    }
    
    
}
