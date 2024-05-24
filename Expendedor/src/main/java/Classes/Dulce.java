package Classes;

/**
 * Subclase abstracta de Producto, representa los diferentes Dulces (Super8 y Snickers).
 */
public abstract class Dulce extends Producto {
    /**
     * Constructor que le asigna un número de serie al Dulce.
     * @param serie Recibe el número de serie del dulce
     */
    public Dulce(int serie) {
        super(serie);
    }

    /**
     * Método abstracto que representa que el producto fue consumido
     * @return String con el nombre del producto consumido
     */
    public abstract String consumir();
}