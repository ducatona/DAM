/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdrianPenaCarnero_Ex_RA2_E_20231123.Monitor;

/**
 *
 * @author apena
 */
public class DispositivoDrones {

    //variables 
    private int capacidad;
    private int tubosLibres;
    private int golpeos;
    

    //Constructor
    public DispositivoDrones(int capacidad) {
        this.capacidad = capacidad;
        this.tubosLibres = capacidad;
        this.golpeos = 0;
    }

    //Metodos set Y get
//no me ha dado tiempo a hacer un contador a cada hilo para el final y he puesto a trompicon el numero de golpes final, como es 6 y cierra el programa pues marca 6
    public int getGolpeos() {
        return golpeos;
    }

    public void setGolpeos(int golpeos) {
        this.golpeos = golpeos;
    }
    
    //metodo donde el ingeniero intentara tomar el control del dispositivo e introducir un nuevo dron
    public synchronized void setDron() {
        while (tubosLibres == 0) {
        System.out.println("Beep Beep, crrrk, beep, ingeniero Beslu Palug he tomado el control");
        System.out.println("   "+"Soy el ingeniero Beslu Palug y estoy configurando un nuevo dron asesino");
        System.out.println("   "+"Soy el ingeniero Beslu Palug he configurado un nuevo dron!");
            try {
                wait();
                // System.out.println("Tubos libres " + tubosLibres);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//System.out.println("Tubos libres " + tubosLibres);
        tubosLibres--;
        System.out.println("Tubos libres " + tubosLibres);
        //System.out.println("Beep Beep, crrrk, beep, ingeniero Beslu Palug he tomado el control");
        //System.out.println("   "+"Soy el ingeniero Beslu Palug y estoy configurando un nuevo dron asesino");
        //System.out.println("   "+"Soy el ingeniero Beslu Palug he configurado un nuevo dron!");
        //System.out.println("Tubos libres " + tubosLibres);
        notifyAll();
    }
//metodo donde los oficiales intentarán  tomar el conytol del dispositivo para obtener un dron y dispararlo
    public synchronized void getDron(String nombre) {
        while (tubosLibres == capacidad) {
            try {
                wait();
                System.out.println(nombre + " ha disparado un dron. Golpeos: " + golpeos);
                System.out.println("Tubos libres: "+ tubosLibres);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        tubosLibres++;
        golpeos++;
       // System.out.println(nombre + " ha disparado un dron. Golpeos: " + golpeos);
        //System.out.println("Tubos libres: "+ tubosLibres);

        if (golpeos == 6) {
            System.out.println("¡La Batalla ha terminado!");
            System.out.println("Beslu Palug:Si! La batala ha terminado");
            System.out.println("Maza Aho:Si! La batalla ha terminado");
            System.out.println("Daor Ban:Si! La batalla ha terminado");
            System.out.println("---------------------------------------------------");
            System.out.println("Daor Ban ha disparado:"+ golpeos);
            System.out.println("Maza Aho ha disparado:"+ golpeos);
            
            System.out.println("FIN");
            
            System.out.println("---------------------------------------------------");
            System.exit(0);
        }

        notifyAll();
    }
}
