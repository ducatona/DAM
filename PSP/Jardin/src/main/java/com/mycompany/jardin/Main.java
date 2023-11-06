/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.jardin;

/**
 *
 * @author apena
 */
public class Main {
    public static void main(String[] args) {
        Jardin jardin = new Jardin();

        // Crear 10 hilos para personas que entran
        Thread[] hilosEntrada = new Thread[10];
        for (int i = 0; i < 10; i++) {
            hilosEntrada[i] = new PersonaEntra(jardin);
            hilosEntrada[i].start();
        }

        // Crear 15 hilos para personas que salen
        Thread[] hilosSalida = new Thread[15];
        for (int i = 0; i < 15; i++) {
            hilosSalida[i] = new PersonaSale(jardin);
            hilosSalida[i].start();
        }
    }
}

 
    

