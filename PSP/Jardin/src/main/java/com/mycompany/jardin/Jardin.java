/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jardin;

/**
 *
 * @author apena
 */
public class Jardin {
    private int cuenta = 100; // Inicialmente hay 100 personas en el jardín

    // Método para contar la entrada de personas
    public synchronized void entrar() {
        cuenta++;
        System.out.println("Persona entró. Personas en el jardín: " + cuenta);
    }

    // Método para contar la salida de personas
    public synchronized void salir() {
        cuenta--;
        System.out.println("Persona salió. Personas en el jardín: " + cuenta);
    }
}

