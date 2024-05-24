package Classes;
import java.util.ArrayList;

/**
 * Se utiliza para simular un deposito en donde se pueden almacenar y sacar productos
 *
 * @param <T> Parametro de tipo generico, define el tipo de deposito
 */
public class Deposito<T> {
    ArrayList<T> deposito;

    /**
     * Constructor de la clase, inicializa la variable deposito
     */
    public Deposito(){
        deposito = new ArrayList<>();
    }

    /**
     * metodo para obtener un elemento del ArrayList deposito
     *
     * @return un objeto generico, en caso de que el deposito esté vacío retorna vacío (null)
     */
    public T get(){
        if (deposito.isEmpty()){
            return null;
        }

        T objetoQueSeRetorna = deposito.get(0);
        deposito.remove(0);
        return objetoQueSeRetorna;
    }

    /**
     * metodo para obtener el ArrayList deposito dentro de la clase Comprador
     *
     * @return objeto tipo Arraylist
     */
    public ArrayList<T> returnArrayList(){
        return deposito;
    }

    /**
     * metodo para añadir un objeto tipo generico a un deposito
     *
     * @param objeto Objeto tipo generico que representa un producto o una moneda
     */
    public void add(T objeto){
        deposito.add(objeto);
    }

}
