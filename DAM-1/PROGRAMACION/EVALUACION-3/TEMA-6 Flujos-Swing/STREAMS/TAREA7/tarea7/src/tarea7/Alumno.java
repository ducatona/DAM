package tarea7;

import java.io.Serializable;

/**
 *
 * @author Albano Díez de Paulino
 */
public class Alumno implements Serializable{
    private String nombre;
    private int calificaciones;

    public Alumno(String nombre, int calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public Alumno() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", calificaciones=" + calificaciones + '}';
    }
    
    
    
    

}
