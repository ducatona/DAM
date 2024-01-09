/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clientejuegonumeros;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteJuegoNumeros {

    public static void main(String[] args) {

        /* Se crea el socket cliente */
        Socket servidor = null;
        DataInputStream bufferDatosEntrada = null;
        DataOutputStream bufferDatosSalida = null;
        Scanner sc = new Scanner(System.in);
        boolean jugar = true;
        try {

            servidor = new Socket("localhost", 6666);
            System.out.println("Conectado al servidor...");

            bufferDatosEntrada = new DataInputStream(servidor.getInputStream());
            bufferDatosSalida = new DataOutputStream(servidor.getOutputStream());

            
           

            do {

                System.out.println("Empieza el juego de Adivinanza");
                System.out.println("Intoduceme un numero del 0 al 100");
                int numeroEnviado = sc.nextInt();
                //2
                bufferDatosSalida.writeInt(numeroEnviado);
                System.out.println("El numero enviado es el " + numeroEnviado);

                //3
                String respuesta2 = bufferDatosEntrada.readUTF();
                System.out.println(respuesta2);
                //4
                Boolean adivinaste = bufferDatosEntrada.readBoolean();

                if (adivinaste) {
                   
                    jugar = false;
                }

            } while (jugar);

        } catch (IOException e) {
            Logger.getLogger(ClienteJuegoNumeros.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                //Cerramos la conexión
                bufferDatosEntrada.close();
                bufferDatosSalida.close();
                servidor.close();
            } catch (IOException ex) {
                Logger.getLogger(ClienteJuegoNumeros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}