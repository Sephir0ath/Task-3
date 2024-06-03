package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonSnickers extends JButton {

    /**
     * Constructor inicializa las configuraciones y elSnickers a comprar.
     */
    public ButtonSnickers() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(45, 176, 32, 43);
        if (PanelExpendedor.getExpendedor().depositoSize("depositoSnickers") != 0) {
            setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSnickers.png")));
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
             * Evento ejecutado al presionar el botón. Se selecciona el Snickers.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                if (PanelExpendedor.getExpendedor().depositoSize("depositoSnickers") != 0) {
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSnickersPressed.png")));
                    ButtonComprar.producto = Productos.SNICKERS;
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
                if (PanelExpendedor.getExpendedor().depositoSize("depositoSnickers") != 0) {
                    if (ButtonComprar.producto == Productos.SNICKERS) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSnickersPressed.png")));
                    } else {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSnickersShaded.png")));
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
                if (PanelExpendedor.getExpendedor().depositoSize("depositoSnickers") != 0) {
                    if (ButtonComprar.producto == Productos.SNICKERS) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSnickersPressed.png")));
                    } else {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSnickersShaded.png")));
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
                if (PanelExpendedor.getExpendedor().depositoSize("depositoSnickers") != 0) {
                    if (ButtonComprar.producto == Productos.SNICKERS) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSnickersPressed.png")));
                    } else {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonproductoSnickers.png")));
                    }
                }
                else{
                    setIcon(null);
                }
            }
        });
    }
}