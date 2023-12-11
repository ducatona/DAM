/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.lang.reflect.AccessFlag;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Fruta arrayFrutas[] = new Fruta[5];

        arrayFrutas[0] = new Fruta("manzana", true, 5, 3244);

        arrayFrutas[1] = new Fruta("platano", true, 5, 332);

        arrayFrutas[2] = new Fruta("mandarina", true, 5, 32);

        arrayFrutas[3] = new Fruta("pera", true, 4, 32222);

        arrayFrutas[4] = new Fruta("amapola", false, 3, 3);

        System.out.println("Menu: ");
        System.out.println("1-Muestra la información de todos los objetos");
        System.out.println("2- Validar código: se muestra por pantalla si los productos tienen un codigo valido");
        System.out.println("3- Recogida para fábrica:muestra la información de aquellos objetos cuyo estado obtimo sea falso");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                mostrarInformacion(arrayFrutas);

                break;

            case 2:

                ValidarCodigo(arrayFrutas);

                break;

            case 3:

                recogidaParaFabrica(arrayFrutas);
                break;

        }

    }

    public static void mostrarInformacion(Fruta[] frutas) {

        for (Fruta fruta : frutas) {

            System.out.println(fruta.toString());

        }

    }

    public static void ValidarCodigo(Fruta[] array) {

        for (Fruta fruta : array) {

            if (String.valueOf(fruta.getCodigo()).length()==3) {

                System.out.println("El codigo esta bien");

            } else {
                System.out.println("El codigo esta mal");
            }
        }

    }

    public static void recogidaParaFabrica(Fruta[] array) {
        
        for (Fruta fruta : array) {
            
            if (  fruta.getEstadoOptimo() == false) {
                System.out.println(fruta);
     
            }else{
               
                
            }
       
            
        }

    }
}
