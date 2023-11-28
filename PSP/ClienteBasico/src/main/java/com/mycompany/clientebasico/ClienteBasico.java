/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clientebasico;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apena
 */
public class ClienteBasico {

    public static void main(String[] args) {
       
        String direccion; // la IP de direccion de conexión
        Socket servidor; // socket para conectarnos al servidor
        final int PUERTO=6666; //Puerto de conexión
        
        
        System.out.println("Soy el cliente e intento conectarme");
        
        
        //Aqui indicar la ip donde eta esscuchando el servidor
        direccion="127.0.0.1";
        try {
            //Nos conectamos al servidor : direccion y puerto
            servidor = new Socket(direccion,PUERTO);
            
            System.out.println("Conexion realizada con exito");
            
            // Se declaran los flujos de comunicacion con el servidor
            
            DataInputStream bufferDatosEntrada = new DataInputStream(servidor.getInputStream());           
            DataOutputStream bufferDatosSalida = new DataOutputStream(servidor.getOutputStream());
            
            //A partir de aqui se establece el protocolo de comunicación con el servidor
            
            String mensaje=bufferDatosEntrada.readUTF();
            System.out.println(mensaje);
            
            
            //Cierre de flujos y comunicacion
            
            bufferDatosEntrada.close();
            bufferDatosSalida.close();
            servidor.close();
            
            System.out.println("Soy el cliente y cierro la conexion ");
            
            
            
            
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ClienteBasico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
}
