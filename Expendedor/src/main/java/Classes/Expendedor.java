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
    private Deposito<Moneda> depositoMonedas = new Deposito<>();

    /**
     * Constructor de la clase Expendedor, añade una cierta cantidad de productos a cada dispensador
     *
     * @param cantidadProductos valor que indica la cantidad de elementos que tiene cada dispensador
     */
    public Expendedor(int cantidadProductos) {
        for (int i = 0; i < cantidadProductos; i++) {
            depositoCoca.add(new CocaCola(100 + i));
            depositoFanta.add(new Fanta(200 + i));
            depositoSprite.add(new Sprite(300 + i));
            depositoSuper8.add(new Super8(400 + i));
            depositoSnickers.add(new Snickers(500 + i));
        }
    }

    /**
     * Metodo para comprar un producto, se verifica que el ingreso de las variables sea correcto
     *
     * @param moneda Moneda que se recibe para pagar un producto
     * @param cualProducto Valor que permite saber qué producto se quiere comprar
     * @return Se retorna el producto pedido por el comprador
     * @throws PagoIncorrectoException Se lanza cuando moneda es vacío (null)
     * @throws PagoInsuficienteException Se lanza cuando el valor de la moneda ingresada es menor al precio de los productos
     * @throws NoHayProductoException Se lanza cuando el deposito del producto vacío está vacío
     */
    public Producto comprarProducto(Moneda moneda, Productos cualProducto) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        int cantidadDeMonedasVuelto;

        if (cualProducto == null) {
            throw new NoHayProductoException();
        }

        if (moneda == null) {
            throw new PagoIncorrectoException();
        } else {
            depositoMonedas.add(moneda);
        }


        if (cualProducto == Productos.COCA) {
            cantidadDeMonedasVuelto = (moneda.getValor() - PrecioProductos.VALORCOCACOLA.getPrecio()) / 100;
            if (depositoCoca.returnArrayList().isEmpty()) {
                throw new NoHayProductoException();
            }

            if (cantidadDeMonedasVuelto < 0) {
                throw new PagoInsuficienteException();
            } else {
                depositoMonedas.get();
                for (int i = 0; i < cantidadDeMonedasVuelto; i++) {
                    depositoMonedas.add(new Moneda100());
                }

                return depositoCoca.get();
            }
        }

        if (cualProducto == Productos.FANTA) {
            cantidadDeMonedasVuelto = (moneda.getValor() - PrecioProductos.VALORFANTA.getPrecio()) / 100;
            if (depositoFanta.returnArrayList().isEmpty()) {
                throw new NoHayProductoException();
            }

            if (cantidadDeMonedasVuelto < 0) {
                throw new PagoInsuficienteException();
            } else {
                depositoMonedas.get();
                for (int i = 0; i < cantidadDeMonedasVuelto; i++) {
                    depositoMonedas.add(new Moneda100());
                }

                return depositoFanta.get();
            }
        }

        if (cualProducto == Productos.SPRITE) {
            cantidadDeMonedasVuelto = (moneda.getValor() - PrecioProductos.VALORSPRITE.getPrecio()) / 100;
            if (depositoSprite.returnArrayList().isEmpty()) {
                throw new NoHayProductoException();
            }

            if (cantidadDeMonedasVuelto < 0) {
                throw new PagoInsuficienteException();
            } else {
                depositoMonedas.get();
                for (int i = 0; i < cantidadDeMonedasVuelto; i++) {
                    depositoMonedas.add(new Moneda100());
                }

                return depositoSprite.get();
            }
        }

        if (cualProducto == Productos.SUPER8) {
            cantidadDeMonedasVuelto = (moneda.getValor() - PrecioProductos.VALORSUPER8.getPrecio()) / 100;
            if (depositoSuper8.returnArrayList().isEmpty()) {
                throw new NoHayProductoException();
            }

            if (cantidadDeMonedasVuelto < 0) {
                throw new PagoInsuficienteException();
            } else {
                depositoMonedas.get();
                for (int i = 0; i < cantidadDeMonedasVuelto; i++) {
                    depositoMonedas.add(new Moneda100());
                }

                return depositoSuper8.get();
            }
        }

        if (cualProducto == Productos.SNICKERS) {
            cantidadDeMonedasVuelto = (moneda.getValor() - PrecioProductos.VALORSNICKERS.getPrecio()) / 100;
            if (depositoSnickers.returnArrayList().isEmpty()) {
                throw new NoHayProductoException();
            }

            if (cantidadDeMonedasVuelto < 0) {
                throw new PagoInsuficienteException();
            } else {
                depositoMonedas.get();
                for (int i = 0; i < cantidadDeMonedasVuelto; i++) {
                    depositoMonedas.add(new Moneda100());
                }

                return depositoSnickers.get();
            }
        }

        else {
            throw new NoHayProductoException();
        }
    }

    /**
     *  Metodo para devolver una moneda para calcular el vuelto del usuario en la clase comprador
     *
     * @return retorna la primera moneda de depositoMonedas
     */
    public Moneda getVuelto(){
        return depositoMonedas.get();
    }

}
