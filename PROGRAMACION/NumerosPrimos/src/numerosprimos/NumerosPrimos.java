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
        int numero = sc.nextInt();
        
        
        
        if(numero % 2 == 0){
            
            System.out.println("El numero no es primo");
            
            
        }else{
            System.out.println("Es primo");
        }
        
        
        
        
        
        
    }
    
}
