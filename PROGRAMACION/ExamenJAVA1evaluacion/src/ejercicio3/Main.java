/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
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
       
       
        System.out.println("Introduce el primer numero");
        int numero1 = sc.nextInt();
        
        System.out.println("Introduce el segundo numero");
        int numero2 = sc.nextInt();
        
        
        if(numero1 > numero2){
            
            System.out.println("el numero 1 es mayor");
            
            

        }else{
            System.out.println("El numero 2 es mayor");
        }

    }

}
