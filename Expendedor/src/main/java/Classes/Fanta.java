package Classes;

/**
 * Subclase de Bebida que representa una Fanta.
 */
public class Fanta extends Bebida {
    /**
     * Constructor que le asigna un número de serie a la Fanta.
     * @param serie Recibe el numero de serie de la Fanta.
     */
    public Fanta(int serie){
        super(serie);
    }

    /**
     * Método que representa que el producto fue consumido.
     * @return String "Fanta", indica que se consumió una Fanta.
     */
    @Override
    public String consumir(){
        return "Fanta";
    }
}
