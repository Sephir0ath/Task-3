package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase utilizada para el botón de la moneda de 1000.
 */
public class ButtonMoneda1000 extends JButton{
    private Moneda moneda1000;

    /**
     * Constructor inicializa las configuraciones y la moneda de 1000.
     */
    public ButtonMoneda1000(){
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));

        moneda1000 = new Moneda1000();
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
             * Evento ejecutado al presionar el botón. Se ingresa la moneda a la expendedora.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("rojo.png")));
                //Añadir lógica de ingresar monedas y deteccion de si hay una moneda antes en el expendedor.
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
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("rojo.png")));
            }
        });
    }
}
