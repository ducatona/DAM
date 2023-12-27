
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        ArrayList<Integer> lista = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 30; i++) {

            numero = sc.nextInt(10);

            lista.add(numero);
            
            System.out.println(numero);
            

        }

    }

}
