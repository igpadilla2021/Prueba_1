/**
 *Clase que define a el Deposito
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */


import java.util.ArrayList;

/**
 * Clase que define a los depositos ocupados "dentro" de la maquina expendedora
 * @param <tipo> de que tipo de producto es el deposito
 */
public class Deposito<tipo> {
    /**
     * ArrayList que se ocupa en nuestros depositos
     */
    private final ArrayList al;

    /**
     * Metodo constructor de Deposito donde se define un Arraylist como al
     */
    public Deposito(){
        al=new ArrayList ();
    }

    /**
     * metodo add donde se añade un producto al arraylist
     * @param tipo tipo de producto
     */
    public void add(tipo tipo){
        al.add(tipo);
    }

    /**
     * metodo get donde se saca un producto del arraylist
     * @return retorna el producto de la posicion 0 en el arraylist. En el caso de que no hayan productos retorna null
     */
    public tipo get(){
        if (al.size()!=0){
            return (tipo) al.remove(0);
        }
        else{
            return null;
        }
    }
}