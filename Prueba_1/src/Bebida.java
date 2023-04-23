public abstract class Bebida extends Producto{
    public Bebida(int numSerie) {
        super(numSerie);
    }
}
class Sprite extends Bebida{
    public Sprite(int numSerie) {
        super(numSerie);
    }
    public String sabor(){
        return "sprite";
    }
}
class CocaCola extends Bebida{
    public CocaCola(int numSerie) {
        super(numSerie);
    }
    public String sabor(){
        return "cocacola";
    }
}
