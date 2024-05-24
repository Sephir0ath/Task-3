package Classes;

/**
 *Bebida Subclase de Producto de tipo abstracta, sirve de base para las diferentes marcas de Bebidas
 */
public abstract class Bebida extends Producto{
    /**
     * Constructor por defecto
     * @param serie Recibe el numero de serie del producto
     */
    public Bebida(int serie){
        super(serie);
    }

    /**
     * Método para obtener el número de serie de la bebida
     * @return Retorna el numero de serie de la bebida
     */
    public int getSerie(){
        return super.getSerie();
    }

    /**
     * Método abstracto que representa que el producto fue consumido
     * @return Retorna un String con el nombre del producto consumido
     */
    public abstract String comer();
}
