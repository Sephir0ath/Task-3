package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase utilizada para el botón de la moneda de 100.
 */
public class ButtonMoneda100 extends JButton {
    private Moneda moneda100;

    /**
     * Constructor inicializa las configuraciones y la moneda de 100.
     */
    public ButtonMoneda100(){
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));

        moneda100 = new Moneda100();
        setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda100.png")));
        setToolTipText(String.valueOf(moneda100.getSerie()));

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
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda100pressed.png")));
                if(!PanelIngreso.monedaYaIngresada()) {
                    PanelIngreso.setPago(moneda100);
                    Window.frame().repaint();
                    moneda100 = new Moneda100();
                    setToolTipText(String.valueOf(moneda100.getSerie()));
                }
                else {
                    // Ventana emergente indicando que ya hay una moneda
                }
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda100shaded.png")));
            }

            /**
             * Evento ejecutado al tener el mouse en el botón. La moneda está oscurecida.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda100shaded.png")));

            }

            /**
             * Evento ejecutado al sacar el mouse del botón. La moneda deja de estar oscurecida.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda100.png")));
            }
        });
    }
}
