/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.util.logging.Logger;

/**
 *
 * @author indir
 */
public class Agendar {
 String nombre;
 String telefono;
 String nombreP;
  int CantidaN;
 String dogWalking;
  int catidadDw;
 String Grooming;


    public Agendar() {
        this.nombre = "";
        this.telefono = "";
        this.nombreP = "";
        this.CantidaN = 0;
        this.dogWalking = "";
        this.catidadDw = 0;
        this.Grooming = "";
        
    }

    public Agendar(String nombre, String telefono, String nombreP, int CantidaN, String dogWalking, int catidadDw, String Grooming) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.nombreP = nombreP;
        this.CantidaN = CantidaN;
        this.dogWalking = dogWalking;
        this.catidadDw = catidadDw;
        this.Grooming = Grooming;
    }
   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getCantidaN() {
        return CantidaN;
    }

    public void setCantidaN(int CantidaN) {
        this.CantidaN = CantidaN;
    }

    public String getDogWalking() {
        return dogWalking;
    }

    public void setDogWalking(String dogWalking) {
        this.dogWalking = dogWalking;
    }

    public String getGrooming() {
        return Grooming;
    }

    public void setGrooming(String Grooming) {
        this.Grooming = Grooming;
    }

    public int getCatidadDw() {
        return catidadDw;
    }

    public void setCatidadDw(int catidadDw) {
        this.catidadDw = catidadDw;
    }

    @Override
    public String toString() {
        return "-------Estadia--------" + 
                "\nNombre del encargado= " + nombre + 
                "\nTelefono= " + telefono + 
                "\nNombre del Perro= " + nombreP + 
                "\nCantida de Noches= " + CantidaN + 
                "\nDogWalking= " + dogWalking + "por " + catidadDw+" dias"+
                "\nGrooming= " + Grooming ;
    }
    
    

  
 
 
         
}
