package Excepciones;

/**
 * Excepcion creada para el caso en que se pague en la clase Expendedor con un objeto Moneda vacío (null)
 */
public class PagoIncorrectoException extends Exception{
    /**
     * Constructor de la clase, hereda de la clase Exception
     */
    public PagoIncorrectoException(){
        super();
    }
}
