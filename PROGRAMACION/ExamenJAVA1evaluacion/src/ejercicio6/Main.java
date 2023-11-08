/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

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
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Menu");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");

        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Primera puesto");
                break;

            case 2:
                System.out.println("Segundo puesto");
                break;

            case 3:
                System.out.println("tercer puesto");
                break;
            default:
                System.out.println("no estas en el podium");

        }

    }

}
