package Classes;

/**
 * Esta clase representa las monedas que son ingresadas al expendedor con las cuales se compran los productos
 * Moneda es extendida por Moneda100, Moneda500, Moneda1000 y Moneda 1500
 */
public abstract class Moneda implements Comparable<Moneda>{
    /**
     * Constructor por defecto
     */
    public Moneda(){

    }

    /**
     * Método que retorna la serie de la moneda
     * @return serie de la moneda
     */
    public Moneda getSerie(){
        return this;
    }

    /**
     * Método para comparar el valor entre monedas
     * @param moneda moneda a comparar
     * @return 1 si las monedas tienen igual valor, 0 si son distintos sus valores
     */
    @Override
    public int compareTo(Moneda moneda) {
        if (this.getValor() == moneda.getValor()){
            return 1;
        }

        else {
            return 0;
        }
    }

    /**
     * Retorna el valor numérico de la moneda 100, 500, 1000 o 1500 dependiendo de la moneda
     * @return int del valor de la moneda
     */
    public abstract int getValor();

}
