package Classes;

import Excepciones.NoHayProductoException;
import Excepciones.PagoIncorrectoException;
import Excepciones.PagoInsuficienteException;

/**
 * Esta clase representa al Comprador el cual interactúa con el Expendedor e intenta comprar un producto.
 */
public class Comprador {
    private String sonido;
    private int vuelto;
    private Producto producto;

    /**
     * Constructor por defecto.
     */
    public Comprador() {

    }

    /**
     * Método que representa el comprar un producto.
     * @param moneda Moneda que se utiliza para comprar el producto.
     * @param cualProducto Producto que el comprador solicita comprar.
     * @param expendedor Expendedor que contiene los productos para realizar la compra.
     * @throws NoHayProductoException Caso que no está el producto solicitado (deposito vacío o no existe el producto).
     * @throws PagoInsuficienteException Caso en que el valor de la moneda es menor al precio del producto.
     * @throws PagoIncorrectoException Caso en que la moneda es nula.
     */
    public void comprar(Moneda moneda, Productos cualProducto, Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        try{
            sonido = expendedor.comprarProducto(moneda, cualProducto).consumir();
            while(true) {
                Moneda monedaAObtener = expendedor.getVuelto();
                if (monedaAObtener == null) {
                    break;
                }
                vuelto += monedaAObtener.getValor();
                //producto =
            }
        }
        catch(NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e){
            throw e;
        }
    }

    /**
     * Método que entrega la cantidad de vuelto calculada en el constructor
     * @return int vuelto por la compra exitosa realizada
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     * Método que entrega el nombre de el producto consumido
     * @return string sonido con el nombre del producto
     */
    public String queConsumiste() {
        return sonido;
    }
}
