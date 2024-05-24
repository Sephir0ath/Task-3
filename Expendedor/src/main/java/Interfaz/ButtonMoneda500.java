package Interfaz;

import Classes.Deposito;
import Classes.Moneda;
import Classes.Moneda500;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonMoneda500 extends JButton {
    private Deposito<Moneda> deposito;

    public ButtonMoneda500(Deposito<Moneda> deposito){
        super("500");
        this.setBackground(Color.GREEN);
        this.setForeground(Color.BLACK);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.add(new Moneda500());
            }
        });

    }
}
