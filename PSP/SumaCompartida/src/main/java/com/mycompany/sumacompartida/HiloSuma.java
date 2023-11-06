/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumacompartida;

/**
 *
 * @author apena
 */
public class HiloSuma extends Thread{
    
    
 private Contador contador;   
 private int id;
 public HiloSuma(int id,Contador contador){
     this.id=id;
     this.contador=contador;
     
 }
    
public void run(){
    System.out.println("Entra el Hilo" + (id));
    for(int i = 0;i<10000;i++){
        
        contador.sumaContador( 1);
         
    }
    
   System.out.println("El hilo numero" + id +" "+" contador  "+ contador.getContador());
}
    
    
    
    
    
    
    
    
}
