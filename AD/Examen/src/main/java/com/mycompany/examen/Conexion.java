

package com.mycompany.examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private static final String BD = "tienda"; // Nombre de tu base de datos
    private static final String URL_BD = "jdbc:mysql://localhost:3306/" + BD; // URL de conexión a la base de datos
    private static final String LOGIN = "root"; // Usuario de tu base de datos
    private static final String PASS = "1234"; // Contraseña

    private Connection conexion;

    public Conexion() {
        establecerConexion();
    }

    private void establecerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // Controlador JDBC de MySQL
            conexion = DriverManager.getConnection(URL_BD, LOGIN, PASS);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            System.err.println("Error al establecer la conexión a la BD. " + ex.toString());
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection obtenerConexion() {
        return conexion;
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión a la BD. " + e.toString());
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}