package Interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelBotonesCompra extends JPanel {
    private ButtonComprar botonComprar;
    private ButtonCancelar botonCancelar;

    public PanelBotonesCompra(){
        super();
        this.setLayout(new GridLayout(1, 4, 10, 10));
        this.setPreferredSize(new Dimension(100, 75));
        this.setBackground(Color.lightGray);

        this.add(new ButtonComprar());
        this.add(new ButtonCancelar());

    }
}
