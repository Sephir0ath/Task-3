package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonTomarVuelto extends JButton {
    public ButtonTomarVuelto() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(422, 453, 24, 4);

        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al clickear el botón generado por defecto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Se saca la moneda de la expendedora.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(null);
                try {
                    PanelComprador.getComprador().addVuelto(PanelExpendedor.getExpendedor().getVuelto().getValor());
                    Window.frame().repaint();
                }
                catch (Exception f) {

                }
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                if (PanelExpendedor.getExpendedor().depositoSize("depositoVuelto") != 0) {
                    if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 100) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda100VueltoShaded.png")));
                    }
                    else if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 500) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda500VueltoShaded.png")));
                    }
                    else if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 1000) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda1000VueltoShaded.png")));
                    }
                    else if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 1500) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda1500VueltoShaded.png")));
                    }
                }
            }

            /**
             * Evento ejecutado al tener el mouse en el botón. La moneda está oscurecida.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                if (PanelExpendedor.getExpendedor().depositoSize("depositoVuelto") != 0) {
                    if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 100) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda100VueltoShaded.png")));
                    }
                    else if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 500) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda500VueltoShaded.png")));
                    }
                    else if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 1000) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda1000VueltoShaded.png")));
                    }
                    else if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 1500) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("moneda1500VueltoShaded.png")));
                    }
                }
            }

            /**
             * Evento ejecutado al sacar el mouse del botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(null);
            }
        });
    }

    /**
     * Override de paintComponent. Pinta la moneda del index 0 del deposito de Vuelto.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 100) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda100Vuelto.png")).getImage(), 0, 0, null);
            }
            else if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 500) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda500Vuelto.png")).getImage(), 0, 0, null);
            }
            else if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 1000) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda1000Vuelto.png")).getImage(), 0, 0, null);
            }
            else if (PanelExpendedor.getExpendedor().getMoneda(0, "depositoVuelto").getValor() == 1500) {
                g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("moneda1500Vuelto.png")).getImage(), 0, 0, null);
            }
        }
        catch (Exception e) {

        }
    }
}

