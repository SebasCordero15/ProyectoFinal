package Agenda;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

/**
 *
 * @author Usuario
 */
public class Estadia {

    public void insertarEstadia(Habitacion habi) {
        try {
            //1- crear la conexion con la bd
            Conexion con = new Conexion();
            //2-creamos el statement
            PreparedStatement misql = con.crearPrepareStatement("INSERT INTO articulo VALUES(?,?,?)");
            misql.setString(1, habi.getLunes());
            misql.setString(2, habi.getMartes());
            misql.setString(3, habi.getMiercoles());
            misql.setString(4, habi.getJueves());
            misql.setString(5, habi.getViernes());
            misql.setString(6, habi.getSabado());
            misql.setString(7, habi.getDomingo());
            //3-ejecutar el comando sql
            misql.executeUpdate();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(Estadia.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void modificarArticulo(int codigo, String descripcion, float precio) throws SQLException {
        try {
            Conexion connection = new Conexion();
            // Prepare a SQL statement to update the article
            String sql = "UPDATE articulo SET descripcion = ?, precio = ? WHERE codigo = ?";
            try (PreparedStatement statement = connection.crearPrepareStatement(sql)) {
                // Set the values for the prepared statement

                statement.setInt(3, codigo);
                statement.setString(1, descripcion);
                statement.setFloat(2, precio);

                // Execute the update statement
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            // Handle the exception appropriately
            Logger.getLogger(Estadia.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(Estadia.class.getName()).log(Level.SEVERE, null, e);
            // Puedes comentar o descomentar la siguiente línea según tu necesidad
            // throw e; // Re-lanza la excepción para que la maneje la función llamadora
        }
    }

}
