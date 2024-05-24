package Classes;

/**
 * Subclase de Bebida que representa una Sprite.
 */
public class Sprite extends Bebida {
    /**
     * Constructor que le asigna un número de serie a la Sprite.
     * @param serie Recibe el numero de serie de la Sprite.
     */
    public Sprite(int serie){
        super(serie);
    }

    /**
     * Método que representa que el producto fue consumido.
     * @return String "Sprite", indica que se consumió una Sprite.
     */
    @Override
    public String consumir(){
        return "Sprite";
    }
}
