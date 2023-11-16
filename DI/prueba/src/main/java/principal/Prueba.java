/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package

import java.util.Scanner;


/**
 *
 * @author apena
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        do {

            int opcion = 0;
            opcion = sc.nextInt();
            // Metodos m = new Metodos();
            switch (opcion) {
                case 1:
                    System.out.println("Consultar los datos de los clientes");
                    break;
                case 2:
                    System.out.println("Consultar los datos de los comerciales");
                    break;
                case 3:
                    System.out.println("Consultar los datos de los pedidos ordenados por la fecha de realizacion en orden de pedidos mas recientes");
                    break;
                case 4:
                    System.out.println("Listado clientes con los pedidos realizados y con los datos de los comerciales asociados a cada pedido");
                    break;

                case 5:
                    System.out.println("insertar pedido");
                    break;

                case 6:
                    System.out.println("confirmar cambios");
                    break;

                case 7:
                    System.out.println("salir");
                    //m.salir();
                    break;
                default:
                    throw new AssertionError();
            }

        } while (!salir);

    }

}
