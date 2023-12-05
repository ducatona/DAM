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
        
        int TV = 0;
      
        
        
        
        while (true) {
            
            System.out.println("Introduce una palabra");
            String palabra = sc.next();
            
            System.out.println("Desea introducir otra palabra");
            String respuesta = sc.next();
            
            
            for (int i = 0; i < palabra.length(); i++) {
                
                char caracter = palabra.charAt(i);
                
                
                
                if(esVocal(caracter)){
                    
                    TV++;
                }
                
             
                
            }
            
            
            if (respuesta.equalsIgnoreCase("no")) {
                System.exit(0);
                
                
                
                
            }
            
            System.out.println(TV);
            
        }
        
    }
    
    public static boolean esVocal(char c){
        
        c = Character.toLowerCase(c);
        
        
        
        return c == 'a' || c == 'e' || c == 'i'|| c == 'o'|| c == 'u';
        
        
        
        
    }
    
}
