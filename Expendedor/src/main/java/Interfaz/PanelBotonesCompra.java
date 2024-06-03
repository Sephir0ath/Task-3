package Interfaz;

import javax.swing.*;

/**
 * Panel que contiene los botones de Comprar y Cancelar.
 */
public class PanelBotonesCompra extends JPanel {
    private ButtonComprar comprar;
    private ButtonCancelar cancelar;

    /**
     * Constructor que configura el panel y añade los botones.
     */
    public PanelBotonesCompra(){
        super();
        setLayout(null);
        setOpaque(false);
        setBounds(404, 149, 60, 60);

        comprar = new ButtonComprar();
        cancelar = new ButtonCancelar();

        add(comprar);
        add(cancelar);
    }
}
