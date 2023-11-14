/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.DatosBBDD;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import modelo.Modelo;

/**
 *
 * @author apena
 */
public class ControladorDatosBBDD implements MouseListener {

    //definimos como siempre
    private DatosBBDD dbd = new DatosBBDD();

    //metodo que inicializamos al realizar la conexion para que nos habra esta ventana y hacemos que nos escuchen a los botones
    public void run() {
        dbd.setResizable(false);
        dbd.setLocationRelativeTo(null);
        dbd.setVisible(true);
        dbd.jBjuegos.addMouseListener(this);
        dbd.jBjugadores.addMouseListener(this);
        dbd.jBotros.addMouseListener(this);
        dbd.jBsalir.addMouseListener(this);

    }

    //definimos una tabla para cada boton y a la vez le damos la funcion
    @Override

    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == dbd.jBjugadores) {
            JTableHeader tableHeader = dbd.jTable1.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            tableColumnModel.getColumn(0).setHeaderValue("id_jugador");
            tableColumnModel.getColumn(1).setHeaderValue("alias");
            tableColumnModel.getColumn(2).setHeaderValue("nombre");
            tableHeader.repaint();

            DefaultTableModel modelo = (DefaultTableModel) dbd.jTable1.getModel();
            modelo.setRowCount(0);

            ArrayList<String[]> al = Modelo.jugadores();
            for (String[] strings : al) {
                modelo.addRow(strings);
            }
        } else if (e.getSource() == dbd.jBjuegos) {
            JTableHeader tableHeader = dbd.jTable1.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            tableColumnModel.getColumn(0).setHeaderValue("id_juego");
            tableColumnModel.getColumn(1).setHeaderValue("nombre_juego");
            tableColumnModel.getColumn(2).setHeaderValue("tipo");
            tableHeader.repaint();

            DefaultTableModel modelo = (DefaultTableModel) dbd.jTable1.getModel();
            modelo.setRowCount(0);

            ArrayList<String[]> al = Modelo.juegos();

            for (String[] strings : al) {
                modelo.addRow(strings);
            }
        } else if (e.getSource() == dbd.jBotros) {
            JTableHeader tableHeader = dbd.jTable1.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            tableColumnModel.getColumn(0).setHeaderValue("id_sesion");
            tableColumnModel.getColumn(1).setHeaderValue("id_juego");
            tableColumnModel.getColumn(2).setHeaderValue("id_jugador");
            tableHeader.repaint();

            DefaultTableModel modelo = (DefaultTableModel) dbd.jTable1.getModel();
            modelo.setRowCount(0);

            ArrayList<String[]> al = Modelo.Sesiones();

            for (String[] strings : al) {
                modelo.addRow(strings);
            }
        } else if (e.getSource() == dbd.jBsalir) {
            System.exit(0);
        }

    }

    //metodos abstractos no utilizados
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
