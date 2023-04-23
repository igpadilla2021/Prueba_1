public abstract class Dulces {
    private int serie;
    public Dulces(int numSerie){
        this.serie=numSerie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String sabor();
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
