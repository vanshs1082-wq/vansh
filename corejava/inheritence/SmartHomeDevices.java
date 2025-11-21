class Device{
 int a;String b;
 Device(int x,String y){a=x;b=y;}
}
class Thermostat extends Device{
 int c;
 Thermostat(int x,String y,int z){
  super(x,y);c=z;
 }
 void displayStatus(){
  System.out.println(a+" "+b+" "+c);
 }
}
class SmartHomeDevices{
 public static void main(String[] a){
  Thermostat x=new Thermostat(1,"On",24);
  x.displayStatus();
 }
}