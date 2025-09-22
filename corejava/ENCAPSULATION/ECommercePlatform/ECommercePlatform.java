// ECommercePlatform.java
import java.util.*;

public class ECommercePlatform {
    public static void main(String[] args){
        List<Product> items = new ArrayList<>();
        items.add(new Electronics("E001","Phone",20000));
        items.add(new Clothing("C001","Jeans",1500));
        items.add(new Groceries("G001","Rice",60));
        for(Product p: items){
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;
            System.out.printf("%s (%s): price=%.2f, tax=%.2f, discount=%.2f, final=%.2f\n",
                p.getName(), p.getProductId(), p.getPrice(), tax, discount, finalPrice);
        }
    }
}

abstract class Product {
    private String productId;
    private String name;
    private double price;
    public Product(String productId, String name, double price){
        this.productId = productId; this.name = name; this.price = price;
    }
    public String getProductId(){ return productId; }
    public void setProductId(String id){ this.productId = id; }
    public String getName(){ return name; }
    public void setName(String n){ this.name = n; }
    public double getPrice(){ return price; }
    public void setPrice(double p){ this.price = p; }
    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price){ super(id,name,price); }
    @Override public double calculateDiscount(){ return getPrice() * 0.10; }
    @Override public double calculateTax(){ return getPrice() * 0.18; }
    @Override public String getTaxDetails(){ return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price){ super(id,name,price); }
    @Override public double calculateDiscount(){ return getPrice() * 0.15; }
    @Override public double calculateTax(){ return getPrice() * 0.12; }
    @Override public String getTaxDetails(){ return "GST 12%"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price){ super(id,name,price); }
    @Override public double calculateDiscount(){ return getPrice() * 0.05; }
}
