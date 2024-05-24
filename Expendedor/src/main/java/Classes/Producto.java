package Classes;

/**
 * Producto Clase de tipo abstracta, sirve de base para Productos como Dulces y Bebidas
 */
public abstract class Producto {
    private int serie;

    /**
     * Constructor por defecto
     * @param serie Recibe el numero de serie del producto
     */
    public Producto(int serie){
        this.serie = serie;
    }

    /**
     * Método para obtener el número de serie del producto
     * @return serie Retorna el numero de serie del producto
     */
    public int getSerie(){
        return serie;
    }

    /**
     * Método abstracto que representa que el producto fue consumido
     * @return Retorna un String con el nombre del producto al ser usado
     */
    public abstract String comer();
}
