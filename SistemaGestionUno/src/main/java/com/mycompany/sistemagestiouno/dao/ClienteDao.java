/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiouno.dao;

import com.mycompany.sistemagestionuno.models.Cliente;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarco
 */
public class ClienteDao {

    public void agregar(Cliente cliente) throws SQLException, ClassNotFoundException, InstantiationException {
        String bd = "java";
        String user = "root";
        String password = "";
        String hosting = "localhost";
        String port = "3306";
        String driver = "com.mysql.jdbc.Driver";
        String conexionUrl = "jdbc:mysql://" + hosting + ":" + port + "/" + bd + "?useSSL=false";

        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexion = DriverManager.getConnection(conexionUrl, user, password);

        String sql = " INSERT INTO `clientes` (`id`, `nombre`, `apellido`, "
                + "`email`, `telefono`, `password`) VALUES (NULL, '" + cliente.getNombre() + "', "
                + "'" + cliente.getApellido() + "', '" + cliente.getCorreo() + "',"
                + " '" + cliente.getTelefono() + "','" + cliente.getPass() + "');";

        Statement statement = conexion.createStatement();
        statement.execute(sql);
    }

    public List<Cliente> mostrar() throws SQLException, ClassNotFoundException, InstantiationException {
        String bd = "java";
        String user = "root";
        String password = "";
        String hosting = "localhost";
        String port = "3306";
        String driver = "com.mysql.jdbc.Driver";
        String conexionUrl = "jdbc:mysql://" + hosting + ":" + port + "/" + bd + "?useSSL=false";

        Connection conexion = null;

        List<Cliente> mostrando = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexion = DriverManager.getConnection(conexionUrl, user, password);

        String sql = "SELECT * FROM `clientes` ";

        Statement statement = conexion.createStatement();
        ResultSet resultado = statement.executeQuery(sql);
        
        while (resultado.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultado.getString("nombre"));
            cliente.setNombre(resultado.getString("nombre"));
            cliente.setApellido(resultado.getString("apellido"));
            cliente.setCorreo(resultado.getString("email"));
            cliente.setTelefono(resultado.getString("telefono"));
            cliente.setPass(resultado.getString("password"));
            mostrando.add(cliente);
        }
        return mostrando;

    }

}
