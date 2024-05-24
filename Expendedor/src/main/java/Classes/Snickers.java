package Classes;

/**
 * Subclase de Dulce que representa un Snickers.
 */
public class Snickers extends Dulce {
    /**
     * Constructor que le asigna un número de serie al Snickers.
     * @param serie Recibe el numero de serie del Snickers.
     */
    public Snickers(int serie){
        super(serie);
    }

    /**
     * Método que representa que el producto fue consumido.
     * @return String "Snickers", indica que se consumió un Snickers.
     */
    @Override
    public String consumir() {
        return "Snickers";
    }
}
