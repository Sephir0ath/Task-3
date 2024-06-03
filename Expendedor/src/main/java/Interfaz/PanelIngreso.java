package Interfaz;

import Classes.Moneda;

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
        setLayout(null);
        setOpaque(false);
        setBounds(405, 238, 60, 50);
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
        try {
            if (moneda.getValor() == 100) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda100Ingresada.png")).getImage(), 0, 0, null);
            }
            else if (moneda.getValor() == 500) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda500Ingresada.png")).getImage(), 0, 0, null);
            }
            else if (moneda.getValor() == 1000) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda1000Ingresada.png")).getImage(), 0, 0, null);
            }
            else if (moneda.getValor() == 1500) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda1500Ingresada.png")).getImage(), 0, 0, null);
            }
        }
        catch (Exception e) {

        }
    }
}
