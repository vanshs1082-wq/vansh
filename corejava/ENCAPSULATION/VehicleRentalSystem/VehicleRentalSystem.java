// VehicleRentalSystem.java
import java.util.*;

public class VehicleRentalSystem {
    public static void main(String[] args){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("KA01A1234",2000));
        vehicles.add(new Bike("KA02B5678",500));
        vehicles.add(new Truck("KA03C9999",5000));
        for(Vehicle v: vehicles){
            System.out.println(v.getType()+" "+v.getVehicleNumber()+": rent for 3 days = " + v.calculateRentalCost(3));
            if(v instanceof Insurable){
                Insurable ins = (Insurable)v;
                System.out.println(" Insurance: " + ins.calculateInsurance() + " ("+ins.getInsuranceDetails()+")");
            }
        }
    }
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber,String type,double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber(){ return vehicleNumber; }
    public String getType(){ return type; }
    public double getRentalRate(){ return rentalRate; }
    public void setRentalRate(double r){ this.rentalRate = r; }
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String no,double rate){ super(no,"Car",rate); }
    @Override public double calculateRentalCost(int days){ return getRentalRate() * days; }
    @Override public double calculateInsurance(){ return 500.0; }
    @Override public String getInsuranceDetails(){ return "Car insurance fixed 500"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String no,double rate){ super(no,"Bike",rate); }
    @Override public double calculateRentalCost(int days){ return getRentalRate() * days * 0.6; }
    @Override public double calculateInsurance(){ return 150.0; }
    @Override public String getInsuranceDetails(){ return "Bike insurance fixed 150"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String no,double rate){ super(no,"Truck",rate); }
    @Override public double calculateRentalCost(int days){ return getRentalRate() * days * 1.5; }
    @Override public double calculateInsurance(){ return 1200.0; }
    @Override public String getInsuranceDetails(){ return "Truck insurance fixed 1200"; }
}
