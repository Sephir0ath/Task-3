package Classes;

/**
 * Enum que representa el valor de cada producto que se almacenan dentro de la clase Expendedor
 */
public enum PrecioProductos {
    VALORCOCACOLA(1200),
    VALORSPRITE(1000),
    VALORFANTA(900),
    VALORSNICKERS(800),
    VALORSUPER8(300);

    private final int precio;
    /**
     * Constructor del Enum, inicializa la variable precio.
     * @param precio Precio del producto pedido.
     */
    private PrecioProductos(int precio){
        this.precio = precio;
    }

    /**
     * Obtiene el precio del producto.
     * @return entero con el precio del producto.
     */
    public int getPrecio(){
       return precio;
    }

}
