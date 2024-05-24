package Classes;
import Classes.Dulce;

/**
 * Subclase de Dulce, hace referencia al dulce "Super8"
 */
public class Super8 extends Dulce {
    /**
     * Constructor de la clase, inicializa la variable serie
     *
     * @param serie valor que representa un identificador unico para cada objeto Snickers
     */
    public Super8(int serie){
        super(serie);
    }

    /**
     * Este metodo indica el producto que se ha consumido al llamarse
     *
     * @return Un String con la palabra "Super8"
     */
    public String comer() {
        return "Super8";
    }
}