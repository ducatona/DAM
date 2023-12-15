/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoscliente;

import metodoscliente.MetodosCliente;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damt223
 */
public class HiloCliente extends Thread {

    private MetodosCliente metodo;
    private Socket servidor;
    private DataOutputStream dos;
    private int opcion;
    private String nombreJuego;
    private String nombreImagen;

    public HiloCliente(MetodosCliente metodos, Socket servidor, int opcion) {
        this.metodo = metodos;
        this.servidor = servidor;
        this.opcion = opcion;

        try {
            dos = new DataOutputStream(servidor.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public HiloCliente(MetodosCliente metodos, Socket servidor, int opcion, String nombreJuego, String nombreImagen) {
        this.metodo = metodos;
        this.servidor = servidor;
        this.opcion = opcion;
        this.nombreImagen = nombreImagen;
        this.nombreJuego = nombreJuego;

        try {
            dos = new DataOutputStream(servidor.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        try {

            dos.writeInt(opcion);

            switch (opcion) {
                case 1:
                    metodo.recibirArchivoZip(nombreJuego);
                    break;
                case 2:
                    metodo.enviarArchivoZip(nombreJuego);
                    break;
                case 3:
                    metodo.mandarImagen(nombreImagen);
                    break;
                case 4:
                    metodo.recibirImagen(nombreImagen);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            dos.close();

        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
