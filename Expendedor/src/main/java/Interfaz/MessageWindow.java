package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageWindow extends JFrame {
    private String Message;
    public MessageWindow(String Message){
        this.setSize(new Dimension(500, 200));
        this.setLayout(new GridLayout(2, 3));
        this.setResizable(false);
        this.Message = Message;

        JLabel textLabel = new JLabel();
        textLabel.setText(Message);
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setVerticalAlignment(SwingConstants.CENTER);

        this.add(textLabel);

        JButton okButton = new JButton("Ok");
        okButton.setBounds(90, 80,90, 45);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MessageWindow.this.dispose();
            }
        });

        JPanel panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(1, 3));

        panelButton.add(new JLabel());
        panelButton.add(okButton);
        panelButton.add(new JLabel());
        this.add(panelButton);

        this.setVisible(true);
    }



}
