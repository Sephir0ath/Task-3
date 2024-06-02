package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private static Expendedor expendedor;

	
    /*private ButtonCoca coca;
    private ButtonSprite sprite;
    private ButtonFanta fanta;
    private ButtonSnickers snickers;
    private ButtonSuper8 super8;

    private ButtonVuelto vuelto;
    private PanelBotonesCompra compra;
    private ButtonTomarProducto producto;
    private PanelIngresarMoneda ingresoMonedas;
    private PanelDepositoVuelto depositoVuelto;
    private PanelDepositoMonedas depositoMonedas;
    private PanelDepositoProductos depositoProductos;*/

    public PanelExpendedor(){
        super();

        expendedor = new Expendedor();

        /*coca = new ButtonCoca();
        sprite = new ButtonSprite();
        fanta = new ButtonFanta();
        snickers = new ButtonSnickers();
        super8 = new ButtonSuper8();

        vuelto = new ButtonVuelto();
        producto = new ButtonTomarProducto();

        compra = new PanelBotonesCompra();
        ingresoMonedas = new PanelIngresarMoneda();
        depositoVuelto = new PanelDepositoVuelto();
        depositoMonedas = new PanelDepositoMonedas();
        depositoProductos = new PanelDepositoProductos();*/

        setLayout(null);
        setBounds(0,0,500, 800);

        /*add(coca);
        add(sprite);
        add(fanta);
        add(snickers);
        add(super8);

        add(compra);

        add(vuelto);
        add(producto);
        add(ingresoMonedas);
        add(depositoVuelto);
        add(depositoMonedas);
        add(depositoProductos);

          */
    }

    public static void reinicioExpendedor() {
        expendedor = new Expendedor();
            }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // Pintar display de productos
        g.setColor(Color.RED);
        g.fillRect(0, 0, 600, 600);

        // Pintar zona sacar productos
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 600, 600, 200);

        // Zona productos
        g.setColor(Color.BLACK);
        g.fillRect(30, 120, 350, 400);

        // Zona coca
        g.setColor(Color.RED);
        g.fillRect(70, 160, 70, 130);

        // Zona fanta
        g.setColor(Color.ORANGE);
        g.fillRect(165, 160, 70, 130);

        // Zona sprite
        g.setColor(Color.GREEN);
        g.fillRect(260, 160, 70, 130);

        // Zona snickers
        g.setColor(Color.CYAN);
        g.fillRect(90, 340, 90, 130);

        // Zona super8
        g.setColor(Color.YELLOW);
        g.fillRect(220, 340, 90, 130);

        // Zona sacar producto
        g.setColor(Color.BLACK);
        g.fillRect(30, 635, 350, 100);
    }

    public static Expendedor getExpendedor() {
        return expendedor;
    }
}
