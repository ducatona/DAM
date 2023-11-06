/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sumacompartida;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apena
 */
public class SumaCompartida {

    public static void main(String[] args) {

        Contador c = new Contador();

        HiloSuma hs1 = new HiloSuma(1, c);
        HiloSuma hs2 = new HiloSuma(2, c);
        HiloSuma hs3 = new HiloSuma(3, c);
        HiloSuma hs4 = new HiloSuma(4, c);

        hs1.start();
        hs2.start();
        hs3.start();
        hs4.start();

        try {
            hs1.join();
            hs2.join();
            hs3.join();
            hs4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SumaCompartida.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("La suma final vale" + c.getContador());
    }
}
