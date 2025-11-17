import java.util.*;
class NegativeAmountException extends Exception {
    public NegativeAmountException(String x){super(x);}
}
class InsufficientFundsException2 extends Exception {
    public InsufficientFundsException2(String x){super(x);}
}
class NetworkFailureException extends Exception {
    public NetworkFailureException(String x){super(x);}
}
class Transaction {
    void doTrans() throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        Random a = new Random();
        int b = a.nextInt(3);
        if(b==0) throw new NegativeAmountException("neg");
        if(b==1) throw new InsufficientFundsException2("less");
        if(b==2) throw new NetworkFailureException("net");
    }
    public static void main(String[] z) {
        Transaction x = new Transaction();
        try {
            x.doTrans();
        } catch(NegativeAmountException e) {
            System.out.println("no neg");
        } catch(InsufficientFundsException2 e) {
            System.out.println("no bal");
        } catch(NetworkFailureException e) {
            System.out.println("net err");
        }
    }
}
