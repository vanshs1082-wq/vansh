import java.util.ArrayList;
public class Customer {
    String a;
    ArrayList<Account> b=new ArrayList<Account>();
    public Customer(String x){
        a=x;
    }
    public void addAccount(Account x){
        b.add(x);
    }
    public void viewBalance(){
        for(Account x:b) System.out.println(a+" bal "+x.a+" bank "+x.b.a);
    }
}