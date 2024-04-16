package Agenda;

import Perro.DatosCliente;
import Perro.Perro;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

/**
 *
 * @author Indira
 */
public class DatosEstadia {

    public void insertarReserva(Agendar agend) {

        try {
            Conexion con = new Conexion();

            PreparedStatement misql = con.crearPrepareStatement("INSERT INTO reserva VALUES(?,?,?,?,?,?,?)");

            misql.setString(1, agend.getNombre());
            misql.setString(2, agend.getNombreP());
            misql.setString(3, agend.getCedula());
            misql.setInt(4, agend.getCantidadN());
            misql.setString(5, agend.getHabitacion());
            misql.setDate(6, agend.getFechaIngreso());
            misql.setDate(7, agend.getFechaSalida());
            misql.executeUpdate();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Agendar> todasEstadias() {
        ArrayList<Agendar> reservaciones = new ArrayList<>();
        try {
            //1- crear la conexion con la bd
            Conexion con = new Conexion();
            //2-creamos el statement
            Statement st = con.crearStatement();
            //3-ejecutar la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM reserva");
            while (rs.next()) {
                Agendar agend = new Agendar(rs.getString("nombre"), rs.getString("nombreP"), rs.getString("cedula"), rs.getInt("cantidadN"),
                        rs.getString("habitacion"), rs.getDate("FechaIngreso"), rs.getDate("FechaSalida"));
                reservaciones.add(agend);
            }
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
        }
        return reservaciones;
    }

    public void modificarReserva(String nombre, String nombreP, String cedula, int cantidadN, String Habitacion, java.sql.Date fechaIngreso, java.sql.Date fechaSalida) throws SQLException {
        try {
            Conexion connection = new Conexion();

            PreparedStatement misql = connection.crearPrepareStatement("UPDATE reserva SET nombre = ?, nombreP = ?, cantidadN = ?, habitacion = ?,  fechaIngreso = ?, fechaSalida = ? WHERE cedula = ?");

            misql.setString(1, nombre);
            misql.setString(2, nombreP);
            misql.setString(7, cedula);
            misql.setInt(3, cantidadN);
            misql.setString(4, Habitacion);
            misql.setDate(5, new java.sql.Date(fechaIngreso.getTime()));
            misql.setDate(6, new java.sql.Date(fechaSalida.getTime()));

            misql.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
      public ArrayList<Agendar> BuscarReserva(String cedula) {
        ArrayList<Agendar> ListaReservas = new ArrayList<>();
        try {
            //1- crear la conexion con la bd
            Conexion con = new Conexion();
            //2- crear statement
            PreparedStatement st = con.crearPrepareStatement("SELECT * FROM reserva WHERE cedula like ?");
            cedula = '%' + cedula + '%';
            st.setString(1, cedula);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Agendar agend = new Agendar(rs.getString("nombre"), rs.getString("nombreP"), rs.getString("cedula"), rs.getInt("cantidadN"),
                        rs.getString("habitacion"), rs.getDate("FechaIngreso"), rs.getDate("FechaSalida"));
               
                ListaReservas.add(agend);
            }
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, e);
        }
        return ListaReservas;
    }

    public void eliminarReserva(String cedula) throws SQLException {
        try {
            Conexion con = new Conexion();
            PreparedStatement misql = con.crearPrepareStatement("DELETE FROM reserva WHERE cedula = ?");
            misql.setString(1, cedula);
            misql.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
