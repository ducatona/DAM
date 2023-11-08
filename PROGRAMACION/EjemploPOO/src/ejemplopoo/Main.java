/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopoo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        Alumno a1 = new Alumno("Adrian",10);
        
        a1.setNombre("mariano");
        
        System.out.println(a1.getNombre() + "  " + a1.getEdad());
        
        
        Profesor p1 = new Profesor();
        
        System.out.println("Introduzca el nombre del profesor");
        
        String nombre = sc.nextLine();
        
        System.out.println("Introduce la edad del profesor");
        int edad = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Introduce la materia que imparte");
        String materia = sc.nextLine();
        
        
        System.out.println("Introduzca tu id");
        int id = sc.nextInt();
       
        
        
        p1.setNombre(nombre);
        p1.setMateria(materia);
        p1.setEdad(edad);
        p1.setId(id);
        
        System.out.println("Nombre"+ p1.getNombre() + " "+ "Materia"+ p1.getMateria() + "edad" + p1.getEdad()+ "id" + p1.getId());
        
        
        
    }
    
}
