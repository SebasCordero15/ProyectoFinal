/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perro;

/**
 *
 * @author indir
 */
public class Perro extends Dueño {
    private String nombreP;
    private int edadP;
    private String raza;
    private String tamaño;
    private String genero;
    private String observaciones;

    public Perro() {
        this.nombreP = "";
        this.edadP = 0;
        this.observaciones = "";
    }

    public Perro( String nombre, String apellido, String cedula, String telefono, String direccion,String correo,String nombreP, int edadP, String raza, String tamaño, String genero, String observaciones) {
        super(nombre, apellido, cedula, telefono, direccion,correo);
        this.nombreP = nombreP;
        this.edadP = edadP;
        this.raza = raza;
        this.tamaño = tamaño;
        this.genero = genero;
        this.observaciones = observaciones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getEdadP() {
        return edadP;
    }

    public void setEdadP(int edadP) {
        this.edadP = edadP;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                """
               **Informacion del Perro**
               NombreP=""" + nombreP +
                "\nEdadP=" + edadP +
                "\nRaza=" + raza + 
                "\nTamannio=" + tamaño + 
                "\nGenero=" + genero +
                "\nObservaciones=" + observaciones ;
    }
    
    
    
    
    
}
