package Classes;

/**
 * Subclase abstracta de Producto, representa las diferentes Bebida (CocaCola, Sprite, Fanta).
 */
public abstract class Bebida extends Producto{
    /**
     * Constructor que le asigna un número de serie a la Bebida.
     * @param serie Recibe el numero de serie del producto
     */
    public Bebida(int serie){
        super(serie);
    }

    /**
     * Método abstracto que representa que el producto fue consumido
     * @return String con el nombre del producto consumido
     */
    public abstract String consumir();
}
