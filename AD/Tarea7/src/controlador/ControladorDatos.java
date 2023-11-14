package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import modelo.Modelo;
import vista.informacion;



public class ControladorDatos implements MouseListener {

    private informacion view = new informacion();

    public void run() {

        view.setVisible(true);

        view.jue.addMouseListener(this);
        view.ju.addMouseListener(this);
        view.ls2.addMouseListener(this);
        view.adios.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getComponent().getName().equalsIgnoreCase("jugadores")) {

            JTableHeader tableHeader = view.jTable1.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            tableColumnModel.getColumn(0).setHeaderValue("id_jugador");
            tableColumnModel.getColumn(1).setHeaderValue("alias");
            tableColumnModel.getColumn(2).setHeaderValue("nombre");
            tableHeader.repaint();

            DefaultTableModel modelo = (DefaultTableModel) view.jTable1.getModel();
            modelo.setRowCount(0);

            ArrayList<String[]> al = Modelo.jugador();
            for (String[] strings : al) {
                modelo.addRow(strings);
            }

        } else if (e.getComponent().getName().equalsIgnoreCase("juegos")) {

            JTableHeader tableHeader = view.jTable1.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            tableColumnModel.getColumn(0).setHeaderValue("id_juego");
            tableColumnModel.getColumn(1).setHeaderValue("nombre");
            tableColumnModel.getColumn(2).setHeaderValue("tipo");
            tableHeader.repaint();

            DefaultTableModel modelo = (DefaultTableModel) view.jTable1.getModel();
            modelo.setRowCount(0);
            
            ArrayList<String[]> al = Modelo.juego();

            for (String[] strings : al) {
                modelo.addRow(strings);
            }

        } else if (e.getComponent().getName().equalsIgnoreCase("ambos")) {
            JTableHeader tableHeader = view.jTable1.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            tableColumnModel.getColumn(0).setHeaderValue("Nombre Jugador");
            tableColumnModel.getColumn(1).setHeaderValue("Nombre Juego");
            tableColumnModel.getColumn(2).setHeaderValue("Ultima Sesion");
            tableHeader.repaint();

            DefaultTableModel modelo = (DefaultTableModel) view.jTable1.getModel();
            modelo.setRowCount(0);
            
             ArrayList<String[]> al = Modelo.jugadorSesionJuego();

            for (String[] strings : al) {
                modelo.addRow(strings);
            }

        } else if (e.getComponent().getName().equalsIgnoreCase("exit")) {

            System.exit(0);
        }
    }

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