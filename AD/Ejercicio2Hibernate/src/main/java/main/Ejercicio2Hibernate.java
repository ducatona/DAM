/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import entidades.Cliente;
import entidades.Producto;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author apena
 */
public class Ejercicio2Hibernate {

    public static void main(String[] args) {

        //Creo la conexion
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_Ejercicio2Hibernate_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Productos(em);
        System.out.println("***********************************************************");
        ProductoPorNombre(em);
        System.out.println("***********************************************************");
        ConsultaPersonalizada(em);
        System.out.println("***********************************************************");
        InsertarRegistro(em);

        //Cierro la conexion
        em.close();
        emf.close();

    }

    public static void Productos(EntityManager em) {
        Query c1 = em.createNamedQuery("Producto.findAll");
        ArrayList<Producto> listaProductos = (ArrayList<Producto>) c1.getResultList();
        for (Producto i : listaProductos) {
            System.out.println(i.getPkproducto() + i.getNombre() + i.getPvp() + i.getFkcategoria().getNombre());

        }

    }

    public static void ProductoPorNombre(EntityManager em) {

        Query c1 = em.createNamedQuery("Producto.findByPkproducto");
        c1.setParameter("pkproducto", 1);
        ArrayList<Producto> listaProductos = (ArrayList<Producto>) c1.getResultList();
        for (Producto i : listaProductos) {
            System.out.println(i.getNombre());

        }

    }

    public static void ConsultaPersonalizada(EntityManager em) {

        Query c1 = em.createNamedQuery("Producto.consultaPersonalizada");
        c1.setParameter("nombre", "Aspiradora");
        c1.setParameter("stock", 3);
        ArrayList<Producto> listaProductos = (ArrayList<Producto>) c1.getResultList();
        for (Producto i : listaProductos) {
            System.out.println(i.getNombre() + i.getStock());

        }

    }

    public static void InsertarRegistro(EntityManager em) {
        Query insercion = em.createNativeQuery("INSERT INTO Categoria (nombre) VALUES (:nombre);");
        em.getTransaction().begin();
        insercion.setParameter("nombre", "Videojuegos");
        insercion.executeUpdate();
        em.getTransaction().commit();
        
        System.out.println("Categoria nueva insertada correctamente");

    }

}
