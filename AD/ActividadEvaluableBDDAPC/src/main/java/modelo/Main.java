/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

import controlador.ControladorLogin;


/**
 *
 * @author apena
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        //clase principal donde ejecutara todo, simplemente con instanciar el login nos serviria para que nos funcionase todo
        ControladorLogin controlLog = new ControladorLogin();
       
        controlLog.run();
        
      
        
    }
    
}
