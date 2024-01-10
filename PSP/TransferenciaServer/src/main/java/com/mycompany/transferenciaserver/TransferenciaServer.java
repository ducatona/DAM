/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transferenciaserver;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *
 * @author apena
 */
public class TransferenciaServer {

    public static void main(String[] args) {
        
        ServerSocket servidor;
        Socket cliente;
        int puerto = 2223;
       
       
      

        System.out.println("Servidor arrancado y escuchando...");

        try {
            servidor = new ServerSocket(puerto);

            cliente = servidor.accept();

            DataInputStream dis = new DataInputStream(cliente.getInputStream());
            DataOutputStream dos = new DataOutputStream(cliente.getOutputStream());

           
            //Escribe lo que quieras aqui
            
            //instanca de la clase/objeto
           GestionTransferencia gt = new GestionTransferencia(cliente, puerto);
           gt.run();
            

            cliente.close();
            System.out.println("Servidor finalizado...");
            servidor.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
    

