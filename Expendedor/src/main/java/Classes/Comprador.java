package Classes;

import Excepciones.NoHayProductoException;
import Excepciones.PagoIncorrectoException;
import Excepciones.PagoInsuficienteException;

/**
 * Esta clase representa al Comprador el cual interactúa con el Expendedor y compra el producto
 */
public class Comprador {

    /**
     * String ya que almacenará el nombre del producto consumido
     */
    private String sonido;

    /**
     * Int que contendrá el valor numérico de la cantidad de dinero devuelto
     */
    private int vuelto;

    /**
     * Constructor por defecto de la clase
     * @param moneda Moneda que se utiliza para comprar el producto
     * @param cualProducto Producto que el comprador solicita comprar
     * @param expendedor Expendedor que contiene los productos y con el que el comprador interactúa para realizar la compra
     * @throws NoHayProductoException Excepción que se lanza en caso de no estar el producto solicitado, es decir el deposito está vacío o no existe el producto solicitado
     * @throws PagoInsuficienteException Excepción que se lanza cuando el valor de la moneda utilizada para el pago es menor al precio del producto solicitado
     * @throws PagoIncorrectoException Excepción que se lanza cuando no se ingresa una moneda válida, null
     */
    public Comprador(Moneda moneda, Productos cualProducto, Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        sonido = expendedor.comprarProducto(moneda, cualProducto).comer();

        /**
         * Ciclo que calcula la cantidad de vuelto
         * Se ejecutará mientras aún haya vuelto que entregar
         */
        while(true) {
            Moneda monedaAObtener = expendedor.getVuelto();
            if (monedaAObtener == null){
                break;
            }
            vuelto += monedaAObtener.getValor();
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
    public String queComiste() {
        return sonido;
    }
}
