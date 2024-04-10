/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author indir
 */
public class Conexion {
     public static final String url = "jdbc:mysql://localhost:3306/hotel";
    public static final String user = "root";
    public static final String pass = "";
    public Connection conexion = null;

    public Conexion() {
        com.mysql.jdbc.Connection con = null;
        try {
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión con la BD exitosa");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public PreparedStatement crearPrepareStatement(String sql) throws SQLException {
        return conexion.prepareStatement(sql);
    }

    public Statement crearStatement() throws SQLException {
        return conexion.createStatement();
    }

    public Connection cerrarConexion() {
        try {
            conexion.close();
            System.out.println("Cerrando la conexion don la base de datos " + url + "...OK");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        conexion = null;
        return conexion;
    }
}
