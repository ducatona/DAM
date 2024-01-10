/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplohashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class EjemploHashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<Integer, String> nombres = new HashMap<>();

        nombres.put(2, "alvaro");
        nombres.put(2, "daniel");
        nombres.put(2, "jair");
        nombres.put(2, "carlos");
        
        
        
        for (Map.Entry<Integer, String> entry : nombres.entrySet()) {
            Object key = entry.getKey();
            System.out.println(key);
            Object val = entry.getValue();
            System.out.println(val);
            
        }

    }

}
