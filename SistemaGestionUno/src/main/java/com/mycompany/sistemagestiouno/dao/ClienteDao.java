/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiouno.dao;

import com.mycompany.sistemagestionuno.models.Cliente;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
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
        
       String sql =" INSERT INTO `clientes` (`id`, `nombre`, `apellido`, "
               + "`email`, `telefono`, `password`) VALUES (NULL, '"+ cliente.getNombre() +"', "
               + "'"+ cliente.getApellido() +"', '"+ cliente.getCorreo() +"',"
               + " '"+ cliente.getTelefono() +"','"+ cliente.getPass()+"');";
       
       
       Statement statement = conexion.createStatement();
       statement.execute(sql);
    }
}
