/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Usuario
 */
public class Persona {
    
   private String nombre;
   private String a1;
   private String a2;
   private String ciudad;
   private int portal,piso;
   private char letrapiso;

    public Persona(String nombre, String a1, String a2, String ciudad, int portal, int piso, char letrapiso) {
        this.nombre = nombre;
        this.a1 = a1;
        this.a2 = a2;
        this.ciudad = ciudad;
        this.portal = portal;
        this.piso = piso;
        this.letrapiso = letrapiso;
    }
   
   
   public void muestraDatos(){
       
       System.out.println("El nombre es: "+ nombre);
       System.out.println("El primer apellido es: "+ a1);
       System.out.println("El segundo apellido es: "+ a2);
       System.out.println("La ciudad es: "+ ciudad);
       System.out.println("El portal es: "+ portal);
       System.out.println("El piso es: "+ piso);
       System.out.println("La letra del piso es "+ letrapiso);
   }
    
    
   public int muestraDistancia(int distancia){
       
       return distancia*7;
       
   }
    
    
}
