package Classes;

/**
 * Enum que representa el valor de cada producto que se almacenan dentro de la clase Expendedor
 */
public enum PrecioProductos {
    VALORCOCACOLA(1000),
    VALORSPRITE(800),
    VALORFANTA(700),
    VALORSNICKERS(600),
    VALORSUPER8(200);

    private final int precio;

    /**
     * Constructor del Enum, inicializa la variable precio
     *
     * @param precio Precio del producto pedido
     */
    private PrecioProductos(int precio){
        this.precio = precio;
    }

    /**
     * Obtiene el precio del producto
     *
     * @return entero con el precio del producto
     */
    public int getPrecio(){
       return precio;
    }

}
