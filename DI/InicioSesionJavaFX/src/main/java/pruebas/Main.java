/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.iniciosesionjavafx.FormaRegistrarseController;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Generos;


/**
 *
 * @author apena
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        
        FormaRegistrarseController fm = new FormaRegistrarseController();
        
        
        ArrayList<String> lista  = new ArrayList();
        
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        Query c1 = em.createNamedQuery("Generos.findAll");
        ArrayList<Generos> listaProductos = (ArrayList<Generos>) c1.getResultList();
          
        for (Generos listaProducto : listaProductos) {
              
            System.out.println(listaProducto.getNombreGenero());
             lista.add(listaProducto.getNombreGenero());
             
             
        }
        ObservableList<String> items = FXCollections.observableArrayList();
        items.addAll("item-1", "item-2", "item-3", "item-4", "item-5");
        fm.comboBox.setItems((ObservableList<String>) lista);
//        m.comboBox.setItems((ObservableList<String>) listaProductos);
    }
}

