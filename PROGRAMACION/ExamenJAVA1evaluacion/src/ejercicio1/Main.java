/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona p1 = new Persona("Adrian","Peña","Carnero","Santander",28,1,'c');
        
        
       p1.muestraDatos();
       
       
        int Distanciarecorrida = p1.muestraDistancia(10);
        
        System.out.println("La distancia que ha recorrido es: "+ Distanciarecorrida);
        
    
        
    }
    
}
