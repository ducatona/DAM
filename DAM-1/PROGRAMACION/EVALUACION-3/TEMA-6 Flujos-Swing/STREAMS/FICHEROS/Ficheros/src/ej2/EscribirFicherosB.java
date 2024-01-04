package ej2;

import java.io.*;


public class EscribirFicherosB {

    public static void main(String[] args) {
        
        //Debe de escribir el String de la linea 13 caracter por caracter en la siguiente ruta C:\\Usuarios\\datos.txt
        FileOutputStream fos = null;      

        String texto = "En un lugar de la mancha de cuyo nombre no quiero acordarme...";
        char c = 0;
        try {
            fos = new FileOutputStream("C:\\Usuarios\\datos.txt");//Ruta no valida
          
            for (int i = 0; i < texto.length(); i++) {   
                c = texto.charAt(i);  
                fos.write((byte) c);// no es necesario el recasteo explicito                  
            }                                            
        } catch (IOException e) {
            System.err.println("Ha ocurrido una IOException");
        } finally {
            try {//Falta un if para comprobar que el flujo no se ha abierto
                fos.close();                    		
            } catch (IOException e) {             
                System.err.println("Ha ocurrido una IOException");
            }
            
        }
    }
}

