public class Main {
    public static void main(String[] args){
        Customer a=new Customer("C1");
        Product b=new Product("Item1");
        Product c=new Product("Item2");
        Order d=new Order();
        d.addProduct(b);
        d.addProduct(c);
        a.placeOrder(d);
        d.show();
    }
}