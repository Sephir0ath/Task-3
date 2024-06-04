package Interfaz;

import Classes.Productos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

/**
 * Botón para tomar el producto comprado.
 */
public class ButtonTomarProducto extends JButton {
    public static boolean dispensadorVacio = true;
    /**
     * Constructor que personaliza el botón.
     */
    public ButtonTomarProducto() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(70, 60, 60, 40);

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
                    String producto = PanelComprador.getComprador().getProducto().consumir();
                    if (producto == "CocaCola"){
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoCocaShaded.png")));
                    }
                    else if (producto == "Sprite"){
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoSpriteShaded.png")));
                    }
                    else if (producto == "Fanta"){
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoFantaShaded.png")));
                    }
                    else if (producto == "Snickers"){
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoSnickersShaded.png")));
                    }
                    else if (producto == "Super8"){
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoSuper8Shaded.png")));
                    }
                }
            }

            /**
             * Evento ejecutado al tener el mouse en el botón. El producto está oscurecido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!dispensadorVacio) {
                    String producto = PanelComprador.getComprador().getProducto().consumir();
                    if (Objects.equals(producto, "CocaCola")){
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoCocaShaded.png")));
                    }
                    else if (Objects.equals(producto, "Sprite")){
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoSpriteShaded.png")));
                    }
                    else if (Objects.equals(producto, "Fanta")){
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoFantaShaded.png")));
                    }
                    else if (Objects.equals(producto, "Snickers")){
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoSnickersShaded.png")));
                    }
                    else if (Objects.equals(producto, "Super8")){
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoSuper8Shaded.png")));
                    }
                }
            }

            /**
             * Evento ejecutado al sacar el mouse del botón. El producto deja de estar oscurecido.
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
        try {
            if (!dispensadorVacio){
                String producto = PanelComprador.getComprador().getProducto().consumir();
                if (Objects.equals(producto, "CocaCola")){
                    g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoCoca.png"))).getImage(), 0, 0, null);
                }
                else if (Objects.equals(producto, "Sprite")){
                    g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoSprite.png"))).getImage(), 0, 0, null);
                }
                else if (Objects.equals(producto, "Fanta")){
                    g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoFanta.png"))).getImage(), 0, 0, null);
                }
                else if (Objects.equals(producto, "Snickers")){
                    g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoSnickers.png"))).getImage(), 0, 0, null);
                }
                else if (Objects.equals(producto, "Super8")){
                    g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("dispensadorProductoSuper8.png"))).getImage(), 0, 0, null);
                }
            }
        }
        catch (Exception e) {
            dispensadorVacio = true;
            new MessageWindow("Seleccione un producto");
            System.err.println(e);
        }
        super.paintComponent(g);
    }
}
