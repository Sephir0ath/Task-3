package Classes;
import Classes.Bebida;

/**
 * Sprite Subclase de Bebida
 */
public class Sprite extends Bebida {
    /**
     * Constructor por defecto
     * @param serie Recibe el numero de serie del producto
     */
    public Sprite(int serie){
        super(serie);
    }

    /**
     * Método que representa que el producto fue consumido
     * @return Retorna "Sprite" al ser consumida, correspondiente a la marca de la Bebida
     */
    @Override
    public String comer(){
        return "Sprite";
    }
}
