/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transferenciaserver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionTransferencia extends Thread {

    private int numCliente;
    private Socket cliente;

    public GestionTransferencia(Socket s, int cliente) {
        this.cliente = s;
        this.numCliente = cliente;
    }

    @Override
    public void run() {

        DataInputStream bufferDatosEntrada = null;
        DataOutputStream bufferDatosSalida = null;
        String linea;

        try {

            bufferDatosSalida = new DataOutputStream(cliente.getOutputStream());
            bufferDatosEntrada = new DataInputStream(cliente.getInputStream());

            //1
            bufferDatosSalida.writeUTF("Introduce el nombre del fichero que quieres abrir");
            //2
            String respuestaCliente = bufferDatosEntrada.readUTF();
            System.out.println(respuestaCliente);
            //3
            File f = new File(respuestaCliente);
            if (f.exists()) {

                BufferedReader lectorfichero = new BufferedReader(new FileReader(f));

                linea = lectorfichero.readLine();
                while (linea != null) {

                    bufferDatosSalida.writeUTF(linea);

                }

            } else {
                bufferDatosSalida.writeUTF("el fichero no existe");
            }

            //escribe aqui lo que quieras que haga
        } catch (IOException ex) {
            Logger.getLogger(GestionTransferencia.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufferDatosEntrada.close();
                bufferDatosSalida.close();
                this.cliente.close();
            } catch (IOException ex) {
                Logger.getLogger(GestionTransferencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
