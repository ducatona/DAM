/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




/**
 *
 * @author Usuario
 */
public class OperacionesBD {
    
  
    




    public static void listarNombreProductos(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT nombre FROM producto");
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                System.out.println(nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void listarNombresYPreciosProductos(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT nombre, precio FROM producto");
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                double precio = resultSet.getDouble("precio");
                System.out.println("Nombre: " + nombre + ", Precio: " + precio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void listarTodasColumnasProducto(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM producto");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                double precio = resultSet.getDouble("precio");
                int idFabricante = resultSet.getInt("id_fabricante");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio + ", ID Fabricante: " + idFabricante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}


