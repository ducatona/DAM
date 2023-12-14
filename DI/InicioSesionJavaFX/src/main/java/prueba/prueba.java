/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Biblioteca;
import modelo.Juegos;
import modelo.Nacionalidad;
import modelo.Pegui;

/**
 *
 * @author apena
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_InicioSesionJavaFX_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();

    try {
        Nacionalidad         j = new Nacionalidad();
        j.setNacionalidad("golfilla");

        em.getTransaction().begin();
        em.persist(j);
        em.getTransaction().commit();
    } catch (Exception e) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
        e.printStackTrace();
    } finally {
        em.close();
    }
}
}
