package Interfaz;

import Classes.*;
import Excepciones.NoHayProductoException;
import Excepciones.PagoIncorrectoException;
import Excepciones.PagoInsuficienteException;

import javax.swing.*;
import java.awt.*;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que reinicia la expendedora, se regeneran los productos en los depósitos.
 */
public class ButtonResetear extends JButton {

    /**
     * Constructor que configura las características del botón.
     */
    public ButtonResetear() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setIcon(new ImageIcon(getClass().getClassLoader().getResource("morado.png")));

        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Reinicia los valores ligados a la expendedora.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("verde.png")));
                PanelExpendedor.reinicioExpendedor();
                Window.frame().repaint();
                // Crear ventana emergente diciendo que se reinició
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("verde.png")));
            }

            /**
             * Evento ejecutado al entrar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("verde.png")));
            }

            /**
             * Evento ejecutado al salir del botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("morado.png")));;
            }
        });
    }
}