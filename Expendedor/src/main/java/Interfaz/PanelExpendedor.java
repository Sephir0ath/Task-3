package Interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    public PanelExpendedor(){
        super();
        this.setLayout(new GridLayout());
        this.setPreferredSize(new Dimension(450, 800));

    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        // Pintar display de productos
        g.setColor(Color.RED);
        g.fillRect(0, 0, 450, 600);

        // Pintar zona sacar productos
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 600, 450, 200);


    }

}
