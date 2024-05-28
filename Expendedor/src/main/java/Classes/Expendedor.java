package Classes;

import Excepciones.NoHayProductoException;
import Excepciones.PagoIncorrectoException;
import Excepciones.PagoInsuficienteException;

/**
 * Clase que simula un expendedor, aquí se guardan varios depositos en donde el usuario podrá cocmprar productos
 */
public class Expendedor {
    private Deposito<Bebida> depositoCoca = new Deposito<>(), depositoFanta = new Deposito<>(), depositoSprite = new Deposito<>();
    private Deposito<Dulce> depositoSnickers = new Deposito<>(), depositoSuper8 = new Deposito<>();
    private Deposito<Moneda> depositoMonedas = new Deposito<>(), depositoGeneral = new Deposito<>();
    private Producto productoComprado;

    /**
     * Constructor de la clase Expendedor, añade una cierta cantidad de productos a cada dispensador
     */
    public Expendedor() {
        for (int i = 0; i < 10; i++) {
            depositoCoca.add(new CocaCola(100 + i));
            depositoFanta.add(new Fanta(200 + i));
            depositoSprite.add(new Sprite(300 + i));
            depositoSuper8.add(new Super8(400 + i));
            depositoSnickers.add(new Snickers(500 + i));
        }
    }

    /**
     * Metodo para comprar un producto, se verifica que el ingreso de las variables sea correcto.
     * @param moneda Moneda que se recibe para pagar un producto
     * @param cualProducto Valor que permite saber qué producto se quiere comprar
     * @return Se retorna el producto pedido por el comprador
     * @throws PagoIncorrectoException Se lanza cuando moneda es vacío (null)
     * @throws PagoInsuficienteException Se lanza cuando el valor de la moneda ingresada es menor al precio de los productos
     * @throws NoHayProductoException Se lanza cuando el deposito del producto vacío está vacío
     */
    public Producto comprarProducto(Moneda moneda, Productos cualProducto) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        int valorMonedas = 0;

        if (cualProducto == null) {
            throw new NoHayProductoException();
        }

        if (depositoMonedas == null) {
            throw new PagoIncorrectoException();
        }

        else {
            for (int i = 0; i < depositoMonedas.returnArrayList().size(); i++) {
                valorMonedas += depositoMonedas.returnArrayList().get(i).getValor();
            }

            if (cualProducto.getPrecio() < valorMonedas) {
                throw new PagoInsuficienteException();
            }

            // TEMA DE VUELTO, Q HAYAN MONEDAS PARA ENTREGAR DE VUELTO
            if()

            if (cualProducto == Productos.COCACOLA) {
                if (depositoCoca.returnArrayList().isEmpty()) {
                    throw new NoHayProductoException();
                }
                productoComprado = depositoCoca.get();
                return productoComprado;
            }

            if (cualProducto == Productos.FANTA) {
                if (depositoFanta.returnArrayList().isEmpty()) {
                    throw new NoHayProductoException();
                }

                productoComprado = depositoFanta.get();
                return productoComprado;
                }
            }

            if (cualProducto == Productos.SPRITE) {
                if (depositoSprite.returnArrayList().isEmpty()) {
                    throw new NoHayProductoException();
                }

                productoComprado = depositoSprite.get();
                return productoComprado;
            }

            if (cualProducto == Productos.SUPER8) {
                if (depositoSuper8.returnArrayList().isEmpty()) {
                    throw new NoHayProductoException();
                }

                productoComprado = depositoSuper8.get();
                return productoComprado;
            }

            if (cualProducto == Productos.SNICKERS) {
                if (depositoSnickers.returnArrayList().isEmpty()) {
                    throw new NoHayProductoException();
                }

                productoComprado = depositoSnickers.get();
                return productoComprado;
        }

        else {
            throw new NoHayProductoException();
        }
    }

    /**
     *  Método para devolver una moneda para calcular el vuelto del usuario en la clase comprador.
     * @return
     */
    public Moneda getVuelto(){
        for(int i=0; )
    }

    /**
     * Método para obtener el producto que compró el comprador.
     * @return Producto comprado.
     */
    public Producto getProducto(){
        Producto productoRecienComprado = productoComprado;
        productoComprado = null;
        return productoRecienComprado;
    }

}
