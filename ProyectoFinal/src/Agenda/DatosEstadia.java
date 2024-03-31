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

 
public void insertarEstadia(Habitacion habitacion) {
    try {
        // 1. Conexión a la base de datos
        Conexion con = new Conexion();

        // 2. Preparar la consulta SQL con marcadores de posición
        String sql = "INSERT INTO reserva (nombre, martes, miercoles, jueves, viernes, sabado, domingo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement misql = con.crearPrepareStatement(sql);

        // 3. Asignar valores booleanos a los marcadores de posición
        misql.setString(1, habitacion.getLunes());
        misql.setString(2, habitacion.getMartes());
        misql.setString(3, habitacion.getMiercoles());
        misql.setString(4, habitacion.getJueves());
        misql.setString(5, habitacion.getViernes());
        misql.setString(6, habitacion.getSabado());
        misql.setString(7, habitacion.getDomingo());

        // 4. Ejecutar la actualización
        misql.executeUpdate();

        // 5. Cerrar la conexión (asumiendo que se maneja en la clase Conexion)
        // con.cerrarConexion(); // Si es necesario, descomenta esta línea

        // 6. Opcional: Actualizar la visualización de la tabla (considerar usar un método separado para mayor claridad)
        // cargarDatos(); // Asumiendo que este método actualiza jtSemana

        JOptionPane.showMessageDialog(null, "Estancia agregada exitosamente!");

    } catch (SQLException e) {
        // Manejar errores potenciales de la base de datos de forma elegante
        Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Error al agregar la estancia: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


 public ArrayList<Habitacion> todosArticulos() {
    ArrayList<Habitacion> habitaciones = new ArrayList<>();
    try {
        // 1. Conectar a la base de datos
        Conexion con = new Conexion();

        // 2. Crear consulta SQL
        String sql = "SELECT lunes, martes, miercoles, jueves, viernes, sabado, domingo FROM habitacion";
        Statement st = con.crearStatement();

        // 3. Ejecutar la consulta
        ResultSet rs = st.executeQuery(sql);

        // 4. Recorrer resultados y crear objetos Habitacion con booleanos
        while (rs.next()) {
            Habitacion habitacion = new Habitacion(
                rs.getString("lunes"),
                rs.getString("martes"),
                rs.getString("miercoles"),
                rs.getString("jueves"),
                rs.getString("viernes"),
                rs.getString("sabado"),
                rs.getString("domingo")
            );
            habitaciones.add(habitacion);
        }

        // 5. Cerrar recursos (ResultSet y conexión)
        rs.close();
        con.cerrarConexion();

    } catch (SQLException e) {
        Logger.getLogger(DatosEstadia.class.getName()).log(Level.SEVERE, null, e);
        // Manejar errores de la base de datos de forma adecuada
    }

    return habitaciones;
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
