import java.util.*;
class OutOfStockException extends Exception {
    public OutOfStockException(String x){super(x);}
}
class PaymentFailedException extends Exception {
    public PaymentFailedException(String x){super(x);}
}
class OrderSys {
    void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random a = new Random();
        int b = a.nextInt(2);
        if(b==0) throw new OutOfStockException("no");
        else throw new PaymentFailedException("pay");
    }
    public static void main(String[] y) {
        OrderSys z = new OrderSys();
        try {
            z.placeOrder();
        } catch(OutOfStockException e) {
            System.out.println("out");
        } catch(PaymentFailedException e) {
            System.out.println("fail");
        }
    }
}
