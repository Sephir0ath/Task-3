package Interfaz;

import javax.swing.*;
import java.awt.*;

public class ButtonComprar extends JButton {
    public ButtonComprar(){
        super("Buy");

        this.setBackground(Color.YELLOW);
        this.setForeground(Color.BLACK);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

    }
}
