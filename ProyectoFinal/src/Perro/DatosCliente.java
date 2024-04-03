/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perro;

import Agenda.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author indir
 */
public class DatosCliente {

    public void agregarCliente(Perro dog) {
        try {
            //1. conexion
            Conexion con = new Conexion();
            //2. creamos el statement
            PreparedStatement misql = con.crearPrepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            misql.setString(1, dog.getNombre());
            misql.setString(2, dog.getApellido());
            misql.setString(3, dog.getCedula());
            misql.setString(4, dog.getTelefono());
            misql.setString(5, dog.getDireccion());
            misql.setString(6, dog.getCorreo());
            misql.setString(7, dog.getNombreP());
            misql.setInt(8, dog.getEdadP());
            misql.setString(9, dog.getRaza());
            misql.setString(10, dog.getTamaño());
            misql.setString(11, dog.getGenero());
            misql.setString(12, dog.getObservaciones());
            misql.executeUpdate();
            con.cerrarConexion();

        } catch (SQLException e) {
            Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, e);
        }

    }
    public ArrayList<Perro> BuscarCliente(String cedula) {
        ArrayList<Perro> Listclientes = new ArrayList<>();
        try {
            //1- crear la conexion con la bd
           Conexion con = new Conexion();
            //2- crear statement
            PreparedStatement st = con.crearPrepareStatement("SELECT * FROM cliente WHERE cedula like ?");
            cedula = '%' + cedula + '%';
            st.setString(1, cedula);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Perro dog = new Perro(rs.getString("nombre"), rs.getString("apellido"), rs.getString("cedula"),
                        rs.getString("telefono"), rs.getString("direccion"), rs.getString("correo"),
                        rs.getString("nombreP"), rs.getInt("edadP"), rs.getString("raza"), rs.getString("tamaño"),
                        rs.getString("genero"), rs.getString("observaciones"));
                Listclientes.add(dog);
            }
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, e);
        }
        return Listclientes;
    }

    public ArrayList<Perro> todosClientes() {
        ArrayList<Perro> Listclientes = new ArrayList<>();
        try {
            //1- crear la conexion con la bd
            Conexion con = new Conexion();
            //2-creamos el statement
            Statement st = con.crearStatement();
            //3-ejecutar la sentencia
            ResultSet rs = st.executeQuery("SELECT * FROM cliente");
            while (rs.next()) {
                Perro dog = new Perro(rs.getString("nombre"), rs.getString("apellido"), rs.getString("cedula"),
                        rs.getString("telefono"), rs.getString("direccion"), rs.getString("correo"),
                        rs.getString("nombreP"), rs.getInt("edadP"), rs.getString("raza"), rs.getString("tamaño"),
                        rs.getString("genero"), rs.getString("observaciones"));
                Listclientes.add(dog);
            }
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, e);
        }
        return Listclientes;
    }

}
