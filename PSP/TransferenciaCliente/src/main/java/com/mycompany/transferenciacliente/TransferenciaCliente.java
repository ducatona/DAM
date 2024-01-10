/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.transferenciacliente;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apena
 */
public class TransferenciaCliente {

    public static void main(String[] args) {
        /* Se crea el socket cliente */
        Socket servidor = null;
        DataInputStream bufferDatosEntrada = null;
        DataOutputStream bufferDatosSalida = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {

            servidor = new Socket("localhost", 2223);
            System.out.println("Conectado al servidor...");

            bufferDatosEntrada = new DataInputStream(servidor.getInputStream());
            bufferDatosSalida = new DataOutputStream(servidor.getOutputStream());
            //1
            String respuesta = bufferDatosEntrada.readUTF();
            System.out.println(respuesta);
            //2
            String nombreFichero = br.readLine();
            bufferDatosSalida.writeUTF(nombreFichero);
            //3
            String respuestaFichero = bufferDatosEntrada.readUTF();
            System.out.println(respuestaFichero);
            
        } catch (IOException e) {
            Logger.getLogger(TransferenciaCliente.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                //Cerramos la conexión
                br.close();
                bufferDatosEntrada.close();
                bufferDatosSalida.close();
                servidor.close();

            } catch (IOException ex) {
                Logger.getLogger(TransferenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
