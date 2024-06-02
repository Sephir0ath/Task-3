package Interfaz;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra la cantidad de productos en los depósitos y contiene el botón de seleccionar producto.
 */
public class PanelDepositoProductos extends JPanel {
    private ButtonCoca coca;
    private ButtonSprite sprite;
    private ButtonFanta fanta;
    private ButtonSnickers snickers;
    private ButtonSuper8 super8;

    /**
     * Constructor por defecto, perzonaliza e inicializa el panel y los botones que contiene.
     */
    public PanelDepositoProductos() {
        super();
        setLayout(null);
        setOpaque(false);
        setBounds(85, 241, 238, 218);

        coca = new ButtonCoca();
        sprite = new ButtonSprite();
        fanta = new ButtonFanta();
        snickers = new ButtonSnickers();
        super8 = new ButtonSuper8();

        add(coca);
        add(sprite);
        add(fanta);
        add(snickers);
        add(super8);
    }

    /**
     * Override de paintComponent(g) para dibujar los productos de los depósitos.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i=1; i < PanelExpendedor.getExpendedor().depositoSize("depositoCoca"); i++) {
            int j = 5 - PanelExpendedor.getExpendedor().depositoSize("depositoCoca") ;
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoCocaShaded.png")).getImage(), 35-(i*7)-(j*7), 0, null);
        }
        for (int i=1; i < PanelExpendedor.getExpendedor().depositoSize("depositoSprite"); i++) {
            int j = 5 - PanelExpendedor.getExpendedor().depositoSize("depositoSprite") ;
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSpriteShaded.png")).getImage(), 124-(i*7)-(j*7), 0, null);
        }
        for (int i=1; i < PanelExpendedor.getExpendedor().depositoSize("depositoFanta"); i++) {
            int j = 5 - PanelExpendedor.getExpendedor().depositoSize("depositoFanta") ;
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoFantaShaded.png")).getImage(), 213-(i*7)-(j*7), 0, null);
        }
        for (int i=1; i < PanelExpendedor.getExpendedor().depositoSize("depositoSnickers"); i++) {
            int j = 5 - PanelExpendedor.getExpendedor().depositoSize("depositoSnickers") ;
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSnickersShaded.png")).getImage(), 80-(i*7)-(j*7), 176, null);
        }
        for (int i=1; i < PanelExpendedor.getExpendedor().depositoSize("depositoSuper8"); i++) {
            int j = 5 - PanelExpendedor.getExpendedor().depositoSize("depositoSuper8") ;
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSuper8Shaded.png")).getImage(), 169-(i*7)-(j*7), 176, null);
        }
    }
}
