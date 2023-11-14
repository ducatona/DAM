package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 * Clase para rgestionar la conexion a la BBDDD
 *
 * @author CafeConPalito
 */
public class Conexion {

    //Datos necesarios para configurar la conexión a la base de datos
    private static Conexion instance = null;
    private Connection con = null;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // esto por lo que entiendo utiliza el driver que bajamos (el jar)
    private static String USER;
    private static String PASS;
    static final String BD = "videojuegos"; // nombre de la base de datos
    //la direccion para conectar a la bbdd se le pasa como parametro "BD"

    //IP PARA TRABAJAR EN EL SERVER
    //static final String IP = "192.168.24.16";
    //IP PARA TRABAJAR EN LOCAL
    //static final String IP = "127.0.0.1";
    static final String IP = "localhost";

    //Todos los parametros para conectar a la BBDD
    static final String DB_URL = "jdbc:mysql://" + IP + ":3306/" + BD + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private Conexion() throws SQLException {

        try {
            Class.forName(JDBC_DRIVER);
            this.con = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Conexion getInstance() throws SQLException {
        if (instance == null) {

            instance = new Conexion();

        }
        return instance;
    }

    public Connection getConnection() {
        return con;
    }

    public static void setUSER(String USER) {
        Conexion.USER = USER;
    }

    public static void setPASS(String PASS) {
        Conexion.PASS = PASS;
    }

    /**
     * Metodo para desconectar la BBDD
     */
    public void desconectar() {

        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
