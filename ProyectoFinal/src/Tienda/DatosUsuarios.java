/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

import proyectofinal.Registro;
import Agenda.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

/**
 *
 * @author grupo2
 */
public class DatosUsuarios {

    public void insertarRegistro(Registro regis) {
        try {
            Conexion conexion = new Conexion();

            PreparedStatement misql = conexion.crearPrepareStatement("INSERT INTO usuarios VALUES(?,?,?,?)");

            misql.setString(1, regis.getCorreoE());
            misql.setString(2, regis.getNombre());
            misql.setString(3, regis.getUsuario());
            misql.setString(4, regis.getContraseña());

            misql.executeUpdate();
            conexion.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosUsuarios.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Registro> todosUsuarios() {
        ArrayList<Registro> ListaUsuarios = new ArrayList<>();
        try {
            //1- crear la conexion con la bd
            Conexion conexion = new Conexion();
            //2-creamos el statement
            Statement st = conexion.crearStatement();
            //3-ejecutar la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM usuarios");
            while (rs.next()) {
                Registro regis = new Registro(rs.getString("correo"), rs.getString("nombre"), rs.getString("usuario"), rs.getString("contraseña"));
                ListaUsuarios.add(regis);
            }
            rs.close();
            conexion.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosUsuarios.class.getName()).log(Level.SEVERE, null, e);
        }
        return ListaUsuarios;
    }

    public boolean Verificar(String usuario, String contraseña) {

        try {
            Conexion conexion = new Conexion();
            Statement st = conexion.crearStatement();

            PreparedStatement msql = conexion.crearPrepareStatement("SELECT * FROM usuarios WHERE usuario=? AND contraseña = ?");
            msql.setString(1, usuario);
            msql.setString(2, contraseña);
            ResultSet rs = msql.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            Logger.getLogger(DatosUsuarios.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

}
