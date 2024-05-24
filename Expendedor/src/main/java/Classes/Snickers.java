package Classes;
import Classes.Dulce;

/**
 * Subclase de Dulce, hace referencia al dulce "Snickers"
 */
public class Snickers extends Dulce {
    /**
     * Constructor de la clase, inicializa la variable serie
     *
     * @param serie valor que representa un identificador unico para cada objeto Snickers
     */
    public Snickers(int serie){
        super(serie);
    }

    /**
     * Este metodo indica el producto que se ha consumido al llamarse
     *
     * @return Un String con la palabra "Snickers"
     */
    public String comer() {
        return "Snickers";
    }
}
