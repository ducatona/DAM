/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosf;

/**
 *
 * @author Usuario
 */
public class EjercicioSF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int num1 = 0;
       int num2 = 1;
       
       int suma = 1;
       
       int series = 10;
       
       
       
        for (int i = 0; i < series; i++) {
            
            System.out.println(suma);
            
            
            suma = num1 +num2;
            num1 = num2;
            num2 = suma;
            
        }
       
       
       
       
        
        
        
    }
    
}
