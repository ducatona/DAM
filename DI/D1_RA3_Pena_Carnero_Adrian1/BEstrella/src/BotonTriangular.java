import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.io.Serializable;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JButton;
import javax.swing.Timer;

public class BotonTriangular extends JButton implements Serializable {

    private Timer blinkTimer;
    private int velocidad; // Nueva propiedad

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public BotonTriangular() {
        super();
        setContentAreaFilled(false);
        setBorderPainted(true);
        setFocusPainted(false);
        setForeground(Color.black);
        setBackground(Color.red);
        setPreferredSize(new Dimension(35, 33));
        setSize(35, 33);
        setText("");
        repaint();
        blinkTimer = new Timer(1000, new Blinker());
        blinkTimer.start();
    }

    // Nueva propiedad "velocidad"
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int nuevaVelocidad) {
        int oldVelocidad = this.velocidad;
        this.velocidad = nuevaVelocidad;
        blinkTimer.setDelay(nuevaVelocidad);
        pcs.firePropertyChange("velocidad", oldVelocidad, nuevaVelocidad);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    class Blinker implements ActionListener {
        boolean on = false;

        public void actionPerformed(ActionEvent e) {
            setVisible(on);
            on = !on;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.blue);
        } else {
            g.setColor(Color.green);
        }
        int xPoints[] = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int yPoints[] = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
        Graphics2D g2d = (Graphics2D) g;
        g2d.scale(0.3, 0.3);
        GeneralPath star = new GeneralPath();
        star.moveTo(xPoints[0], yPoints[0]);
        for (int count = 0; count < xPoints.length; count++)
            star.lineTo(xPoints[count], yPoints[count]);
        star.closePath();
        g2d.fill(star);
        super.paintComponent(g2d);
    }

    @Override
    protected void paintBorder(Graphics g) {
    }

    Shape figura;

    @Override
    public boolean contains(int x, int y) {
        figura = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        return figura.contains(x, y);
    }
}
