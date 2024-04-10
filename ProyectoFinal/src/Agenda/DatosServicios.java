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
 * @author indir
 */
public class DatosServicios {

    public void insertarServicios(Servicios serv) {

        try {
            Conexion con = new Conexion();
            // //2-creamos el statement\n" +
            PreparedStatement misql = con.crearPrepareStatement("INSERT INTO servicio VALUES(?,?,?,?,?,?,?,?,?)");

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
            con.cerrarConexion();
        } catch (Exception e) {
            Logger.getLogger(DatosServicios.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public ArrayList<Servicios> todosArticulo() {
        ArrayList<Servicios> ListaDservicios = new ArrayList<>();
        try {
            //1- crear la conexion con la bd
            Conexion con = new Conexion();
            //2-creamos el statement
            Statement st = con.crearStatement();
            //3-ejecutar la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM servicio");
            while (rs.next()) {
                Servicios serv = new Servicios(rs.getString("nombre"), rs.getString("nombreP"), rs.getString("cedula"), rs.getInt("cantidadN"),
                        rs.getString("habitacion"), rs.getDate("FechaIngreso"), rs.getDate("FechaSalida"), rs.getInt("dogWalking"), rs.getString("grooming"));
                ListaDservicios.add(serv);
            }
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosServicios.class.getName()).log(Level.SEVERE, null, e);
        }
        return ListaDservicios;
    }

    public void modificarServicio(String nombre, String nombreP, String cedula, int cantidadN, String Habitacion, java.sql.Date fechaIngreso, java.sql.Date fechaSalida, int cantidadDW, String grooming) throws SQLException {
        try {
            Conexion connection = new Conexion();
            // Prepare a SQL statement to update the article
            String sql = "UPDATE servicio SET nombre = ?, nombreP = ?, cantidadN = ?, habitacion = ?,  fechaIngreso = ?, fechaSalida = ?, dogWalking=?, grooming=? WHERE cedula = ?";
            try (PreparedStatement statement = connection.crearPrepareStatement(sql)) {
                // Set the values for the prepared statement

                statement.setString(1, nombre);
                statement.setString(2, nombreP);
                statement.setString(9, cedula);
                statement.setInt(3, cantidadN);
                statement.setString(4, Habitacion);
                statement.setDate(5, new java.sql.Date(fechaIngreso.getTime()));
                statement.setDate(6, new java.sql.Date(fechaSalida.getTime()));
                statement.setInt(7, cantidadDW);
                statement.setString(8, grooming);

                statement.executeUpdate();
            }
        } catch (SQLException e) {

            Logger.getLogger(DatosServicios.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    public void eliminarReserva(String cedula) throws SQLException {

        try {
            Conexion con = new Conexion();
            String sql = "DELETE FROM servicio WHERE cedula = ?";

            try (PreparedStatement statement = con.crearPrepareStatement(sql)) {
                statement.setString(1, cedula);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            Logger.getLogger(DatosServicios.class.getName()).log(Level.SEVERE, null, e);
            throw new SQLException("Error al eliminar la reserva", e);
        }
    }

}
