package Interfaz;

import Classes.*;
import Excepciones.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonComprar extends JButton {
    public static Productos producto = null;

    /**
     * Constructor que personaliza las características del botón.
     */
    public ButtonComprar(){
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setIcon(new ImageIcon(getClass().getClassLoader().getResource("amarillo.png")));

        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Compra el producto seleccionado.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("rojo.png")));
                if(ButtonTomarProducto.dispensadorVacio) try {
                    PanelComprador.getComprador().comprar(PanelIngresarMoneda.getPago(), Productos.COCACOLA, PanelExpendedor.getExpendedor());
                    ButtonTomarProducto.dispensadorVacio = false;
                    // PanelExpendedor.actualizarTipText();
                    Window.frame().repaint();
                }
                catch (NoHayProductoException f) {
                    // Crear ventana emergente
                }
                catch (PagoIncorrectoException f) {
                    // Crear ventana emergente
                }
                catch (PagoInsuficienteException f) {
                    // Crear ventana emergente
                }
                finally {
                    PanelIngresarMoneda.setPago(null);
                    producto = null;
                    Window.frame().repaint();
                }
                else {
                    // Hay producto en el dispensador, crear ventana emergente
                }
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
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("amarillo.png")));;
            }
        });
    }
}
