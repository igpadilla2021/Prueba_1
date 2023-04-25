public class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualProducto, Expendedor exp) {
        vuelto=0;
        if (m!=null){
            Producto b=exp.comprarProducto(m,cualProducto);
            if (b!=null){sonido=b.sabor();}
            Moneda val=exp.getVuelto();
            while(val!=null){
                vuelto= vuelto+val.getValor();
                val=exp.getVuelto();
            }
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste() {
        return sonido;
    }
}
