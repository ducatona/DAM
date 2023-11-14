/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apena
 */
//clase de conexion 1 de las muchas que he probado y la unica que me ha funcionado
public class ConexionBBDD {
    
//configuracion conexion bbdd

    private static ConexionBBDD instance = null;
    private Connection con = null;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String USER;
    private static String PASS;
    static final String BD = "videojuegos";
    static final String IP = "localhost";
    static final String DB_URL = "jdbc:mysql://" + IP + ":3306/" + BD + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    
    
    private ConexionBBDD() throws SQLException {

        try {
            Class.forName(JDBC_DRIVER);
            this.con = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//instancia conexion
    public static ConexionBBDD getInstance() throws SQLException {
        if (instance == null) {

            instance = new ConexionBBDD();

        }
        return instance;
    }

    // getters y setters
    public Connection getConnection() {
        return con;
    }

    public static void setUSER(String USER) {
        ConexionBBDD.USER = USER;
    }

    public static void setPASS(String PASS) {
        ConexionBBDD.PASS = PASS;
    }
//metodo desconexion
    public void desconectar() {

        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
