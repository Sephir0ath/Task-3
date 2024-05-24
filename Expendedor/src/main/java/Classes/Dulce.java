package Classes;

/**
 * Clase abstracta que representa los dulces, es subclase de Producto
 * Esta clase es extendida por Super8 y Snickers
 */
public abstract class Dulce extends Producto {
    /**
     * Constructor por defecto
     * @param serie Recibe el número de serie del dulce
     */
    public Dulce(int serie) {
        super(serie);
    }

    /**
     * Método para obtener la serie del dulce
     * @return int del número de serie de el producto
     */
    public int getSerie() {
        return super.getSerie();
    }

    /**
     * Método abstracto que representa que el producto fue consumido
     * @return String que contiene el nombre del producto consumido
     */
    public abstract String comer();
}