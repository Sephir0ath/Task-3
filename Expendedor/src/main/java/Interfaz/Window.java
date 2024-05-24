package Interfaz;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(){
        super("Expendedora");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(900, 800);
        this.setResizable(false);

        PanelPrincipal panelPrincipal = new PanelPrincipal();
        this.add(panelPrincipal);

        this.setVisible(true);
    }




}


/*
Preguntar sobre como manejar el dibujar (como redibujar)
Preguntar sobre si los botones deben estar en panelPrincipal o si deben estar en sus respectivos paneles
 */

