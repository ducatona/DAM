/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdrianPenaCarnero_Ex_RA2_E_20231123.Productor;

import AdrianPenaCarnero_Ex_RA2_E_20231123.Monitor.DispositivoDrones;

/**
 *
 * @author apena
 */
public class Ingeniero implements Runnable {

    private DispositivoDrones dispositivo;

    public Ingeniero(DispositivoDrones dispositivo) {
        this.dispositivo = dispositivo;
    }
//Aqui corremos el hilo ingeniero
    @Override
    public void run() {
        while (true) {
            dispositivo.setDron();
            System.out.println("Beep Beep, crrrk, beep,ingeniero Beslu Palug he tomado el control");
            try {
                System.out.println("    "+"Soy el ingeniero Beslu Palug y estoy configurando un nuevo dron asesino!");
                Thread.sleep(600);
                System.out.println("    "+"Soy el ingeniero Beslu Palug! He configurado un nuevo dron!");
               
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
