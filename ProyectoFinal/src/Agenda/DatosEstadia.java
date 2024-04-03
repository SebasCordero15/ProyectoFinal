package Agenda;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DatosEstadia {

    public void insertarReserva(Agendar agend) {

        try {
            Conexion con = new Conexion();

            // //2-creamos el statement\n" +
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
        } catch (Exception e) {
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public ArrayList<Agendar> todosArticulo() {
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
            // Prepare a SQL statement to update the article
            String sql = "UPDATE reserva SET nombre = ?, nombreP = ?, cantidadN = ?, habitacion = ?,  fechaIngreso = ?, fechaSalida = ? WHERE cedula = ?";
            try (PreparedStatement statement = connection.crearPrepareStatement(sql)) {
                // Set the values for the prepared statement

                statement.setString(1, nombre);
                statement.setString(2, nombreP);
                statement.setString(7, cedula);
                statement.setInt(3, cantidadN);
                statement.setString(4, Habitacion);
                statement.setDate(5, new java.sql.Date(fechaIngreso.getTime()));
                statement.setDate(6, new java.sql.Date(fechaSalida.getTime()));

                // Execute the update statement
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            // Handle the exception appropriately
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    public void eliminarReserva(String cedula) throws SQLException {

        try {
            Conexion con = new Conexion();
            String sql ="DELETE FROM reserva WHERE cedula = ?";

            try (PreparedStatement statement = con.crearPrepareStatement(sql)) {
                statement.setString(1, cedula);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
            throw new SQLException("Error al eliminar la reserva", e);
        }
    }
}


