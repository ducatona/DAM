/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen3continuacion;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Examen3continuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[][] claves = {
            {'+', '-', '+', '-', '+'},
            {'+', '-', '+', '-', '+'},
            {'+', '-', '+', '-', '+'},
            {'+', '-', '+', '-', '+'}

        };
        
        
        for (int i = 0; i < claves.length; i++) {
            
            for (int j = 0; j < claves[i].length; j++) {
                
                System.out.print(claves[i][j] + " ");
            }
                
              System.out.println("");  
                
            }
            
        }

    }


