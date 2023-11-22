/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author apena
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int tamano = 0;
        
        System.out.println("Introduce el tamaño del array");
        tamano = lectura.nextInt();
        
        String[] personas = new String[tamano];
        
        for(int i = 0; i<tamano;i++){
            
            personas[i] = lectura.next();
         
            
        }
        
       for(int i = 0;i<personas.length;i++){
           
           System.out.println(personas[i]);
           
           
                   
       }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
