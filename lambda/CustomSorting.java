import java.util.*;
public class CustomSorting {
    public static void main(String[] args) {
        List<Product> abc = new ArrayList<>();
        abc.add(new Product("a",100,4.5,10));
        abc.add(new Product("b",200,4.9,20));
        abc.add(new Product("c",150,4.2,15));
        abc.sort((x,y)->Double.compare(y.price,x.price));
        for(Product p:abc){System.out.println(p.name+" "+p.price);}    
    }
}
class Product{
    String name;double price;double rating;double discount;
    Product(String n,double p,double r,double d){name=n;price=p;rating=r;discount=d;}
}