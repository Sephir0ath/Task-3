package Classes;

/**
 * Subclase de la clase Moneda
 * Representa las monedas de valor numérico 100
 */
public class Moneda100 extends Moneda{
    /**
     * Constructor por defecto, crea una instancia de Moneda100 y entrega su valor a la superclase para asignar su serie.
     */
    public Moneda100(){
        super(100);
    }

    /**
     * Método que retorna el valor numérico de la moneda, el cual es 100
     * @return int 100, valor de la moneda
     */
    public int getValor(){
        return 100;
    }
}
