package Interfaz;

import Classes.Deposito;
import Classes.Moneda;

import javax.swing.*;
import java.awt.*;

public class PanelBotonesMonedas extends JPanel {
    private ButtonMoneda100 boton100;
    private ButtonMoneda500 boton500;
    private ButtonMoneda1000 boton1000;
    private ButtonMoneda1500 boton1500;


    public PanelBotonesMonedas(Deposito<Moneda> deposito){
        super();
        this.setLayout(new GridLayout(1, 4, 10, 10));
        this.setPreferredSize(new Dimension(100, 100));
        this.setBackground(Color.lightGray);

        boton100 = new ButtonMoneda100(deposito);
        boton500 = new ButtonMoneda500(deposito);
        boton1000 = new ButtonMoneda1000(deposito);
        boton1500 = new ButtonMoneda1500(deposito);

        this.add(boton100);
        this.add(boton500);
        this.add(boton1000);
        this.add(boton1500);



    }


}
