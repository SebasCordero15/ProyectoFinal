/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

/**
 *
 * @author indir
 */
public class Habitacion {
    private String Nombre;
    private String NombreP;
    private String Lunes;
    private String Martes;
    private String Miercoles;
    private String Jueves;
    private String Viernes;
    private String Sabado;
    private String Domingo;

    public Habitacion(String Nombre, String NombreP, String Lunes, String Martes, String Miercoles, String Jueves, String Viernes, String Sabado, String Domingo) {
        this.Nombre = Nombre;
        this.NombreP = NombreP;
        this.Lunes = Lunes;
        this.Martes = Martes;
        this.Miercoles = Miercoles;
        this.Jueves = Jueves;
        this.Viernes = Viernes;
        this.Sabado = Sabado;
        this.Domingo = Domingo;
    }
      public Habitacion( ) {
        this.Nombre = "";
        this.NombreP =  "";
        this.Lunes =  "";
        this.Martes =  "";
        this.Miercoles =  "";
        this.Jueves =  "";
        this.Viernes =  "";
        this.Sabado =  "";
        this.Domingo =  "";
    }


   

    public String getLunes() {
        return Lunes;
    }

    public void setLunes(String Lunes) {
        this.Lunes = Lunes;
    }

    public String getMartes() {
        return Martes;
    }

    public void setMartes(String Martes) {
        this.Martes = Martes;
    }

    public String getMiercoles() {
        return Miercoles;
    }

    public void setMiercoles(String Miercoles) {
        this.Miercoles = Miercoles;
    }

    public String getJueves() {
        return Jueves;
    }

    public void setJueves(String Jueves) {
        this.Jueves = Jueves;
    }

    public String getViernes() {
        return Viernes;
    }

    public void setViernes(String Viernes) {
        this.Viernes = Viernes;
    }

    public String getSabado() {
        return Sabado;
    }

    public void setSabado(String Sabado) {
        this.Sabado = Sabado;
    }

    public String getDomingo() {
        return Domingo;
    }

    public void setDomingo(String Domingo) {
        this.Domingo = Domingo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }
    
    
}
