import java.util.ArrayList;
public class Order {
    ArrayList<Product> a=new ArrayList<Product>();
    public void addProduct(Product x){
        a.add(x);
    }
    public void show(){
        for(Product p:a) System.out.println(p.a);
    }
}