/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.plantillacliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apena
 */
public class PlantillaCliente {

    public static void main(String[] args) {
         /* Se crea el socket cliente */
        Socket servidor = null;
        DataInputStream bufferDatosEntrada = null;
        DataOutputStream bufferDatosSalida = null;
       
        try {

            servidor = new Socket("localhost", 6666);
            System.out.println("Conectado al servidor...");

            bufferDatosEntrada = new DataInputStream(servidor.getInputStream());
            bufferDatosSalida = new DataOutputStream(servidor.getOutputStream());

            //Escribe lo que quieras aqui
           

           

        } catch (IOException e) {
            Logger.getLogger(PlantillaCliente.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                //Cerramos la conexión
                bufferDatosEntrada.close();
                bufferDatosSalida.close();
                servidor.close();
            } catch (IOException ex) {
                Logger.getLogger(PlantillaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

    

