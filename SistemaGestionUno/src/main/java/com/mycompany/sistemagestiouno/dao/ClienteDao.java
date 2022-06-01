/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiouno.dao;

import com.mycompany.sistemagestionuno.models.Cliente;
import com.mysql.jdbc.StringUtils;
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

        Connection conexion = conectare();

        String sql = " INSERT INTO `clientes` (`id`, `nombre`, `apellido`, "
                + "`email`, `telefono`, `password`) VALUES (NULL, '" + cliente.getNombre() + "', "
                + "'" + cliente.getApellido() + "', '" + cliente.getCorreo() + "',"
                + " '" + cliente.getTelefono() + "','" + cliente.getPass() + "');";

        Statement statement = conexion.createStatement();
        statement.execute(sql);
    }

    public List<Cliente> mostrar() throws SQLException, ClassNotFoundException, InstantiationException {

        Connection conexion = conectare();
        List<Cliente> mostrando = new ArrayList<>();

        String sql = "SELECT * FROM `clientes` ";

        Statement statement = conexion.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        while (resultado.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultado.getString("id"));
            cliente.setNombre(resultado.getString("nombre"));
            cliente.setApellido(resultado.getString("apellido"));
            cliente.setCorreo(resultado.getString("email"));
            cliente.setTelefono(resultado.getString("telefono"));
            cliente.setPass(resultado.getString("password"));
            mostrando.add(cliente);
        }
        return mostrando;

    }

    public void eliminar(String id) throws SQLException, ClassNotFoundException, InstantiationException {
        Connection conexion = conectare();

        String sql = "DELETE FROM clientes WHERE `clientes`.`id` = " + id;

        Statement statement = conexion.createStatement();
        statement.execute(sql);
    }

    public Connection conectare() throws ClassNotFoundException, InstantiationException, SQLException {
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
            conexion = DriverManager.getConnection(conexionUrl, user, password);

        } catch (IllegalAccessException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conexion;
    }

    public void actualizar(Cliente cliente) throws SQLException, ClassNotFoundException, InstantiationException {

        Connection conexion = conectare();

        String sql = "UPDATE `clientes` SET `nombre` = "
                + "'" + cliente.getNombre() + "', "
                + "`apellido` = '" + cliente.getApellido() + "',`email` = "
                + "'" + cliente.getCorreo() + "',`telefono` = "
                + "'" + cliente.getTelefono() + "', `password` = "
                + "'" + cliente.getPass() + "'"
                + " WHERE `clientes`.`id` = " + cliente.getId()+";";

        Statement statement = conexion.createStatement();
        statement.execute(sql);
    }

    public void guardar(Cliente a) throws SQLException, ClassNotFoundException, InstantiationException {
        if(StringUtils.isEmptyOrWhitespaceOnly(a.getId())){
            agregar(a);
        }else{
            actualizar(a);
        }
    }
}
