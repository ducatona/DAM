package com.mycompany.examen;

import java.util.Scanner;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conexion conexion = new Conexion();

        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            procesarOpcion(opcion, conexion);

        } while (opcion != 7);

        System.out.println("¡Hasta luego!");
        conexion.cerrarConexion();
        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Listar nombres de productos");
        System.out.println("2. Listar nombres y precios de productos");
        System.out.println("3. Listar todas las columnas de productos");
        // Agrega aquí las demás opciones del menú
        System.out.println("7. Salir");
    }

    private static void procesarOpcion(int opcion, Conexion conexion) {
        switch (opcion) {
            case 1:
                OperacionesBD.listarNombreProductos(conexion.obtenerConexion());
                break;
            case 2:
                OperacionesBD.listarNombresYPreciosProductos(conexion.obtenerConexion());
                break;
            case 3:
                OperacionesBD.listarTodasColumnasProducto(conexion.obtenerConexion());
                break;
         
            case 7:
             
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 7.");
        }
    }
}


