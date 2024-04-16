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
 * @author indir
 */
public class DatosProductos {
     public void insertarCompra(Productos prod) {

        try {
            Conexion con = new Conexion();

            PreparedStatement misql = con.crearPrepareStatement("INSERT INTO usuarios VALUES(?,?,?,?,?,?,?,?)");

            misql.setString(1, prod.getCorreoE());
            misql.setString(2, prod.getNombre());
            misql.setString(3, prod.getUsuario());
            misql.setString(4, prod.getContraseña());
            misql.setInt(5, prod.cantidadKit1);
             misql.setInt(6, prod.cantidadKitGrooming);
              misql.setInt(7, prod.cantidadCorrea);
               misql.setInt(8, prod.cantidadKit2);
            misql.executeUpdate();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosUsuarios.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Registro> todosUsuarios() {
        ArrayList<Registro> ListaUsuarios = new ArrayList<>();
        try {
            //1- crear la conexion con la bd
            Conexion con = new Conexion();
            //2-creamos el statement
            Statement st = con.crearStatement();
            //3-ejecutar la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM usuarios");
            while (rs.next()) {
                Registro regis = new Registro(rs.getString("correo"), rs.getString("nombre"), rs.getString("usuario"), rs.getString("contraseña"));
                ListaUsuarios.add(regis);
            }
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosUsuarios.class.getName()).log(Level.SEVERE, null, e);
        }
        return ListaUsuarios;
    } 
}
