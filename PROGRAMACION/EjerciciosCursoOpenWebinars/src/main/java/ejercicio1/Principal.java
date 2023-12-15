/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int i = sc.nextInt();

        String mensaje = switch (i) {

            case 1 ->
                "hola";
            case 2 ->
                "hola0";
            case 3 ->
                "hola";
            default ->
                "nada";

        };
        System.out.println(mensaje);
    }

}
