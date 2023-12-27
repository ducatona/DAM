/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrayStrings = new ArrayList<>();
        String fin = "fin";
        String palabra = null;
        while (!fin.equalsIgnoreCase(palabra)) {

            System.out.println("Introduce lo que quieras hasta poner la palabra fin");
            palabra = sc.nextLine();
            arrayStrings.add(palabra);

        }

        System.out.println(arrayStrings);

    }

}
