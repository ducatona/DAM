/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopoo;

/**
 *
 * @author Usuario
 */
public class Profesor extends Alumno{
    
    
    private int id;
    private String materia;
    
    
    public Profesor(){
        
    }

    public Profesor(int id, String materia, String nombre, int edad) {
        super(nombre, edad);
        this.id = id;
        this.materia = materia;
    }
    
    
    public void setId(int id){
        this.id = id;
        
    }
    
    public int getId(){
        return id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
    
}
