package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Conexion;


public class Modelo {

    public static ArrayList<String[]> juego() {

        ArrayList<String[]> lista = new ArrayList<>();
        Connection con;

        PreparedStatement ps = null;
        ResultSet rs = null;

        String select = "select * from juegos";

        try {
            con = Conexion.getInstance().getConnection();

            ps = con.prepareStatement(select);

            rs = ps.executeQuery();

        
            while (rs.next()) {
                String[] e = {rs.getString(1), rs.getString(2), rs.getString(3)};
                lista.add(e);
               
            }

        } catch (NumberFormatException e) {
            System.err.println("Error de conversion de numero");
        } catch (SQLException ex) {
            System.err.println("Error en el select");
        }
        return lista;
    }

    public static ArrayList<String[]> jugador() {
        ArrayList<String[]> lista = new ArrayList<>();
        Connection con;

        PreparedStatement ps = null;
        ResultSet rs = null;

        String select = "select * from jugadores";

        try {
            con = Conexion.getInstance().getConnection();

            ps = con.prepareStatement(select);

            rs = ps.executeQuery();

         
            while (rs.next()) {
                String[] e = {rs.getString(1), rs.getString(2), rs.getString(3)};
                lista.add(e);
               
            }

        } catch (NumberFormatException e) {
            System.err.println("Error de conversion de numero");
        } catch (SQLException ex) {
            System.err.println("Error en el select");
        }
        return lista;
    }

    public static ArrayList<String[]> jugadorSesionJuego() {
        ArrayList<String[]> lista = new ArrayList<>();
        Connection con;

        PreparedStatement ps = null;
        ResultSet rs = null;

   
     String select = "SELECT jugadores.alias, juegos.nombre_juego, sesiones.id_sesion " +
                "FROM jugadores " +
                "INNER JOIN sesiones ON jugadores.id_jugador = sesiones.id_jugador " +
                "INNER JOIN juegos ON sesiones.id_juego = juegos.id_juego";


        try {
            con = Conexion.getInstance().getConnection();

            ps = con.prepareStatement(select);

            rs = ps.executeQuery();

           
            while (rs.next()) {
                String[] e = {rs.getString(1), rs.getString(2), rs.getString(3)};
                lista.add(e);
               
            }

        } catch (NumberFormatException e) {
            System.err.println("Error de conversion de numero");
        } catch (SQLException ex) {
            System.err.println("Error en el select");
        }
        return lista;
    }
}