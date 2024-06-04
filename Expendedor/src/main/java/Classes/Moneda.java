package Classes;

/**
 * Esta clase representa las monedas que son ingresadas al expendedor con las cuales se compran los productos
 * Moneda es extendida por Moneda100, Moneda500, Moneda1000 y Moneda 1500
 */
public abstract class Moneda implements Comparable<Moneda>{
    private static int serie100 = 100;
    private static int serie500 = 500;
    private static int serie1000 = 1000;
    private static int serie1500 = 1500;
    private int serie;

    /**
     * Constructor de la clase, da el valor de la serie para las monedas según su valor.
     */
    public Moneda(int valor){
        if (valor == 100) {
            serie = setSerie(100);
        }
        else if (valor == 500) {
            serie = setSerie(500);
        }
        else if (valor == 1000) {
            serie = setSerie(1000);
        }
        else {
            serie = setSerie(1500);
        }
    }

    /**
     * Setter del número de serie de las monedas, evitando que todas compartan número de serie.
     * @param valor de la moneda ingresada.
     * @return int con el nuevo número de serie.
     */
    private static int setSerie(int valor) {
        if (valor == 100) {
            return serie100++;
        }
        else if (valor == 500) {
            return serie500++;
        }
        else if (valor == 1000) {
            return serie1000++;
        }
        else {
            return serie1500++;
        }
    }

    /**
     * Método que retorna la serie de la moneda
     * @return serie de la moneda
     */
    public int getSerie(){
        return serie;
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
