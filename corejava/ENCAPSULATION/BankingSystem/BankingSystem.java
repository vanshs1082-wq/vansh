// BankingSystem.java
import java.util.*;

public class BankingSystem {
    public static void main(String[] args){
        List<BankAccount> list = new ArrayList<>();
        list.add(new SavingsAccount("S001","Rahul",10000));
        list.add(new CurrentAccount("C001","Priya",5000));
        for(BankAccount a: list){
            System.out.println(a.getHolderName()+" ("+a.getAccountNumber()+"): Balance="+a.getBalance()+", Interest="+a.calculateInterest());
        }
    }
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String acc,String holder,double balance){
        this.accountNumber = acc; this.holderName = holder; this.balance = balance;
    }
    public String getAccountNumber(){ return accountNumber; }
    public String getHolderName(){ return holderName; }
    public double getBalance(){ return balance; }
    protected void setBalance(double b){ this.balance = b; }
    public void deposit(double amount){ if(amount>0) setBalance(getBalance()+amount); }
    public boolean withdraw(double amount){ if(amount>0 && getBalance()>=amount){ setBalance(getBalance()-amount); return true;} return false;}
    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc,String holder,double bal){ super(acc,holder,bal); }
    @Override public double calculateInterest(){ return getBalance()*0.04; }
    @Override public boolean applyForLoan(double amount){ return calculateLoanEligibility() >= amount; }
    @Override public double calculateLoanEligibility(){ return getBalance()*2; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc,String holder,double bal){ super(acc,holder,bal); }
    @Override public double calculateInterest(){ return 0.0; }
}
