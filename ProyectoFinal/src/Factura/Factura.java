/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factura;

import Agenda.Agendar;

/**
 *
 * @author indir
 */
public class Factura extends Agendar {
    private int total;
    private int subtotal;

    public Factura() {
        this.total = 0;
        this.subtotal = 0;
    }

    
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
