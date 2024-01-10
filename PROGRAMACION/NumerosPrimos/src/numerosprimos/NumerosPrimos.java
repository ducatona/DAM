/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
       
        while (!sc.hasNextInt()) {
            System.out.println("Entrada no valida");
            sc.next();
            
        }
        
        
        int numero = sc.nextInt();

        
         esPrimo(numero);
    }

    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            System.out.println("No es primo");
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % 1 == 0) {
                System.out.println("No es primo");
                return false;
            }

        }
     
        System.out.println("Es primo");
   return true; 
    }
}
