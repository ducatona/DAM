/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AdrianPenaCarnero_Ex_RA2_E_20231123.Principal;

import AdrianPenaCarnero_Ex_RA2_E_20231123.Consumidor.Oficial;
import AdrianPenaCarnero_Ex_RA2_E_20231123.Monitor.DispositivoDrones;
import AdrianPenaCarnero_Ex_RA2_E_20231123.Productor.Ingeniero;

/**
 *
 * @author apena
 */
public class App {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hola, el usuario Adrián Peña esta haciendo la aplicación para el RA2!");
        System.out.println("----------------STAR WARS--------------------------");
        System.out.println("");
        System.out.println("Hace mucho tiempo en una galaxia muy muy lejana ...");
        System.out.println("");
        System.out.println("Se están librando una horrible batalla en las afueras de la Galaxia");
        System.out.println("");
        System.out.println("entre las flotas rebeldes e imperiales ...");
        System.out.println("-------------------------------------------------------------");

        DispositivoDrones dispositivo = new DispositivoDrones(3);

        Thread ingenieroThread = new Thread(new Ingeniero(dispositivo));
        Thread daorThread = new Thread(new Oficial("Daor Ban", 10, dispositivo));
        Thread mazaThread = new Thread(new Oficial("Maza Aho", 5, dispositivo));
       
        ingenieroThread.start();
        daorThread.start();
        mazaThread.start();
        
        ingenieroThread.join();
        daorThread.join();
        mazaThread.join();
        
        
    
        
        
        
      

    }
}
