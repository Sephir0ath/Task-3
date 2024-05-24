package Interfaz;

import Classes.Deposito;
import Classes.Moneda;

import javax.swing.*;
import java.awt.*;

public class PanelBotonesMonedas extends JPanel {

    public PanelBotonesMonedas(Deposito<Moneda> deposito){
        super();
        this.setLayout(new GridLayout(1, 4, 10, 10));
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(100, 75));

        this.add(new ButtonMoneda100(deposito));
        this.add(new ButtonMoneda500(deposito));
        this.add(new ButtonMoneda1000(deposito));
        this.add(new ButtonMoneda1500(deposito));

    }

}
