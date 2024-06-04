package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Botón que permite escoger la Fanta como producto a comprar.
 */
public class ButtonFanta extends JButton {

    /**
     * Constructor inicializa las configuraciones y la Fanta a comprar.
     */
    public ButtonFanta() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(178, 0, 32, 43);
        if (PanelExpendedor.getExpendedor().depositoSize("depositoFanta") != 0) {
            setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoFanta.png")));
        }
        else{
            setIcon(null);
        }
        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Se selecciona la Fanta.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                if (PanelExpendedor.getExpendedor().depositoSize("depositoFanta") != 0) {
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoFantaPressed.png")));
                    ButtonComprar.producto = Productos.FANTA;
                    Window.frame().repaint();
                }
                else{
                    setIcon(null);
                }

            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                if (PanelExpendedor.getExpendedor().depositoSize("depositoFanta") != 0) {
                    if (ButtonComprar.producto == Productos.FANTA) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoFantaPressed.png")));
                    } else {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoFantaShaded.png")));
                    }
                }
                else{
                    setIcon(null);
                }
            }

            /**
             * Evento ejecutado al tener el mouse en el botón. El botón se oscurece.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                if (PanelExpendedor.getExpendedor().depositoSize("depositoFanta") != 0) {
                    if (ButtonComprar.producto == Productos.FANTA) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoFantaPressed.png")));
                    } else {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoFantaShaded.png")));
                    }
                }
                else{
                    setIcon(null);
                }
            }

            /**
             * Evento ejecutado al salir del botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                if (PanelExpendedor.getExpendedor().depositoSize("depositoFanta") != 0) {
                    if (ButtonComprar.producto == Productos.FANTA) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoFantaPressed.png")));
                    } else {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoFanta.png")));
                    }
                }
                else{
                    setIcon(null);
                }
            }
        });
    }
}