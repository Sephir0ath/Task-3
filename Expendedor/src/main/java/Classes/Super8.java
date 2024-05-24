package Classes;

/**
 * Subclase de Dulce que representa un Super8.
 */
public class Super8 extends Dulce {
    /**
     * Constructor que le asigna un número de serie al Super8.
     * @param serie Recibe el numero de serie del Super8.
     */
    public Super8(int serie){
        super(serie);
    }

    /**
     * Método que representa que el producto fue consumido.
     * @return String "Super8", indica que se consumió una Super8.
     */
    @Override
    public String consumir() {
        return "Super8";
    }
}