/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

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
        StringBuilder palabra1 = new StringBuilder();
        
        System.out.println("Introduce una palabra");
        String palabra = lectura.nextLine();
        
        
       for(int i = 0;i<palabra.length();i++){
           char caracter = palabra.charAt(i);
           
           if(i % 2 == 0){
               
               palabra1.append(Character.toUpperCase(caracter));
           }else{
                palabra1.append(Character.toLowerCase(caracter));
           }
           
        
       }
        System.out.println(" ");
        System.out.println("**********************************************************");
        System.out.println("  ");
        System.out.println(palabra1);
        
        
        
       
        
        
        
        
    }
    
}
