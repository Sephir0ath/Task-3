package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonTomarProducto extends JButton {
    public static boolean dispensadorVacio = true;
    public ButtonTomarProducto() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(125, 635, 150, 100);
        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Se saca el producto de la expendedora.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                if (!dispensadorVacio){
                    setIcon(null);
                    dispensadorVacio = true;
                    PanelComprador.getComprador().consumir();
                    Window.frame().repaint();
                }
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                if (!dispensadorVacio) {
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource("azul.png")));
                }
            }

            /**
             * Evento ejecutado al entrar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!dispensadorVacio) {
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource("azul.png")));
                }
            }

            /**
             * Evento ejecutado al salir del botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                if (!dispensadorVacio) {
                    setIcon(null);
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!dispensadorVacio){
            if (PanelComprador.getComprador().getProducto().consumir() == "CocaCola"){
                g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("rojo.png"))).getImage(), 5, 19, null);
            }
            else if (PanelComprador.getComprador().getProducto().consumir() == "Sprite"){
                g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("verde.png"))).getImage(), 5, 19, null);
            }
            else if (PanelComprador.getComprador().getProducto().consumir() == "Fanta"){
                g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("naranjo.png"))).getImage(), 5, 19, null);
            }
            else if (PanelComprador.getComprador().getProducto().consumir() == "Snickers"){
                g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("morado.png"))).getImage(), 5, 19, null);
            }
            else {
                g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("celeste.png"))).getImage(), 5, 19, null);
            }
        }
    }
}
