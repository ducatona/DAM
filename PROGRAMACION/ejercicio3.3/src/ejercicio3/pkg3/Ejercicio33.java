/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //generamos array
        
       int[] lista = generarArray(30);
       
       //imprimimos el array
       
        imprimir(lista);
        
        
        HashMap <Integer, Integer> map = generarfrecuencia(lista);
        
        System.out.println("Hashmap generado");
        
        imprimirHM(map);
        
        System.out.println("Imprimir valores");
        imprimirValues(map);
        System.out.println("imrpimir llaves");
        imprimirkeys(map);
        
        
    }

    private static int[] generarArray(int size) {
        int [] lista = new int[size];
        Random r = new Random();
                
        for (int i = 0; i < size; i++) {
            
            lista[i]=r.nextInt(10);
            
        }
        return lista;
        
        
    }
    
    
    private static void imprimir(int[] lista) {
        for (int i : lista) {
            
            System.out.print(i+ " ");
            
        }
        System.out.println("");
        
    }
    
    private static HashMap<Integer,Integer>generarfrecuencia(int[]lista){
        
        HashMap<Integer,Integer>map = new HashMap<>();
        
        for (int i : lista) {
            
            map.put(i, map.getOrDefault(i,0)+1);
            
        }return map;
        
        
        
    }
    
    private static void imprimirHM(  HashMap<Integer,Integer>map){
        for (int llave :  map.keySet()) {
            
            System.out.println(llave + " ||||| " + map.get(llave));
            
        }
        
    }
    
    private static void imprimirkeys(HashMap<Integer,Integer>map){
        
      
        for (int llave : map.keySet()) {
            System.out.println(llave);
        }
        
    }
    
    
    private static void imprimirValues(HashMap<Integer,Integer>map){
        
        for (int valores : map.values()) {
            System.out.println(valores);
            
        }
        
        
    }
    
}
