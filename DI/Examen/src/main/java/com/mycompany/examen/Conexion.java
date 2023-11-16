package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    String BD = "ventas"; // Nombre de tu base de datos
    String URL_BD = "jdbc:mysql://localhost:3306/" + BD; // URL de conexión a la base de datos
    String LOGIN = "root"; // Usuario de tu base de datos
    String PASS = ""; // Contraseña

    public Connection conexion;

    public Conexion() {
    }

    public Connection conexionMySQL() {
        conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // Controlador JDBC de MySQL
            conexion = DriverManager.getConnection(URL_BD, LOGIN, PASS);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.err.println("Error al cargar el driver JDBC. " + ex.toString());
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.err.println("Error de conexión a la BD");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
}

