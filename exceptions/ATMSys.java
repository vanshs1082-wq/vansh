class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String x) {
        super(x);
    }
}
class ATM {
    int a = 10000;
    void withdraw(int b) throws InsufficientFundsException {
        if(b > a) {
            throw new InsufficientFundsException("not enough");
        }
        a = a - b;
        System.out.println("ok " + a);
    }
    public static void main(String[] y) {
        ATM z = new ATM();
        try {
            z.withdraw(15000);
        } catch(InsufficientFundsException e) {
            System.out.println("error " + e.getMessage());
        }
    }
}
