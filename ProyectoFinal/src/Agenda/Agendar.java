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

    private String nombre;
    private String nombreP;
    private String cedula;
    private int cantidadN;
    private String Habitacion;
    private java.sql.Date fechaIngreso;
    private java.sql.Date fechaSalida;

    public Agendar(String nombre, String nombreP, String cedula, int cantidadN, String Habitacion, java.sql.Date fechaIngreso, java.sql.Date fechaSalida) {
        this.nombre = nombre;
        this.nombreP = nombreP;
        this.cedula = cedula;
        this.cantidadN = cantidadN;
        this.Habitacion = Habitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

   
    public Agendar() {
        this.nombre = "";
        this.nombreP = "";
        this.cedula = "";
        this.cantidadN = 0;
        this.Habitacion = "";
        this.fechaIngreso = null;
        this.fechaSalida = null;
    }

    
    
    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }

  

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getCantidadN() {
        return cantidadN;
    }

    public void setCantidadN(int cantidadN) {
        this.cantidadN = cantidadN;
    }

    public java.sql.Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(java.sql.Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public java.sql.Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(java.sql.Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

}
