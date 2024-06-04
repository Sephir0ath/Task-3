package Classes;

/**
 * Subclase de la clase Moneda
 * Representa las monedas de valor numérico 500
 */
public class Moneda500 extends Moneda{
    /**
     * Constructor por defecto, crea una instancia de Moneda500 y entrega su valor a la superclase para asignar su serie.
     */
    public Moneda500(){
        super(500);
    }

    /**
     * Métddo que retorna el valor numérico de la moneda, el cual es 500
     * @return int 500, valor de la moneda
     */
    public int getValor(){
        return 500;
    }

}
