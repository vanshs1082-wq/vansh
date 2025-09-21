interface Worker{
 void performDuties();
}
class Person{
 String a;int b;
 Person(String x,int y){a=x;b=y;}
}
class Chef extends Person implements Worker{
 Chef(String x,int y){super(x,y);}
 public void performDuties(){System.out.println("Cook");}
}
class Waiter extends Person implements Worker{
 Waiter(String x,int y){super(x,y);}
 public void performDuties(){System.out.println("Serve");}
}
class RestaurantManagement{
 public static void main(String[] a){
  Chef x=new Chef("John",1);
  x.performDuties();
 }
}