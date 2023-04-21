public abstract class Bebida {
    private int serie;
    public Bebida(int numSerie){
        this.serie=numSerie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String beber();
}
class Sprite extends Bebida{
    public Sprite(int numSerie) {
        super(numSerie);
    }
    public String beber(){
        return "sprite";
    }
}
class CocaCola extends Bebida{
    public CocaCola(int numSerie) {
        super(numSerie);
    }
    public String beber(){
        return "cocacola";
    }
}
