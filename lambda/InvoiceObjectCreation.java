import java.util.*;
class Invoice{
    String id;
    Invoice(String i){id=i;}
}
public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<String> abc = Arrays.asList("t1","t2","t3");
        abc.stream().map(Invoice::new).forEach(x->System.out.println(x.id));
    }
}