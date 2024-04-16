/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

import proyectofinal.Registro;

/**
 *
 * @author indir
 */
public class Productos extends Registro {
    int cantidadKit1;
      int cantidadKitGrooming;
        int cantidadCorrea;
          int cantidadKit2;

    public Productos(String correoE, String nombre, String usuario, String contraseña,int cantidadKit1, int cantidadKitGrooming, int cantidadCorrea, int cantidadKit2) {
        super(correoE, nombre, usuario, contraseña);
        this.cantidadKit1 = cantidadKit1;
        this.cantidadKitGrooming = cantidadKitGrooming;
        this.cantidadCorrea = cantidadCorrea;
        this.cantidadKit2 = cantidadKit2;
    }

    public Productos() {
        this.cantidadKit1 = 0;
        this.cantidadKitGrooming = 0;
        this.cantidadCorrea = 0;
        this.cantidadKit2 = 0;
    }

    public int getCantidadKit1() {
        return cantidadKit1;
    }

    public void setCantidadKit1(int cantidadKit1) {
        this.cantidadKit1 = cantidadKit1;
    }

    public int getCantidadKitGrooming() {
        return cantidadKitGrooming;
    }

    public void setCantidadKitGrooming(int cantidadKitGrooming) {
        this.cantidadKitGrooming = cantidadKitGrooming;
    }

    public int getCantidadCorrea() {
        return cantidadCorrea;
    }

    public void setCantidadCorrea(int cantidadCorrea) {
        this.cantidadCorrea = cantidadCorrea;
    }

    public int getCantidadKit2() {
        return cantidadKit2;
    }

    public void setCantidadKit2(int cantidadKit2) {
        this.cantidadKit2 = cantidadKit2;
    }

    @Override
    public String toString() {
        return  super.toString()+"Productos" + 
                "CantidadKit1= " + cantidadKit1 +
                "CantidadKitGrooming= " + cantidadKitGrooming +
                "CantidadCorreo= " + cantidadCorrea +
                "CantidadKit2= " + cantidadKit2 ;
    }
    
    
    
    
          
          
    
    
}


