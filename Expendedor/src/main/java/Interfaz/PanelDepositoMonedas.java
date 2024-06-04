package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra el depósito de monedas del expendedor.
 */
public class PanelDepositoMonedas extends JPanel{
    private int limiteSuperior = 0;
    /**
     * Constructor que personaliza el panel.
     */
    public PanelDepositoMonedas() {
        super();
        setLayout(null);
        setOpaque(false);
        setBounds(270, 644, 199, 90);
    }

    /**
     * Override de paintComponent(g) para dibujar las monedas que están en el depósito de monedas.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i=0; i < PanelExpendedor.getExpendedor().depositoSize("depositoMonedas"); i++){
            if (i >= 21) {
                limiteSuperior++;
            }
            Moneda moneda = PanelExpendedor.getExpendedor().getMoneda(i, "depositoMonedas");
            if (moneda.getValor() == 100) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda100Depositada.png")).getImage(), 0+20*limiteSuperior,81-(4*i)+limiteSuperior*81, null );
            }
            else if (moneda.getValor() == 500) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda500Depositada.png")).getImage(), 0+20*limiteSuperior,81-(4*i)+limiteSuperior*81, null );
            }
            else if (moneda.getValor() == 1000) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda1000Depositada.png")).getImage(),0+20*limiteSuperior,81-(4*i)+limiteSuperior*81, null );
            }
            else if (moneda.getValor() == 1500) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda1500Depositada.png")).getImage(),0+20*limiteSuperior,81-(4*i)+limiteSuperior*81, null );
            }
        }
    }
}
