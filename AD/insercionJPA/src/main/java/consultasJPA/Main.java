/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultasJPA;

import static com.mycompany.insercionjpa.Biblioteca_.fecha;
import com.mycompany.insercionjpa.Generos;
import com.mycompany.insercionjpa.Juegos;
import com.mycompany.insercionjpa.Usuarios;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author apena
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Juegos j = new Juegos(2, "prueba");
        em.getTransaction().begin();

        em.persist(j);

        em.getTransaction().commit();

    }

}
