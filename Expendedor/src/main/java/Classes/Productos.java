package Classes;

/**
 * Enum que representa el valor de cada producto que se almacenan dentro de la clase Expendedor
 */
public enum Productos {
    COCACOLA("CocaCola", 1200),
    SPRITE("Sprite", 1000),
    FANTA("Fanta", 900),
    SNICKERS("Snickers", 800),
    SUPER8("Super8", 300);

    private String nombre;
    private final int precio;

    /**
     * Constructor del Enum, inicializa la variable precio.
     * @param precio Precio del producto pedido.
     */
    private Productos(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el nnombre del producto.
     * @return String con el nombre del producto.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     * @return entero con el precio del producto.
     */
    public int getPrecio(){
       return precio;
    }



}
