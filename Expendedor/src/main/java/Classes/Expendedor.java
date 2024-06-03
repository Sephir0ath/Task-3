package Classes;

import Excepciones.NoHayProductoException;
import Excepciones.PagoIncorrectoException;
import Excepciones.PagoInsuficienteException;

import java.util.Objects;

/**
 * Clase que simula un expendedor, aquí se guardan varios depositos en donde el usuario podrá cocmprar productos
 */
public class Expendedor {
    private Deposito<Bebida> depositoCoca = new Deposito<>(), depositoFanta = new Deposito<>(), depositoSprite = new Deposito<>();
    private Deposito<Dulce> depositoSnickers = new Deposito<>(), depositoSuper8 = new Deposito<>();
    private Deposito<Moneda> depositoMonedas = new Deposito<>(), depositoVuelto = new Deposito<>();
    private Producto productoComprado;

    /**
     * Constructor de la clase Expendedor, añade una cierta cantidad de productos a cada dispensador
     */
    public Expendedor() {
        for (int i = 0; i < 5; i++) {
            depositoCoca.add(new CocaCola(100 + i));
            depositoFanta.add(new Fanta(200 + i));
            depositoSprite.add(new Sprite(300 + i));
            depositoSuper8.add(new Super8(400 + i));
            depositoSnickers.add(new Snickers(500 + i));
        }
    }

    /**
     * Metodo para comprar un producto, se verifica que el ingreso de las variables sea correcto.
     * @param moneda Moneda que se recibe para pagar un producto.
     * @param cualProducto Valor que permite saber qué producto se quiere comprar.
     * @throws PagoIncorrectoException Se lanza cuando moneda es vacío (null).
     * @throws PagoInsuficienteException Se lanza cuando el valor de la moneda ingresada es menor al precio de los productos.
     * @throws NoHayProductoException Se lanza cuando el deposito del producto vacío está vacío.
     */
    public void comprarProducto(Moneda moneda, Productos cualProducto) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {

        if (moneda == null) {
            throw new PagoIncorrectoException();
        }

        if (cualProducto == null) {
            depositoVuelto.add(moneda);
            throw new NoHayProductoException();
        }

        if (cualProducto == Productos.COCACOLA) {
            if (moneda.getValor() >= Productos.COCACOLA.getPrecio() && !depositoCoca.returnArrayList().isEmpty()) {
                for (int i = 0; i < (moneda.getValor() - Productos.COCACOLA.getPrecio()) / 100; i++) {
                    depositoVuelto.add(new Moneda100());
                }
                depositoMonedas.add(moneda);
                productoComprado = depositoCoca.get();
            }
            else {
                depositoVuelto.add(moneda);
                if (moneda.getValor() < Productos.COCACOLA.getPrecio()) {
                    throw new PagoInsuficienteException();
                }
                else if (depositoCoca.returnArrayList().isEmpty()) {
                    throw new NoHayProductoException();
                }
            }
        }

        if (cualProducto == Productos.FANTA) {
            if (moneda.getValor() >= Productos.FANTA.getPrecio() && !depositoFanta.returnArrayList().isEmpty()) {
                for (int i = 0; i < (moneda.getValor() - Productos.FANTA.getPrecio()) / 100; i++) {
                    depositoVuelto.add(new Moneda100());
                }
                depositoMonedas.add(moneda);
                productoComprado = depositoFanta.get();
            }
            else {
                depositoVuelto.add(moneda);
                if (moneda.getValor() < Productos.FANTA.getPrecio()) {
                    throw new PagoInsuficienteException();
                }
                else if (depositoFanta.returnArrayList().isEmpty()) {
                    throw new NoHayProductoException();
                }
            }
        }

        if (cualProducto == Productos.SPRITE) {
            if (moneda.getValor() >= Productos.SPRITE.getPrecio() && !depositoSprite.returnArrayList().isEmpty()) {
                for (int i = 0; i < (moneda.getValor() - Productos.SPRITE.getPrecio()) / 100; i++) {
                    depositoVuelto.add(new Moneda100());
                }
                depositoMonedas.add(moneda);
                productoComprado = depositoSprite.get();
            }
            else {
                depositoVuelto.add(moneda);
                if (moneda.getValor() < Productos.SPRITE.getPrecio()) {
                    throw new PagoInsuficienteException();
                }
                else if (depositoSprite.returnArrayList().isEmpty()) {
                    throw new NoHayProductoException();
                }
            }
        }

        if (cualProducto == Productos.SUPER8) {
            if (moneda.getValor() >= Productos.SUPER8.getPrecio() && !depositoSuper8.returnArrayList().isEmpty()) {
                for (int i = 0; i < (moneda.getValor() - Productos.SUPER8.getPrecio()) / 100; i++) {
                    depositoVuelto.add(new Moneda100());
                }
                depositoMonedas.add(moneda);
                productoComprado = depositoSuper8.get();
            }
            else {
                depositoVuelto.add(moneda);
                if (moneda.getValor() < Productos.SUPER8.getPrecio()) {
                    throw new PagoInsuficienteException();
                }
                else if (depositoSuper8.returnArrayList().isEmpty()) {
                    throw new NoHayProductoException();
                }
            }
        }

        if (cualProducto == Productos.SNICKERS) {
            if (moneda.getValor() >= Productos.SNICKERS.getPrecio() && !depositoSnickers.returnArrayList().isEmpty()) {
                for (int i = 0; i < (moneda.getValor() - Productos.SNICKERS.getPrecio()) / 100; i++) {
                    depositoVuelto.add(new Moneda100());
                }
                depositoMonedas.add(moneda);
                productoComprado = depositoSnickers.get();
            }
            else {
                depositoVuelto.add(moneda);
                if (moneda.getValor() < Productos.SNICKERS.getPrecio()) {
                    throw new PagoInsuficienteException();
                }
                else if (depositoSnickers.returnArrayList().isEmpty()) {
                    throw new NoHayProductoException();
                }
            }
        }
    }

    /**
     *  Método para devolver una moneda para calcular el vuelto del usuario en la clase comprador.
     * @return Moneda obtenida del deposito de vuelto.
     */
    public Moneda getVuelto(){
        return depositoVuelto.get();
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

    /**
     * Método que entreha el tamaño de los depósitos del expendedor.
     * @param nombreDeposito String con el nombre del dep+osito a checkear.
     * @return int con el tamaño del depósito ingresado.
     */
    public int depositoSize(String nombreDeposito){
        if (Objects.equals(nombreDeposito, "depositoCoca")){
            return depositoCoca.returnArrayList().size();
        }
        if (Objects.equals(nombreDeposito, "depositoFanta")){
            return depositoFanta.returnArrayList().size();
        }
        if (Objects.equals(nombreDeposito, "depositoSprite")){
            return depositoSprite.returnArrayList().size();
        }
        if (Objects.equals(nombreDeposito, "depositoSuper8")){
            return depositoSuper8.returnArrayList().size();
        }
        if (Objects.equals(nombreDeposito, "depositoSnickers")){
            return depositoSnickers.returnArrayList().size();
        }
        if (Objects.equals(nombreDeposito, "depositoVuelto")){
            return depositoVuelto.returnArrayList().size();
        }
        if (Objects.equals(nombreDeposito, "depositoMonedas")){
            return depositoMonedas.returnArrayList().size();
        }
        else {
            return 0;
        }
    }

    /**
     * Getter para ver la moneda de cierto index de los depositos de monedas.
     * @param index int que indica la posición de la moneda en el depósito.
     * @param depositoCoins String con el nombre del deposito que se analizará.
     * @return Moneda
     */
    public Moneda getMoneda(int index, String depositoCoins){
        if (Objects.equals(depositoCoins, "depositoVuelto")){
            return depositoVuelto.getObjeto(index);
        }
        if (Objects.equals(depositoCoins, "depositoMonedas")){
            return depositoMonedas.getObjeto(index);
        }
        else {
            return null;
        }
    }

}
