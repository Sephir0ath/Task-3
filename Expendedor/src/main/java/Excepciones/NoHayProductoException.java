package Excepciones;

/**
 * Excepcion creada para el caso en que algún deposito de la clase Expendedor esté vacío y se quiera obtener un elemento de allí
 */
public class NoHayProductoException extends Exception{
    /**
     * Constructor de la clase, hereda de la clase Exception
     */
    public NoHayProductoException(){
        super();
    }
}
