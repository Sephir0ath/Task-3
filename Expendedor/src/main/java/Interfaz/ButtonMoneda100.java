package Interfaz;

import Classes.Deposito;
import Classes.Moneda;
import Classes.Moneda100;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonMoneda100 extends JButton {
    private Deposito<Moneda> deposito;

    public ButtonMoneda100(Deposito<Moneda> deposito){
        super("100");

        this.deposito = deposito;
        this.setPreferredSize(new Dimension(50, 50));
        this.setBackground(Color.BLUE);
        this.setForeground(Color.BLACK);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.add(new Moneda100());

            }
        });


    }
}
