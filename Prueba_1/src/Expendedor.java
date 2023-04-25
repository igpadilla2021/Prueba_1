public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;
    private Deposito<Moneda> monVu;
    public static final int COCA=1;
    public static final int  SPRITE=2;
    private int precioBebidas;
    private int precioDulces;
    public Expendedor(int numBebidas, int precioBebidas){
        this.precioBebidas=precioBebidas;
        this.precioDulces=precioDulces;
        int p;
        this.monVu=new Deposito<Moneda>();
        coca=new Deposito<Producto>();
        sprite=new Deposito<Producto>();
        snickers=new Deposito<Producto>();
        super8=new Deposito<Producto>();
        for(p=0;p!=numBebidas;p=p+1){
            coca.add(new CocaCola(100+p));
            sprite.add(new Sprite(200+p));
            snickers.add(new Snickers(300+p));
            super8.add(new Super8(400+p));
        }
    }
    public Producto comprarProducto(Moneda m,int cual) {
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
        else if(cual==3 && m.getValor()>=precioDulces){
            Producto b= snickers.get();;
            if(b!=null){
                for (p=0; p<((m.getValor() - precioDulces)/100); p=p+1){
                    this.monVu.add(new Moneda100());
                }
            }
            else {
                monVu.add(m);
            }
            return b;
        }
        else if(cual==4 && m.getValor()>=precioDulces){
            Producto b= super8.get();;
            if(b!=null){
                for (p=0; p<((m.getValor() - precioDulces)/100); p=p+1){
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
