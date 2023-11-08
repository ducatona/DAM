/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre");
        String nombre = lectura.nextLine();
        System.out.println("Introduce tus apellidos (separados por un espacio)");
        String apellidos = lectura.nextLine();
        System.out.println("Introduce tu edad");
        int edad = lectura.nextInt();
        
        
        
        
        System.out.println("Datos Registrados: ");
        System.out.println("Nombre " + nombre);
        System.out.println("Apellidos " + apellidos);
        System.out.println("Edad "+ edad);
        
    }
    
}
