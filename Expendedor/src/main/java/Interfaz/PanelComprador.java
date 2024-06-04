package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra al comprador y su inventario.
 */
public class PanelComprador extends JPanel {
    private static Comprador comprador;
    private PanelBotonesMonedas BotonesMonedas;

    /**
     * Constructor que personaliza el panel e inicializa el panelBotonesMoneda que contiene.
     */
    public PanelComprador() {
        super();
        comprador = new Comprador();
        setLayout(null);
        setOpaque(false);
        setBounds(500,0,400, 800);

        BotonesMonedas = new PanelBotonesMonedas();
        add(BotonesMonedas);
    }

    /**
     * Getter de comprador.
     * @return comprador que compra el producto.
     */
    public static Comprador getComprador() {
        return comprador;
    }

    /**
     * Override del método paintComponent(g), personaliza visualmente el panel y su contenido, pinta el fondo, el producto comprado y la cifra del vuelto total.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("panelComprador.png"));
        g.drawImage(imageIcon.getImage(), 0, 0, null);
        if (PanelComprador.getComprador().queConsumiste() == "CocaCola"){
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("miproductoCoca.png")).getImage(), 100, 220, null);
        }
        else if (PanelComprador.getComprador().queConsumiste() == "Sprite"){
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("miproductoSprite.png")).getImage(), 100, 220, null);
        }
        else if (PanelComprador.getComprador().queConsumiste() == "Fanta"){
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("miproductoFanta.png")).getImage(), 100, 220, null);
        }
        else if (PanelComprador.getComprador().queConsumiste() == "Snickers"){
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("miproductoSnickers.png")).getImage(), 100, 230, null);
        }
        else if (PanelComprador.getComprador().queConsumiste() == "Super8"){
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("miproductoSuper8.png")).getImage(), 100, 210, null);
        }
        else{
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("miproductoNone.png")).getImage(), 100, 230, null);
        }

        try {
            String vueltoString = Integer.toString(PanelComprador.getComprador().cuantoVuelto());
            int posicionX = 0;
            for (int i = 2; i < vueltoString.length(); i++) {
                posicionX += 14;
            }
            for (int i = 0; i <= vueltoString.length(); i++) {
                if (i == 0) {
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVueltoPeso.png"));
                }
                else {
                    char numero = vueltoString.charAt(i - 1);
                    if (numero == '0') {
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVuelto0.png"));
                    }
                    else if (numero == '1') {
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVuelto1.png"));
                    }
                    else if (numero == '2') {
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVuelto2.png"));
                    }
                    else if (numero == '3') {
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVuelto3.png"));
                    }
                    else if (numero == '4') {
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVuelto4.png"));
                    }
                    else if (numero == '5') {
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVuelto5.png"));
                    }
                    else if (numero == '6') {
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVuelto6.png"));
                    }
                    else if (numero == '7') {
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVuelto7.png"));
                    }
                    else if (numero == '8') {
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVuelto8.png"));
                    }
                    else if (numero == '9'){
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("numVuelto9.png"));
                    }
                }
                g.drawImage(imageIcon.getImage(),186-posicionX + 14*i, 607,null);
            }
        }
        catch (IndexOutOfBoundsException e) {
        }
    }
}
