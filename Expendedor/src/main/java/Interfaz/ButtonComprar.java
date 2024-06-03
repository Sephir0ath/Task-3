package Interfaz;

import Classes.*;
import Excepciones.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Botón que compra el producto seleccionado en la expendedora.
 */
public class ButtonComprar extends JButton {
    public static Productos producto = null;

    /**
     * Constructor que personaliza las características del botón.
     */
    public ButtonComprar(){
        super();
        setBackground(new Color(0, 0, 0, 0));
        setBounds(0,0,60,25);
        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonComprar.png")));

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
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonComprarPressed.png")));
                if (ButtonTomarProducto.dispensadorVacio) try {
                    PanelComprador.getComprador().comprar(PanelIngreso.getPago(), producto, PanelExpendedor.getExpendedor());
                    ButtonTomarProducto.dispensadorVacio = false;
                    Window.frame().repaint();
                }
                catch (NoHayProductoException f) {
                    new MessageWindow("No hay productos actualmente");
                }
                catch (PagoIncorrectoException f) {
                    new MessageWindow("Pago incorrecto");
                }
                catch (PagoInsuficienteException f) {
                    new MessageWindow("Pago insuficiente");
                }
                finally {
                    PanelIngreso.setPago(null);
                    producto = null;
                    Window.frame().repaint();
                }
                else {
                    new MessageWindow("Tome el producto que está debajo de la barra de productos");
                }
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonComprarShaded.png")));
            }

            /**
             * Evento ejecutado al tener el mouse en el botón. El botón está oscurecido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonComprarShaded.png")));
            }

            /**
             * Evento ejecutado al sacar el mouse del botón. El botón deja de estar oscurecido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonComprar.png")));;
            }
        });
    }
}
