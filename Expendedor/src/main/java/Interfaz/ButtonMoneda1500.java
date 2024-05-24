package Interfaz;

import Classes.Deposito;
import Classes.Moneda;
import Classes.Moneda1500;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonMoneda1500 extends JButton{
    public ButtonMoneda1500(Deposito<Moneda> deposito){
        super("1500");
        this.setBackground(Color.ORANGE);
        this.setForeground(Color.BLACK);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.add(new Moneda1500());
            }
        });

    }
}
