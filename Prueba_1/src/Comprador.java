/**
 *Clase que define a el comprador
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */

public class Comprador {
    /** String e Int para registrar el sabor de lo que consume y el vuelto de este*/
    private String sonido;
    private int vuelto;

    /** Metodo constructor de Comprador que se encarga de hacer la comprar y administrar el vuelto, si la moneda NO es
     * nula, se compra un producto y se checkea si el producto existe. Luego se le da el valor a sonido y vuelto.
     *
     * @param m moneda que se ingresa, si no se tiene moneda el vuelto es 0
     * @param cualProducto numero entero que define cual producto se quiere comprar
     * @param exp define el expendedor del que se va a comprar
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws PagoInsuficienteException, PagoIncorrectoException, NoHayProductoException {
        vuelto=0;
        Producto b=exp.comprarProducto(m,cualProducto);
        sonido=b.sabor();
        Moneda val=exp.getVuelto();
        while(val!=null){
            vuelto= vuelto+val.getValor();
            val=exp.getVuelto();
        }
    }
    /**
     *
     * @return vuelto despues de la compra
     */
    public int cuantoVuelto(){
        return vuelto;
    }

    /**
     *
     * @return "sabor" de el producto consumido
     */
    public String queBebiste() {
        return sonido;
    }
}
