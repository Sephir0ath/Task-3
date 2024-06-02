package Interfaz;

import javax.swing.*;

public class PanelBotonesCompra extends JPanel {
    private ButtonComprar comprar;
    private ButtonCancelar cancelar;
    private ButtonResetear resetear;
    public PanelBotonesCompra(){
        super();
        setLayout(null);
        setOpaque(false);
        setBounds(400, 120, 70, 190);

        comprar = new ButtonComprar();
        cancelar = new ButtonCancelar();
        resetear = new ButtonResetear();

        comprar.setBounds(0,0,70,50);
        cancelar.setBounds(0, 70, 70, 50);
        resetear.setBounds(0,140,70,50);

        add(comprar);
        add(cancelar);
        add(resetear);
    }
}
