/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.ConexionBBDD;
import vista.InicioSesion;

/**
 *
 * @author apena
 */
public class ControladorLogin implements MouseListener {

    // definicion
    private InicioSesion vista = new InicioSesion();

    private Connection con;

    private ControladorDatosBBDD cdbd = new ControladorDatosBBDD();

    //metodo que va a iniciar y ajustar la ventana y los botones
    public void run() {
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        vista.setVisible(true);
        vista.jBentrar.addMouseListener(this);
        vista.jBcancelar.addMouseListener(this);

    }

    /*metodo abstracto utilizado para el logueo en el que cogemos los botones con su nombre e iniciamos la conexion si 
     al hacer la comprobacion el usuario existe(para eso no nos complicamos mucho la vida dos setters con usuario y password y luego cogemos los datos del textfild sustituimos)
    y asi tenemos metodo sencillo y rapido de verificacion*/
    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == vista.jBcancelar) {
            vista.jTcontraseña.setText("");
            vista.jTusuario.setText("");
        } else if (e.getSource() == vista.jBentrar) {
            try {
                ConexionBBDD.setUSER(vista.jTusuario.getText());
                ConexionBBDD.setPASS(vista.jTcontraseña.getText());

                con = ConexionBBDD.getInstance().getConnection();

                vista.dispose();

                cdbd.run();
            } catch (SQLException ex) {
                System.out.println("Algo va mal...");
            }
        }

    }

    /*metodos abstractos que no hemos usado , por defecto al implentar metodos abstractos te los rellenan con una mierda que tienes que quitar
    si no te da errores a compilar */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
