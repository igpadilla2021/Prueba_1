
public class Main {
    public static void main(String[] args){
        Expendedor exp=new Expendedor (2,600,900);
        Comprador c=null;
        Moneda m=null;
        try {
            m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        }
        catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }

    }
}