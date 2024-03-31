package Agenda;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

/**
 *
 * @author Usuario
 */
public class DatosEstadia {

    public void insertarEstadia(Habitacion habi) {
        try {
            //1- crear la conexion con la bd
            Conexion con = new Conexion();
            //2-creamos el statement
            PreparedStatement misql = con.crearPrepareStatement("INSERT INTO articulo VALUES(?,?,?)");
            misql.setString(0, habi.getLunes());
            misql.setString(1, habi.getMartes());
            misql.setString(2, habi.getMiercoles());
            misql.setString(3, habi.getJueves());
            misql.setString(4, habi.getViernes());
            misql.setString(5, habi.getSabado());
            misql.setString(6, habi.getDomingo());
            //3-ejecutar el comando sql
            misql.executeUpdate();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Habitacion> todosArticulo() {
        ArrayList<Habitacion> Semana = new ArrayList<>();
        try {
            //1- crear la conexion con la bd
            Conexion con = new Conexion();
            //2-creamos el statement
            Statement st = con.crearStatement();
            //3-ejecutar la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM habitacion");
            while (rs.next()) {
                Habitacion habi = new Habitacion(
                        rs.getString("lunes"),
                        rs.getString("martes"),
                        rs.getString("miercoles"),
                        rs.getString("jueves"),
                        rs.getString("viernes"),
                        rs.getString("sabado"),
                        rs.getString("domingo"));
                Semana.add(habi);
            }
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
        }
        return Semana;
    }

    
   
    
    public void modificarArticulo(String lunes, String martes, String miercoles, String jueves, String viernes, String sabado, String domingo) throws SQLException {
        try {
            Conexion connection = new Conexion();
            // Prepare a SQL statement to update the article
            String sql = "UPDATE articulo SET lunes = ?, martes = ?  miercoles = ?,jueves = ?, viernes = ? ,sabado = ?,domingo = ?";
            try (PreparedStatement statement = connection.crearPrepareStatement(sql)) {
                // Set the values for the prepared statement

                statement.setString(1, lunes);
                statement.setString(1, martes);
                statement.setString(1, miercoles);
                statement.setString(1, jueves);
                statement.setString(1, viernes);
                statement.setString(1, sabado);
                statement.setString(1, domingo);

                // Execute the update statement
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            // Handle the exception appropriately
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
            //throw e; // Re-throwing the exception for the caller to handle
        }

    }

    public void eliminarArticulo(int codigo) throws SQLException {

        // Intenta conectarse a la base de datos
        try {
            Conexion connection = new Conexion();
            // Prepara una consulta SQL para eliminar el artículo
            String sql = "DELETE FROM articulo WHERE codigo = ?";

            // Crea una declaración preparada usando la conexión y la consulta SQL
            try (PreparedStatement statement = connection.crearPrepareStatement(sql)) {

                // Establece el valor del código en la declaración preparada
                statement.setInt(1, codigo);  // 1 porque es el primer parámetro (?)

                // Ejecuta la consulta de eliminación
                statement.executeUpdate();

            }
        } catch (SQLException e) {
            // Maneja la excepción de forma adecuada (por ejemplo, registrando el error)
            Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
            // Puedes comentar o descomentar la siguiente línea según tu necesidad
            // throw e; // Re-lanza la excepción para que la maneje la función llamadora
        }
    }

}
