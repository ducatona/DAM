/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.metodos;

/**
 *
 * @author Usuario
 */
public class metodos {

    public static int numeroMayor(int a, int b, int c) {

        int m = a;

        if (m < b) {
            m = b;

        }
        
        if (m < c) {

            m = c;

        }
        return m;
    }
    
    
    
    public static double porcentajaDescuento(double precioRebajado, double precioOriginal){
        
        return precioOriginal- precioRebajado;
        
        
    }
    
    
    
}

