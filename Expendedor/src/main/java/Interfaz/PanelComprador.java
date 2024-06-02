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
     * Constructor
     */
    public PanelComprador() {
        super();
        this.comprador = new Comprador();
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
     * Override del método paintComponent(g), personaliza visualmente el panel y su contenido.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Zona producto comprado
        g.setColor(Color.BLUE);
        g.fillRect(70, 210, 260, 300);
        
        // Zona vuelto (monedero que se le suma el vuelto), dibujar los items
        g.setColor(Color.GREEN);
        g.fillRect(70, 560, 260, 150);
        
        
        //Poner suma del vuelto acumulado !!!!
    }
}
