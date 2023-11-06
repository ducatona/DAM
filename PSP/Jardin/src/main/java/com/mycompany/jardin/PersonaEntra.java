/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardin;

/**
 *
 * @author apena
 */
public class PersonaEntra extends Thread {
    private Jardin jardin;

    public PersonaEntra(Jardin jardin) {
        this.jardin = jardin;
    }

    @Override
    public void run() {
        jardin.entrar();
    }
}
