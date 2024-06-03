package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonSuper8 extends JButton {

    /**
     * Constructor inicializa las configuraciones y el Super8 a comprar.
     */
    public ButtonSuper8() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(134, 176, 32, 43);
        if (PanelExpendedor.getExpendedor().depositoSize("depositoSuper8") != 0) {
            setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSuper8.png")));
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
             * Evento ejecutado al presionar el botón. Se selecciona el Super8.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                if (PanelExpendedor.getExpendedor().depositoSize("depositoSuper8") != 0) {
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSuper8Pressed.png")));
                    ButtonComprar.producto = Productos.SUPER8;
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
                if (PanelExpendedor.getExpendedor().depositoSize("depositoSuper8") != 0) {
                    if (ButtonComprar.producto == Productos.SUPER8) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSuper8Pressed.png")));
                    } else {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSuper8Shaded.png")));
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
                if (PanelExpendedor.getExpendedor().depositoSize("depositoSuper8") != 0) {
                    if (ButtonComprar.producto == Productos.SUPER8) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSuper8Pressed.png")));
                    } else {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSuper8Shaded.png")));
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
                if (PanelExpendedor.getExpendedor().depositoSize("depositoSuper8") != 0) {
                    if (ButtonComprar.producto == Productos.SUPER8) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSuper8Pressed.png")));
                    } else {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSuper8.png")));
                    }
                }
                else{
                    setIcon(null);
                }
            }
        });
    }
}