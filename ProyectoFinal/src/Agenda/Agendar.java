/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author indir
 */
public class Agendar {
    String nombre;
    String nombreP; 
    String telefono;
    int CantidaN;
    private String Habitacion;
    private Date FechaIngreso;
    private Date FechaSalida;

    public Agendar(String nombre, String nombreP, String telefono, int CantidaN, String Habitacion, Date FechaIngreso, Date FechaSalida) {
        this.nombre = nombre;
        this.nombreP = nombreP;
        this.telefono = telefono;
        this.CantidaN = CantidaN;
        this.Habitacion = Habitacion;
        this.FechaIngreso = FechaIngreso;
        this.FechaSalida = FechaSalida;
    }
    
       public Agendar() {
        this.nombre ="" ;
        this.nombreP ="" ;
        this.telefono ="" ;
        this.CantidaN = 0;
        this.Habitacion ="";
        this.FechaIngreso =new Date();
        this.FechaSalida = new Date();
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

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }
    
    

  
 
 
         
}
