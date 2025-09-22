public class Main {
    public static void main(String[] args){
        Bank a=new Bank("B1");
        Customer b=new Customer("C1");
        a.openAccount(b,500);
        a.openAccount(b,1000);
        b.viewBalance();
        a.show();
    }
}