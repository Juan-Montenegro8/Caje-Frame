package presentarcaje;
import java.util.*;
public class Presentarcaje {

    public static void main(String[] args) {
        try (Scanner t=new Scanner (System.in)) {
            System.out.println("ingrese saldo actual");
            double saldo=t.nextDouble ();
        
            jose objeto=new jose(saldo);
            objeto.setVisible(true);

        } catch (Exception e) {
            System.err.println("Ocurrio un error "+e.getMessage());
        }

    }
    
}
