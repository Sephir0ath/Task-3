package Interfaz;

import javax.swing.*;
import java.awt.*;
import static Interfaz.ButtonTomarProducto.dispensadorVacio;

/**
 * Panel que muestra el dispensador y contiene el botón para recoger el producto.
 */
public class PanelDispensador extends JPanel{
    private static ButtonTomarProducto dispensador;

    /**
     * Cosntructor que personaliza el panel, añade el botón que contiene.
     */
    public PanelDispensador() {
        super();
        setLayout(null);
        setOpaque(false);
        setBounds(29, 635, 200, 100);
        dispensador = new ButtonTomarProducto();
        add(dispensador);
    }

    /**
     * Getter que obtiene el botón, basicamnete el estado de la dispensadora, si tiene un producto o está vacía.
     * @return ButtonTomarProducto el botón que contiene la información de la dispensadora.
     */
    public JButton getDispensador() {
        return dispensador;
    }

    /**
     * Override de PaintComponent, dibuja la puerta cerrada o abierta del dispensador según el booleano contenido en el botón.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            if (dispensadorVacio) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("dispensadorVacio.png")).getImage(), 0, 0, null);
            }
            else {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProducto.png")).getImage(), 0, 0, null);
            }
        }
        catch (Exception e) {

        }
    }
}
