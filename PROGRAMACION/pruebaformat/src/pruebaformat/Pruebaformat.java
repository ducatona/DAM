/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaformat;

/**
 *
 * @author Usuario
 */
public class Pruebaformat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Definir el tamaño del array bidimensional (filas x columnas)
        int filas = 5;
        int columnas = 3;

        // Crear el array bidimensional de enteros
        int[][] matriz = new int[filas][columnas];

        // Llenar la matriz con valores (por ejemplo, puedes usar valores aleatorios)

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = 1;  // Puedes cambiar esto según tus necesidades
            }
        }

        // Imprimir la matriz con asteriscos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    
                    System.out.print("  "); // Espacio en blanco si el valor no es 1
                }
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}
