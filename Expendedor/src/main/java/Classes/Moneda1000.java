package Classes;

/**
 * Subclase de la clase Moneda
 * Representa las monedas de valor numérico 1000
 */
public class Moneda1000 extends Moneda{
    /**
     * Constructor por defecto, crea una instancia de Moneda1000 y entrega su valor a la superclase para asignar su serie.
     */
    public Moneda1000(){
        super(1000);
    }

    /**
     * Método que retorna el valor numérico de la moneda, el cual es 1000
     * @return int 1000, valor de la moneda
     */
    public int getValor(){
        return 1000;
    }

}
