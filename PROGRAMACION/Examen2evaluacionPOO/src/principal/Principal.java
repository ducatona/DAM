/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import farmacia.Farmacia;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Farmacia prod1 = new Farmacia();
        
         
        
        
        
        Farmacia prod2 = new Farmacia("melatonina",4,15);
        
        
        
        
        Farmacia copia = new Farmacia(prod2);
        
       
        
        
        System.out.println(copia);
       
        
       
        
        System.out.println( prod1.toString());
         System.out.println( prod2.toString());
        
         
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
