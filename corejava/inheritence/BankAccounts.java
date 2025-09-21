class BankAccount{
 int a;double b;
 BankAccount(int x,double y){a=x;b=y;}
}
class SavingsAccount extends BankAccount{
 double c;
 SavingsAccount(int x,double y,double z){super(x,y);c=z;}
 void displayAccountType(){System.out.println("Savings");}
}
class CheckingAccount extends BankAccount{
 int c;
 CheckingAccount(int x,double y,int z){super(x,y);c=z;}
 void displayAccountType(){System.out.println("Checking");}
}
class FixedDepositAccount extends BankAccount{
 int c;
 FixedDepositAccount(int x,double y,int z){super(x,y);c=z;}
 void displayAccountType(){System.out.println("FixedDeposit");}
}
class BankAccounts{
 public static void main(String[] a){
  SavingsAccount x=new SavingsAccount(1,2000,5.5);
  x.displayAccountType();
 }
}