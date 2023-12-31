/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author apena
 */


// clase donde tenemos las consultas que le vamos a hacer a la bbdd y donde metemos los datos en el modelo 
public class Modelo {

    public static ArrayList<String[]> juegos() {

        ArrayList<String[]> lista = new ArrayList<>();
        Connection con;

        PreparedStatement ps = null;
        ResultSet rs = null;

        String select = "select * from juegos";

        try {
            con = ConexionBBDD.getInstance().getConnection();

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

    public static ArrayList<String[]> jugadores() {
        ArrayList<String[]> lista = new ArrayList<>();
        Connection con;

        PreparedStatement ps = null;
        ResultSet rs = null;

        String select = "select * from jugadores";

        try {
            con = ConexionBBDD.getInstance().getConnection();

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

    public static ArrayList<String[]> Sesiones() {
        ArrayList<String[]> lista = new ArrayList<>();
        Connection con;

        PreparedStatement ps = null;
        ResultSet rs = null;

        String select = "SELECT jugadores.alias, juegos.nombre_juego, sesiones.id_sesion\n"
                + "FROM jugadores\n"
                + "INNER JOIN sesiones ON jugadores.id_jugador = sesiones.id_jugador\n"
                + "INNER JOIN juegos ON sesiones.id_juego = juegos.id_juego;";

        try {
            con = ConexionBBDD.getInstance().getConnection();

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
