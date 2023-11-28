/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.servidorbasico;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apena
 */
public class ServidorBasico {

    public static void main(String[] args) {

        ServerSocket servidor; //Socket de escucha del servidor
        Socket cliente; //Socket para atender a un cliente
        int numCliente = 0; //Contador de clientes
        int PUERTO = 6666;//puerto de escucha

        System.out.println("Soy el servidor y empiezo a escribir peticiones por el puerto " + PUERTO);

        try {
            //Apertura de socket para escuchar a travez de un puerto
            servidor = new ServerSocket(PUERTO);

            do {

                numCliente++;

                //Aceptamos la conexion de un cliente
                cliente = servidor.accept();
                System.out.println("\t LLega el cliente " + numCliente);

                //Se declaran los flujos de comunicación con el cliente
                //Flujo de entrada o de lectura
                DataInputStream bufferDatosEntrada = new DataInputStream(cliente.getInputStream());
                //Flujo de salida o de escritura
                DataOutputStream bufferDatosSalida = new DataOutputStream(cliente.getOutputStream());
                
                
                // A partir de aqui se establece el protocolo de comunicacion con el cliente
                System.out.println("Envia el mensaje para el cliente");
                
                bufferDatosSalida.writeUTF("Usted es mi cliente : "+ numCliente);

                //CIERRE DE FLUJOS Y DE LA CONEXION 
                bufferDatosEntrada.close();
                bufferDatosSalida.close();
                cliente.close();
                
                System.out.println("/t Se ha cerrado la conexion con el cliente "+ numCliente);
                
            } while (true);
        } catch (IOException ex) {
            Logger.getLogger(ServidorBasico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
