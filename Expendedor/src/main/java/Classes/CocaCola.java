package Classes;

/**
 * Subclase de Bebida que representa una CocaCola.
 */
public class CocaCola extends Bebida {
    /**
     * Constructor que le asigna un número de serie a la CocaCola.
     * @param serie Recibe el numero de serie de la CocaCola.
     */
    public CocaCola(int serie) {
        super(serie);
    }

    /**
     * Método que representa que el producto fue consumido.
     * @return String "CocaCola", indica que se consumió una CocaCola.
     */
    @Override
    public String consumir() {
        return "CocaCola";
    }
}
