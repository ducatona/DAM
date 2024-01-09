/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.servidorjuegonumeros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ServidorJuegoNumeros {

    public static void main(String[] args) {

        ServerSocket servidor;
        Socket cliente;
        int puerto = 6666;
        boolean jugar = true;
       
        Random r = new Random();
        int numeroSecreto = r.nextInt(101);

        System.out.println("Servidor arrancado y escuchando...");

        try {
            servidor = new ServerSocket(puerto);

            cliente = servidor.accept();

            DataInputStream dis = new DataInputStream(cliente.getInputStream());
            DataOutputStream dos = new DataOutputStream(cliente.getOutputStream());

           

           
            do {
                System.out.println("Esperando conexiones...");

                //2
                int respuestaCliente = dis.readInt();
                System.out.println(respuestaCliente);

                //3
                if (numeroSecreto == respuestaCliente) {
                    //3
                    dos.writeUTF("El numero introducido es el correcto");
                    //4
                    dos.writeBoolean(true);
                    jugar = false;

                } else if (numeroSecreto < respuestaCliente) {
                    dos.writeUTF("El numero introducido es menor al numero secreto");
                    dos.writeBoolean(false);

                } else {
                    dos.writeUTF("El numero introducido es mayor al numero secreto");
                    dos.writeBoolean(false);
                }

            } while (jugar);

            cliente.close();
            System.out.println("Servidor finalizado...");
            servidor.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}