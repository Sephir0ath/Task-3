package Interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador comprador;
    private PanelExpendedor expendedor;

    public PanelPrincipal(){
        super();
        setLayout(null);
        comprador = new PanelComprador();
        expendedor = new PanelExpendedor();
        add(comprador);
        add(expendedor);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}