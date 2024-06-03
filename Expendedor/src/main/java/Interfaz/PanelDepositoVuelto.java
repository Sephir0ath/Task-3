package Interfaz;

import Classes.Moneda;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra el depósito del vuelto del expendedor.
 */
public class PanelDepositoVuelto extends JPanel {
    /**
     * Constructor que personaliza el panel.
     */
    public PanelDepositoVuelto() {
        super();
        setLayout(null);
        setOpaque(false);
        setBounds(422, 361, 23, 82);
    }

    /**
     * Override de paintComponent(g) para dibujar las monedas que están en el depósito de vuelto.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i=1; i < PanelExpendedor.getExpendedor().depositoSize("depositoVuelto"); i++){
            Moneda moneda = PanelExpendedor.getExpendedor().getMoneda(i, "depositoVuelto");
            if (moneda.getValor() == 100) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda100Vuelto.png")).getImage(), 0, 82-(4*i), null );
            }
            else if (moneda.getValor() == 500) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda500Vuelto.png")).getImage(), 0, 82-(4*i), null );
            }
            else if (moneda.getValor() == 1000) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda1000Vuelto.png")).getImage(), 0,82-(4*i), null );
            }
            else if (moneda.getValor() == 1500) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda1500Vuelto.png")).getImage(), 0 ,82-(4*i), null );
            }
        }
    }
}
