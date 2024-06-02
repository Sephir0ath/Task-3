package Interfaz;

import Classes.*;
import Excepciones.NoHayProductoException;
import Excepciones.PagoIncorrectoException;
import Excepciones.PagoInsuficienteException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que cancela la compra de la expendedora.
 */
public class ButtonCancelar extends JButton {

    /**
     * Constructor que configura las características del botón.
     */
    public ButtonCancelar() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setIcon(new ImageIcon(getClass().getClassLoader().getResource("rojo.png")));

        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Concreta la compra con una compra nula para cancelar la compra.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("morado.png")));
                if (PanelIngresarMoneda.monedaYaIngresada()) {
                    try {
                        PanelExpendedor.getExpendedor().comprarProducto(PanelIngresarMoneda.getPago(), null);
                    } catch (Exception a) {
                        Window.frame().repaint();
                    } finally {
                        ButtonComprar.producto = null;
                    }
                }
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("morado.png")));
            }

            /**
             * Evento ejecutado al entrar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("morado.png")));
            }

            /**
             * Evento ejecutado al salir del botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("rojo.png")));
            }
        });
    }
}