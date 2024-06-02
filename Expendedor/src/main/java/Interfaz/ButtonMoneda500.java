package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase utilizada para el botón de la moneda de 500.
 */
public class ButtonMoneda500 extends JButton {
    private Moneda moneda500;

    /**
     * Constructor inicializa las configuraciones y la moneda de 500.
     */
    public ButtonMoneda500(){
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));

        moneda500 = new Moneda500();
        setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda500.png")));
        setToolTipText(String.valueOf(moneda500.getSerie()));

        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Se ingresa la moneda a la expendedora.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda500pressed.png")));
                if(!PanelIngreso.monedaYaIngresada()) {
                    PanelIngreso.setPago(moneda500);
                    Window.frame().repaint();
                    moneda500 = new Moneda500();
                    setToolTipText(String.valueOf(moneda500.getSerie()));
                }
                else {
                    // Ventana emergente indicando que ya hay una moneda
                }
            }

            /**
             * Evento ejecutado al soltar el botón. La moneda está oscurecida.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda500shaded.png")));
            }

            /**
             * Evento ejecutado al tener el mouse en el botón. La moneda está oscurecida.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda500shaded.png")));

            }

            /**
             * Evento ejecutado al sacar el mouse del botón. La moneda deja de estar oscurecida.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda500.png")));
            }
        });
    }
}
