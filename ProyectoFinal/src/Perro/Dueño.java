/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perro;

/**
 *
 * @author indir
 */
public class Dueño {

    private String nombre;
    private String apellido;
    private String telefono;
    private String cedula;
    private String direccion;
    private String correo;
    
    
    public Dueño(){
        this. nombre="";
        this.apellido="";
        this.cedula="";
        this.telefono="";
        this.direccion="";
        this.correo="";

    }

    public Dueño(String nombre, String apellido, String cedula, String telefono, String direccion,String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo= correo;
    }

    
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

  

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
      @Override
    public String toString() {
        return """
               \n**********************\n
               Informacion del Dueño
               Nombre=""" + this.getNombre()+ 
                "\nApellido=" + this.getApellido() + 
                "\nTelefono=" + this.getTelefono()+ 
                "\nCedula=" + this.getCedula() + 
                "\nDireccion=" + this.getDireccion() +
                "\nCorreo= "+ this.getCorreo();
    }
    
}
