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
 * @author GRUPO2
 */
public class DatosServicios {

    public void insertarServicios(Servicios serv) {

        try {
            //1
            Conexion conexion = new Conexion();
            //2
            PreparedStatement misql = conexion.crearPrepareStatement("INSERT INTO servicio VALUES(?,?,?,?,?,?,?,?,?)");

            misql.setString(1, serv.getNombre());
            misql.setString(2, serv.getNombreP());
            misql.setString(3, serv.getCedula());
            misql.setInt(4, serv.getCantidadN());
            misql.setString(5, serv.getHabitacion());
            misql.setDate(6, serv.getFechaIngreso());
            misql.setDate(7, serv.getFechaSalida());
            misql.setInt(8, serv.getDogWalking());
            misql.setString(9, serv.getGrooming());

            misql.executeUpdate();

            conexion.cerrarConexion();

        } catch (SQLException e) {
            Logger.getLogger(DatosServicios.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public ArrayList<Servicios> todosServicios() {
        ArrayList<Servicios> ListaDservicios = new ArrayList<>();
        try {
            //1- crear la conexion con la bd
            Conexion conexion = new Conexion();
            //2-creamos el statement
            Statement st = conexion.crearStatement();
            //3-ejecutar la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM servicio");
            while (rs.next()) {
                Servicios serv = new Servicios(rs.getString("nombre"), rs.getString("nombreP"), rs.getString("cedula"), rs.getInt("cantidadN"),
                        rs.getString("habitacion"), rs.getDate("FechaIngreso"), rs.getDate("FechaSalida"), rs.getInt("dogWalking"), rs.getString("grooming"));
                ListaDservicios.add(serv);
            }
            rs.close();
            conexion.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosServicios.class.getName()).log(Level.SEVERE, null, e);
        }
        return ListaDservicios;
    }

}
