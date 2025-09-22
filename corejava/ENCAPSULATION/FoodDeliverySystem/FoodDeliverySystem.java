// FoodDeliverySystem.java
import java.util.*;

public class FoodDeliverySystem {
    public static void main(String[] args){
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala",200,2));
        order.add(new NonVegItem("Chicken Biryani",250,1));
        double total=0;
        for(FoodItem f: order){
            double price = f.calculateTotalPrice();
            double discount = (f instanceof Discountable) ? ((Discountable)f).applyDiscount() : 0;
            System.out.println(f.getItemDetails()+", total="+price+", discount="+discount);
            total += price - discount;
        }
        System.out.println("Order total: "+total);
    }
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName,double price,int quantity){
        this.itemName=itemName; this.price=price; this.quantity=quantity;
    }
    public String getItemName(){ return itemName; }
    public double getPrice(){ return price; }
    public int getQuantity(){ return quantity; }
    public String getItemDetails(){ return itemName+" x"+quantity+" = "+(price*quantity); }
    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name,double price,int qty){ super(name,price,qty); }
    @Override public double calculateTotalPrice(){ return getPrice()*getQuantity(); }
    @Override public double applyDiscount(){ return calculateTotalPrice()*0.05; }
    @Override public String getDiscountDetails(){ return "Veg discount 5%"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name,double price,int qty){ super(name,price,qty); }
    @Override public double calculateTotalPrice(){ return getPrice()*getQuantity() + 50; } // extra charge
    @Override public double applyDiscount(){ return calculateTotalPrice()*0.03; }
    @Override public String getDiscountDetails(){ return "Non-veg discount 3%"; }
}
