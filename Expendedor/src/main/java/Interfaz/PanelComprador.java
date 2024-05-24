package Interfaz;

import Classes.*;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private Deposito<Moneda> depositoMonedas;
    private PanelBotonesMonedas panelBotonesMonedas;

    public PanelComprador(){
        super();
        depositoMonedas = new Deposito<>();
        panelBotonesMonedas = new PanelBotonesMonedas(this.depositoMonedas);
        panelBotonesMonedas.setPreferredSize(new Dimension(100, 75));
        this.setLayout(new GridLayout(6, 1));

        Label label = new Label();
        label.setBackground(Color.GRAY);
        this.add(label);
        this.add(panelBotonesMonedas, BorderLayout.NORTH);
        this.setPreferredSize(new Dimension(450, 800));

    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.GRAY);
        g.fillRect(0, 0, 450, 800);


    }

}
