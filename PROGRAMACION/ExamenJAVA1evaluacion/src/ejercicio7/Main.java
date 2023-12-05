/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
             ArrayList<Integer> Enteros = new ArrayList<Integer>();
        do {            
            
       
       
       

        System.out.println("introduce edades del 1 al 90");
        int numeros = sc.nextInt();

        if (numeros == 0) {

            System.out.println("no puede ser 0");
        } else if (numeros > 90) {

            System.out.println(" No puede ser mayor de 90");

        } else {

            System.out.println("okey vamos a añadir los numeros a la lista");

            Enteros.add(numeros);
            System.out.println("Desea introducir mas numeros");
            String respuesta = sc.next();
            
            if(respuesta.equalsIgnoreCase("no")){
                break;
            }
            
        }
        System.out.println(Enteros);
        
        
        
        
        
 } while (true);
        do {
            int opcion;
            System.out.println("1 - edades introducidas");
            System.out.println("2 - media");
            System.out.println("3 -salir");

            System.out.println("Introduzca una opcion");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    Apartado1(Enteros);
                    break;

                case 2:
                    media(Enteros);
                    break;

                case 3:

                    System.exit(0);

            }
        } while (true);

    }


    
    public static void Apartado1(ArrayList<Integer> Enteros) {

      
    
        int menoresEdad = 0;
        int mayoresEdad = 0;

        for (Integer Entero : Enteros) {

            if (Entero >= 18) {

                mayoresEdad++;

            } else {
                menoresEdad++;
            
 
        }
       
    }
         System.out.println("Menores de edad: " + menoresEdad + ", Mayores de edad: " + mayoresEdad + ", Lista: " + Enteros);
    }

    public static void media(ArrayList<Integer> Enteros) {
        int sumatotal = 0;
        for (Integer Entero : Enteros) {
            
            sumatotal += Entero.intValue();
            
        }
        double media = sumatotal / Enteros.size();
        System.out.println("Media" + media);
    }

}
