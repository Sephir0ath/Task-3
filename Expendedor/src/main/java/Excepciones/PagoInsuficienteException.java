package Excepciones;

/**
 *  Excepcion creada para el caso en que el valor del objeta Moneda ingresado en la clase Expendedor sea menor al costo del producto que se quiere adquirir
 */
public class PagoInsuficienteException extends Exception{
    /**
     * Constructor de la clase, hereda de la clase Exception
     */
    public PagoInsuficienteException(){
        super();
    }
}
