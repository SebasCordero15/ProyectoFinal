/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

/**
 *
 * @author grupo2
 */
public class DatosFactura {

    public void insertarFactura(Factura fact) {

        try {

            Conexion con = new Conexion();

            PreparedStatement misql = con.crearPrepareStatement("INSERT INTO factura VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            misql.setString(1, fact.getNombre());
            misql.setString(2, fact.getNombreP());
            misql.setString(3, fact.getCedula());
            misql.setInt(4, fact.getCantidadN());
            misql.setString(5, fact.getHabitacion());
            misql.setDate(6, fact.getFechaIngreso());
            misql.setDate(7, fact.getFechaSalida());
            misql.setInt(8, fact.getDogWalking());
            misql.setString(9, fact.getGrooming());
            misql.setInt(10, fact.getNumfactura());
            misql.setInt(11, fact.getTotalEstadia());
            misql.setInt(12, fact.getTotalDogWalking());
            misql.setInt(13, fact.getTotalGromming());
            misql.setInt(14, fact.getMontototal());
            misql.executeUpdate();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosFactura.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Factura> todasFacturas() {
        ArrayList<Factura> ListaDfacturas = new ArrayList<>();
        try {
            //1- crear la conexion con la bd
            Conexion con = new Conexion();
            //2-creamos el statement
            Statement st = con.crearStatement();
            //3-ejecutar la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM factura");
            while (rs.next()) {
                Factura fac = new Factura(
                        rs.getString("nombre"),
                        rs.getString("nombreP"),
                        rs.getString("cedula"),
                        rs.getInt("cantidadN"),
                        rs.getString("habitacion"),
                        rs.getDate("FechaIngreso"),
                        rs.getDate("FechaSalida"),
                        rs.getInt("dogWalking"),
                        rs.getString("grooming"),
                        rs.getInt("numfactura"),
                        rs.getInt("totalEstadia"),
                        rs.getInt("totalDogWalking"),
                        rs.getInt("totalGromming"),
                        rs.getInt("MontTotal"));
                ListaDfacturas.add(fac);
            }
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosServicios.class.getName()).log(Level.SEVERE, null, e);
        }
        return ListaDfacturas;
    }

    public void ConteoGrooming(Factura f) {
        try {
            Conexion con = new Conexion();
            Statement st = con.crearStatement(); //para consultar en la base de datos
            ResultSet rs = st.executeQuery("SELECT grooming FROM factura");
            while (rs.next()) {
                String g = rs.getString("grooming");
                f.realizarConteo(g);
            }
        } catch (SQLException e) {
            Logger.getLogger(DatosFactura.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void ConteoDog(Factura f) {
        try {
            Conexion con = new Conexion();
            Statement st = con.crearStatement(); //para consultar en la base de datos
            ResultSet rs = st.executeQuery("SELECT dogWalking FROM factura");
            while (rs.next()) {
                int dw = rs.getInt("dogWalking");
                f.realizarConteoD(dw);
            }
        } catch (SQLException e) {
            Logger.getLogger(DatosFactura.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void ConteoGanancias(Factura f) {
        try {
            Conexion con = new Conexion();
            Statement st = con.crearStatement(); //para consultar en la base de datos
            ResultSet rs = st.executeQuery("SELECT MontTotal FROM factura");
            while (rs.next()) {
                int mt = rs.getInt("MontTotal");
                f.realizarConteoGanancias(mt);
            }
        } catch (SQLException e) {
            Logger.getLogger(DatosFactura.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
