package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Botón que reinicia la expendedora, se regeneran los productos en los depósitos.
 */
public class ButtonResetear extends JButton {

    /**
     * Constructor que configura las características del botón.
     */
    public ButtonResetear() {
        super();
        setBackground(new Color(0, 0, 0, 0));
        setBounds(404, 514, 60, 25);
        setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonResetear.png")));

        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Reinicia los valores ligados a la expendedora.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonResetearPressed.png")));
                PanelExpendedor.reinicioExpendedor();
                Window.frame().repaint();
                new MessageWindow("Reiniciado correctamente");
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonResetearShaded.png")));
            }

            /**
             * Evento ejecutado al tener el mouse en el botón. El botón está oscurecido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonResetearShaded.png")));
            }

            /**
             * Evento ejecutado al sacar el mouse del botón. El botón deja de estar oscurecido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonResetear.png")));;
            }
        });
    }
}