package Classes;

/**
 * CocaCola Subclase de Bebida
 */
public class CocaCola extends Bebida {
    /**
     * Constructor por defecto
     * @param serie Recibe el numero de serie del producto
     */
    public CocaCola(int serie){
        super(serie);
    }

    /**
     * Método que representa que el producto fue consumido
     * @return Retorna "CocaCola" al ser consumida, correspondiente a la marca de la Bebida
     */
    @Override
    public String comer(){
        return "CocaCola";
    }
}
