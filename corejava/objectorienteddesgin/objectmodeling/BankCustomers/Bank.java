import java.util.ArrayList;
public class Bank {
    String a;
    ArrayList<Account> b=new ArrayList<Account>();
    public Bank(String x){
        a=x;
    }
    public void openAccount(Customer c,int x){
        Account y=new Account(x,this);
        b.add(y);
        c.addAccount(y);
    }
    public void show(){
        for(Account z:b) System.out.println(a+" acc "+z.a);
    }
}