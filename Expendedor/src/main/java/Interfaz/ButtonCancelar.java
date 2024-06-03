package Interfaz;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Botón que cancela la compra de la expendedora.
 */
public class ButtonCancelar extends JButton {

    /**
     * Constructor que configura las características del botón.
     */
    public ButtonCancelar() {
        super();
        setBackground(new Color(0, 0, 0, 0));
        setBounds(0, 35, 60, 25);
        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonCancelar.png")));

        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Concreta la compra con una compra nula para cancelar la compra.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonCancelarPressed.png")));
                if (PanelIngreso.monedaYaIngresada()) {
                    try {
                        PanelExpendedor.getExpendedor().comprarProducto(PanelIngreso.getPago(), null);
                    } catch (Exception a) {
                        Window.frame().repaint();
                    } finally {
                        ButtonComprar.producto = null;
                        Window.frame().repaint();
                    }
                }
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonCancelarShaded.png")));
            }

            /**
             * Evento ejecutado al tener el mouse en el botón. El botón está oscurecido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonCancelarShaded.png")));
            }

            /**
             * Evento ejecutado al sacar el mouse del botón. El botón deja de estar oscurecido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonCancelar.png")));
            }
        });
    }
}