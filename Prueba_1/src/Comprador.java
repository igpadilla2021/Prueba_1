public class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        vuelto=0;
        if (m!=null){
            Bebida b=exp.comprarBebida(m,cualBebida);
            if (b!=null){sonido=b.beber();}
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
