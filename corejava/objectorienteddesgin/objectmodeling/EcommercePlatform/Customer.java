public class Customer {
    String a;
    public Customer(String x){
        a=x;
    }
    public void placeOrder(Order y){
        System.out.println(a+" placed order");
    }
}