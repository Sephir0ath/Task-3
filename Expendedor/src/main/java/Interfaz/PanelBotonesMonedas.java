package Interfaz;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra las monedas que el comprador puede seleccionar para comprar.
 */
public class PanelBotonesMonedas extends JPanel {
    private ButtonMoneda100 moneda100;
    private ButtonMoneda500 moneda500;
    private ButtonMoneda1000 moneda1000;
    private ButtonMoneda1500 moneda1500;

    /**
     * Constructor en el cual se asignan las características del panel y se inicializan los botones de las monedas.
     */
    public PanelBotonesMonedas() {
        super();
        setLayout(null);
        setOpaque(false);
        setBounds(0, 50, 400, 110);

        moneda100 = new ButtonMoneda100();
        moneda500 = new ButtonMoneda500();
        moneda1000 = new ButtonMoneda1000();
        moneda1500 = new ButtonMoneda1500();

        moneda100.setBounds(16,16,80,80);
        moneda500.setBounds(112,16,80,80);
        moneda1000.setBounds(208,16,80,80);
        moneda1500.setBounds(304,16,80,80);

        add(moneda100);
        add(moneda500);
        add(moneda1000);
        add(moneda1500);

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar un rectángulo de fondo, es solo para ver el tamaño del panel, luego se borrará.
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

}
