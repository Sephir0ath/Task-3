package Interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    public PanelComprador(){
        super();
        this.setPreferredSize(new Dimension(450, 800));
        this.setLayout(new BorderLayout());

        // Botones
        JButton botonMoneda100 = new JButton("100");
        botonMoneda100.setPreferredSize(new Dimension(50, 50));
        botonMoneda100.setBackground(Color.BLUE); // Set background color
        botonMoneda100.setForeground(Color.BLACK); // Set text color
        botonMoneda100.setFont(new Font("Arial", Font.BOLD, 16)); // Set font
        botonMoneda100.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));


        // Listeners de botones



    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.gray);
        g.fillRect(0, 0, 450, 800);


    }




}
