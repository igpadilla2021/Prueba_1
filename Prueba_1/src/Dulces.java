public abstract class Dulces extends Producto{
    public Dulces(int numSerie) {
        super(numSerie);
    }
}
class Snickers extends Dulces{
    public Snickers(int numSerie) {
        super(numSerie);
    }
    public String sabor(){
        return "snickers";
    }
}
class Super8 extends Dulces{
    public Super8(int numSerie) {
        super(numSerie);
    }
    public String sabor(){
        return "super8";
    }
}
