package componentejava;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;

public class ComponenteJava extends JTextField implements Serializable, KeyListener {

    Color a_colorFondoAntes,a_colorFondoDespues;
    Color a_colorTextoAntes,a_colorTextoDespues;
    int a_numerCaracterres;

    public ComponenteJava() {
        
        this.addKeyListener(this);
    }

    
    
    public Color getA_colorFondoAntes() {
        return a_colorFondoAntes;
    }

    public void setA_colorFondoAntes(Color a_colorFondoAntes) {
        this.a_colorFondoAntes = a_colorFondoAntes;
    }

    public Color getA_colorFondoDespues() {
        return a_colorFondoDespues;
    }

    public void setA_colorFondoDespues(Color a_colorFondoDespues) {
        this.a_colorFondoDespues = a_colorFondoDespues;
    }

    public int getA_numerCaracterres() {
        return a_numerCaracterres;
    }

    public void setA_numerCaracterres(int a_numerCaracterres) {
        this.a_numerCaracterres = a_numerCaracterres;
    }

    public Color getA_colorTextoAntes() {
        return a_colorTextoAntes;
    }

    public void setA_colorTextoAntes(Color a_colorTextoAntes) {
        this.a_colorTextoAntes = a_colorTextoAntes;
    }

    public Color getA_colorTextoDespues() {
        return a_colorTextoDespues;
    }

    public void setA_colorTextoDespues(Color a_colorTextoDespues) {
        this.a_colorTextoDespues = a_colorTextoDespues;
    }
    
        

    
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        }

    @Override
    public void keyReleased(KeyEvent e) {
       
        
        if(this.getText().length() >= a_numerCaracterres){
        this.setBackground(a_colorFondoAntes);
        this.setForeground(a_colorTextoAntes);
        
        }else{
            
            this.setBackground(a_colorFondoDespues);
            this.setForeground(a_colorTextoDespues);
    
        }
    }
    }


    
    

    

