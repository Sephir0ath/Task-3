package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;

/**
 * Panel que permite ver la moneda ingresada.
 */
public class PanelIngreso extends JPanel {
    public static Moneda moneda = null;

    /**
     * Constructor para personalizar el panel.
     */
    public PanelIngreso() {
        super();
        setOpaque(false);
        setBounds(445,190,30,15);
    }

    /**
     * Setter que obtiene la moneda para el pago.
     * @param pago Moneda que se ingresó para pagar.
     */
    public static void setPago(Moneda pago) {
        moneda = pago;
    }
    /**
     * Getter de la moneda ingresada, la obtiene para sacarla del panel.
     * @return Moneda ingresada para el pago.
     */
    public static Moneda getPago() {
        Moneda pago = moneda;
        moneda = null;
        return pago;
    }

    /**
     * Método que permite saber si ya hay una moneda en el panel.
     * @return True si ya hay una moneda, False si no hay moneda.
     */
    public static boolean monedaYaIngresada() {
        if (moneda == null) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Override de paintComponent. Dibuja las monedas en el panel.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon imageIcon;
        Image image;
        if (moneda.getValor() == 100) {
            image = (new ImageIcon(getClass().getClassLoader().getResource("rojo.png"))).getImage();
            g.drawImage(image, 0, 0, null);
        }
        else if (moneda.getValor() == 500) {
            image = (new ImageIcon(getClass().getClassLoader().getResource("rojo.png"))).getImage();
            g.drawImage(image, 0, 0, null);
        }
        else if (moneda.getValor() == 1000) {
            image = (new ImageIcon(getClass().getClassLoader().getResource("rojo.png"))).getImage();
            g.drawImage(image, 0, 0, null);
        }
        else {
            image = (new ImageIcon(getClass().getClassLoader().getResource("rojo.png"))).getImage();
            g.drawImage(image, 0, 0, null);
        }

    }

}
