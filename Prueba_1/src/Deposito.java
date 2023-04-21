import java.util.ArrayList;
public class Deposito<tipo> {
    private final ArrayList al;
    public Deposito(){
        al=new ArrayList ();
    }
    public void add(tipo tipo){
        al.add(tipo);
    }
    public tipo get(){
        if (al.size()!=0){
            return (tipo) al.remove(0);
        }
        else{
            return null;
        }
    }
}