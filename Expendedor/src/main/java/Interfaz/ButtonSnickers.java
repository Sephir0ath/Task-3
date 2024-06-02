package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonSnickers extends JButton {

    /**
     * Constructor inicializa las configuraciones y el Snickers a comprar..
     */
    public ButtonSnickers(){
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(90, 340, 90, 130);

        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Se selecciona el Snickers.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                ButtonComprar.producto = Productos.SNICKERS;
                Window.frame().repaint();
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("azul.png")));
            }

            /**
             * Evento ejecutado al entrar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("azul.png")));

            }

            /**
             * Evento ejecutado al salir del botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    /**
     * Override de paintComponent.
     * @param g the <code>Graphics</code> object to protect.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        seleccion();
    }

    /**
     * Método que remarca el objeto seleccionado.
     */
    public void seleccion() {
        if (ButtonComprar.producto == Productos.SNICKERS){
            setIcon(new ImageIcon(getClass().getClassLoader().getResource("azul.png")));
        }
        else {
            setIcon(null);
        }
    }
}
