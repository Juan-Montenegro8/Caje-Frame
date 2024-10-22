package presentarcaje;
import java.util.*;
public class Presentarcaje {

    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        double sal;
        System.out.println("ingrese saldo actual");
        sal=t.nextDouble ();
        
        jose o=new jose(sal);
        o.setVisible(true);

    }
    
}
