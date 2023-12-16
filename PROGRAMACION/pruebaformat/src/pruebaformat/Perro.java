/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaformat;

/**
 *
 * @author Usuario
 */
public class Perro {

    public int edad;
    public String nombre;
    public String color;

    public Perro(int edad, String nombre, String color) {

        this.edad = edad;
        this.nombre = nombre;
        this.color = color;

    }
    
    
    
    public void despierta(){
        
        System.out.println("El sonido de %s %d %s.".formatted(nombre,edad,color));
    }
    

}
