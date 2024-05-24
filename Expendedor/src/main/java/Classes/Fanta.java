package Classes;
import Classes.Bebida;

/**
 * Fanta Subclase de Bebida
 */
public class Fanta extends Bebida {
    /**
     * Constructor por defecto
     * @param serie Recibe el numero de serie del producto
     */
    public Fanta(int serie){
        super(serie);
    }

    /**
     * Método que representa que el producto fue consumido
     * @return Retorna "Fanta" al ser consumida, correspondiente a la marca de la Bebida
     */
    @Override
    public String comer(){
        return "Fanta";
    }
}
