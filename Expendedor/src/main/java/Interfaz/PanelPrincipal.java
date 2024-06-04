package Interfaz;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra el contenido de la ventana, contiene a PanelExpendedor y PanelComprador, quienes están compuestos de más paneles que componen toda la escena.
 */
public class PanelPrincipal extends JPanel {
    private PanelComprador comprador;
    private PanelExpendedor expendedor;

    public PanelPrincipal(){
        super();
        setLayout(null);
        comprador = new PanelComprador();
        expendedor = new PanelExpendedor();
        add(comprador);
        add(expendedor);
    }

    /**
     * Override de paintComponent, pinta el contenido del panel.
     * @param g the <code>Graphics</code> object to protect
     */

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}