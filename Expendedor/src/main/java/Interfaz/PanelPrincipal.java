package Interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador comprador;
    private PanelExpendedor expendedor;

    public PanelPrincipal(){
        super();
        this.setLayout(new BorderLayout());

        expendedor = new PanelExpendedor();
        comprador = new PanelComprador();
        this.setBackground(Color.WHITE);

        this.add(comprador, BorderLayout.EAST);
        this.add(expendedor, BorderLayout.WEST);


    }

    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        expendedor.paintComponent(g);

    }


}
