package Interfaz;

import Classes.*;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private Deposito<Moneda> depositoMonedas;
    private PanelBotonesMonedas panelBotonesMonedas;
    private PanelBotonesCompra panelBotonesCompra;

    public PanelComprador(){
        super();
        depositoMonedas = new Deposito<>();
        panelBotonesCompra = new PanelBotonesCompra();
        panelBotonesMonedas = new PanelBotonesMonedas(this.depositoMonedas);

        this.setLayout(new GridLayout(6, 1));
        Label label = new Label();
        label.setBackground(Color.GRAY);
        this.add(label);
        this.add(panelBotonesMonedas, BorderLayout.NORTH);
        this.setPreferredSize(new Dimension(450, 800));

        this.add(panelBotonesCompra);
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GRAY);
        g.fillRect(0, 0, 450, 800);

    }
}
