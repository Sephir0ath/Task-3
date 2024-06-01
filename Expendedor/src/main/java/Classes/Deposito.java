package Classes;
import java.util.ArrayList;

/**
 * Se utiliza para simular un deposito en donde se pueden almacenar y sacar productos.
 * @param <T> Parametro de tipo generico, define el tipo de deposito.
 */
public class Deposito<T> {
    ArrayList<T> deposito;

    /**
     * Constructor de la clase, inicializa la variable deposito.
     */
    public Deposito(){
        deposito = new ArrayList<>();
    }

    /**
     * Metodo para obtener un elemento del ArrayList deposito..
     * @return un objeto generico, en caso de que el deposito esté vacío retorna vacío (null).
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
     * Metodo para obtener el ArrayList deposito dentro de la clase Comprador.
     * @return objeto tipo Arraylist.
     */
    public ArrayList<T> returnArrayList(){
        return deposito;
    }

    /**
     * Metodo para añadir un objeto tipo generico a un deposito.
     * @param objeto Objeto tipo generico que representa un producto o una moneda.
     */
    public void add(T objeto){
        deposito.add(objeto);
    }

    /**
     * Getter que revisa cual es el objeto en el index i.
     * @param i int que indica el index del ArrayList.
     * @return objeto en el index.
     */
    public T getObjeto(int i){
        return deposito.get(i);
    }


}
