package Interfaz;

import Classes.*;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private ButtonMoneda100 boton100;
    private Deposito<Moneda> depositoMonedas;
    public PanelComprador(){
        super();
        depositoMonedas = new Deposito<>();

        this.setPreferredSize(new Dimension(450, 800));
        this.setLayout(new GridLayout());


        boton100 = new ButtonMoneda100(this.depositoMonedas);

        this.add(boton100);

    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.gray);
        g.fillRect(0, 0, 450, 800);


    }

}
