package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonSprite extends JButton {

    /**
     * Constructor inicializa las configuraciones y la Sprite a comprar.
     */
    public ButtonSprite(){
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(260, 160, 70, 130);

        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Se selecciona la Sprite.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                ButtonComprar.producto = Productos.SPRITE;
                Window.frame().repaint();
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("rojo.png")));
            }

            /**
             * Evento ejecutado al entrar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("rojo.png")));

            }

            /**
             * Evento ejecutado al salir del botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("verde.png")));
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
        if (ButtonComprar.producto == Productos.SPRITE){
            setIcon(new ImageIcon(getClass().getClassLoader().getResource("rojo.png")));
        }
        else {
            setIcon(null);
        }
    }
}
