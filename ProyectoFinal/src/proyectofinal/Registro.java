/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author grupo2
 */
public class Registro {

    private String correoE;
    private String nombre;
    private String usuario;
    private String contraseña;
    ArrayList Registros = new ArrayList<String>();

    public Registro(String correoE, String nombre, String usuario, String contraseña) {
        this.correoE = correoE;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.Registros = Registros;
    }

    public Registro() {
        this.correoE = "";
        this.nombre = "";
        this.usuario = "";
        this.contraseña = "";
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Registro{" + "correoE=" + correoE + ", nombre=" + nombre + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

}
