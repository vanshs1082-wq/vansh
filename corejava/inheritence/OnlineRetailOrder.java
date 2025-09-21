class Order{
 int a;String b;
 Order(int x,String y){a=x;b=y;}
}
class ShippedOrder extends Order{
 String c;
 ShippedOrder(int x,String y,String z){
  super(x,y);c=z;
 }
}
class DeliveredOrder extends ShippedOrder{
 String d;
 DeliveredOrder(int x,String y,String z,String w){
  super(x,y,z);d=w;
 }
 String getOrderStatus(){
  return "Delivered "+d;
 }
}
class OnlineRetailOrder{
 public static void main(String[] a){
  DeliveredOrder x=new DeliveredOrder(1,"2025-09-21","T123","2025-09-25");
  System.out.println(x.getOrderStatus());
 }
}