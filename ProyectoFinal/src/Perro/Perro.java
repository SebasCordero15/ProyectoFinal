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
    private int cantHembras;
    private int cantMachos;

    public Perro() {
        this.nombreP = "";
        this.edadP = 0;
        this.observaciones = "";
        this.cantHembras = 0;
        this.cantMachos = 0;
    }

    public Perro(String nombre, String apellido, String cedula, String telefono, String direccion, String correo, String nombreP, int edadP, String raza, String tamaño, String genero, String observaciones) {
        super(nombre, apellido, cedula, telefono, direccion, correo);
        this.nombreP = nombreP;
        this.edadP = edadP;
        this.raza = raza;
        this.tamaño = tamaño;
        this.genero = genero;
        this.observaciones = observaciones;
        this.cantHembras = cantHembras;
        this.cantMachos = cantMachos;
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

    public int getCantHembras() {
        return cantHembras;
    }

    public void setCantHembras() {
        this.cantHembras++;
    }

    public int getCantMachos() {
        return cantMachos;
    }

    public void setCantMachos() {
        this.cantMachos++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + """
               **Informacion del Perro**
               NombreP=""" + nombreP
                + "\nEdadP=" + edadP
                + "\nRaza=" + raza
                + "\nTamannio=" + tamaño
                + "\nGenero=" + genero
                + "\nObservaciones=" + observaciones;
    }

     public String verEstadistica(){
        Perro p=new Perro();
       return "Cantidad de hembras: " + this.getCantHembras()
                + "\nCantidad de machos: " + this.getCantMachos();
     }
    public void realizarConteo(String sexo) {
        if (sexo.contentEquals("M")) {
            this.setCantMachos();
        } else {
            this.setCantHembras();
        }
    }
}
