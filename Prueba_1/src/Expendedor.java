public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;
    private Deposito<Moneda> monVu;
    public static final int COCA=1;
    public static final int  SPRITE=2;
    private int precioBebidas;
    public Expendedor(int numBebidas, int precioBebidas){
        this.precioBebidas=precioBebidas;
        int p;
        this.monVu=new Deposito();
        coca=new Deposito();
        sprite=new Deposito();
        for(p=0;p!=numBebidas;p=p+1){
            coca.add(new CocaCola(100+p));
            sprite.add(new Sprite(200+p));
        }
    }
    public Producto comprarBebida(Moneda m,int cual) {
        int p;
        if (cual==1 && m.getValor()>=precioBebidas){
            Producto b= coca.get();
            if(b!=null){
                for (p=0; p<((m.getValor() - precioBebidas)/100); p=p+1){
                    this.monVu.add(new Moneda100());
                }
            }
            else {
                monVu.add(m);
            }
            return b;
        }
        else if(cual==2 && m.getValor()>=precioBebidas){
            Producto b= sprite.get();;
            if(b!=null){
                for (p=0; p<((m.getValor() - precioBebidas)/100); p=p+1){
                    this.monVu.add(new Moneda100());
                }
            }
            else {
                monVu.add(m);
            }
            return b;
        }
        else {
            this.monVu.add(m);
            return null;
        }
    }
    public Moneda getVuelto(){
        return monVu.get();
    }
}
