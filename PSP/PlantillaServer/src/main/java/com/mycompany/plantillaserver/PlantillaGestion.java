/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantillaserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlantillaGestion extends Thread {

    private int numCliente;
    private Socket cliente;

    public PlantillaGestion(Socket s, int cliente) {
        this.cliente = s;
        this.numCliente = cliente;
    }

    @Override
    public void run() {

        DataInputStream bufferDatosEntrada = null;
        DataOutputStream bufferDatosSalida = null;
        try {
            
            bufferDatosSalida = new DataOutputStream(cliente.getOutputStream());
            bufferDatosEntrada = new DataInputStream(cliente.getInputStream());

          

        } catch (IOException ex) {
            Logger.getLogger(PlantillaGestion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufferDatosEntrada.close();
                bufferDatosSalida.close();
                this.cliente.close();
            } catch (IOException ex) {
                Logger.getLogger(PlantillaGestion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
