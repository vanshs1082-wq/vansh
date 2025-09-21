interface Refuelable{
 void refuel();
}
class Vehicle{
 int a;String b;
 Vehicle(int x,String y){a=x;b=y;}
}
class ElectricVehicle extends Vehicle{
 ElectricVehicle(int x,String y){super(x,y);}
 void charge(){System.out.println("Charging");}
}
class PetrolVehicle extends Vehicle implements Refuelable{
 PetrolVehicle(int x,String y){super(x,y);}
 public void refuel(){System.out.println("Refueling");}
}
class VehicleManagement{
 public static void main(String[] a){
  PetrolVehicle x=new PetrolVehicle(180,"Car");
  x.refuel();
 }
}