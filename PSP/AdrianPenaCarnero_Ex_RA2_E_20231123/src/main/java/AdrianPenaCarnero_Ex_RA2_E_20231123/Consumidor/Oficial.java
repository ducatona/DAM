/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdrianPenaCarnero_Ex_RA2_E_20231123.Consumidor;

import AdrianPenaCarnero_Ex_RA2_E_20231123.Monitor.DispositivoDrones;

/**
 *
 * @author apena
 */
public class Oficial implements Runnable {
    //variables
    private String nombre;
    private int prioridad;
    private DispositivoDrones dispositivo;

    public Oficial(String nombre, int prioridad, DispositivoDrones dispositivo) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.dispositivo = dispositivo;
    }

    @Override
    
    //aqui corremos el hilo oficial
    public void run() {
        
        //mientras sea true quiero que realice esta accion
        while (true) {
            dispositivo.getDron(nombre);

            System.out.println("Beep Beep, crrrk, beep, oficial Daor Ban he tomado el control");
            //tiempo de espera
            int tiempoEspera = (nombre.equals("Daor Ban")) ? 5000 : 8000;

            try {
               
                System.out.println("   "+"Soy el oficial Daor Ban!Voy a coger un nuevo dron asesino!");
                //le dormimos
                Thread.sleep(tiempoEspera);
                System.out.println("    "+"Soy el oficial Daor Ban! He disparado el dron asesino!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
