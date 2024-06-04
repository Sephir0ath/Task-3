package Interfaz;

import Classes.*;
import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra al expendedor, los botones y depositos que contiene.
 */
public class PanelExpendedor extends JPanel {
    private static Expendedor expendedor;
    private ButtonTomarVuelto vuelto;
    private static ButtonTomarProducto dispensador;
    private ButtonResetear resetear;
    private PanelBotonesCompra compra;
    private PanelIngreso ingreso;
    private PanelDepositoVuelto depositoVuelto;
    private PanelDepositoMonedas depositoMonedas;
    private PanelDepositoProductos depositoProductos;

    /**
     * Constructor que personaliza el panel e inicializa los paneles y botones que contiene.
     */
    public PanelExpendedor(){
        super();

        expendedor = new Expendedor();

        compra = new PanelBotonesCompra();
        resetear = new ButtonResetear();

        ingreso = new PanelIngreso();
        dispensador = new ButtonTomarProducto();
        vuelto = new ButtonTomarVuelto();

        depositoVuelto = new PanelDepositoVuelto();
        depositoMonedas = new PanelDepositoMonedas();
        depositoProductos = new PanelDepositoProductos();

        setLayout(null);
        setBounds(0,0,500, 800);

        add(compra);
        add(resetear);

        add(ingreso);
        add(dispensador);
        add(vuelto);

        add(depositoVuelto);
        add(depositoMonedas);
        add(depositoProductos);
    }

    /**
     * Método para reiniciar el Expendedor, aplicado al presionar el botón de reiniciar.
     */
    public static void reinicioExpendedor() {
        expendedor = new Expendedor();
        ButtonTomarProducto.dispensadorVacio = true;
        PanelIngreso.setPago(null);
        ButtonComprar.producto = null;
    }

    /**
     * Override del método paintComponent(g), personaliza visualmente el panel y su contenido, pinta el fondo del expendedor.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            g.drawImage(new ImageIcon(getClass().getClassLoader().getResource("panelExpendedor.png")).getImage(), 0, 0, null);
        }
        catch (Exception e) {

        }
    }

    /**
     * Getter para obtener el expendedor actual y poder obtener sus datos.
     * @return expendedor en el que están contenido todos los datos que se están ejecutando.
     */
    public static Expendedor getExpendedor() {
        return expendedor;
    }

    /**
     * Método para que al tener el mouse sobre el botón del dispensador, se muestre el número de serie de el producto comprado.
     */
    public static void mostrarSerieProducto() {
        dispensador.setToolTipText(String.valueOf(PanelExpendedor.getExpendedor().getProductoSerie()));
    }
}

