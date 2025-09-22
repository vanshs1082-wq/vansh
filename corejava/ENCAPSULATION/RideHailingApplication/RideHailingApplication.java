// RideHailingApplication.java
import java.util.*;

public class RideHailingApplication {
    public static void main(String[] args){
        List<Vehicle> vehicles = Arrays.asList(
            new Car("V001","Ramesh",15),
            new Bike("V002","Suresh",8),
            new Auto("V003","Mahesh",6)
        );
        double distance = 10.5;
        for(Vehicle v: vehicles){
            System.out.println(v.getVehicleDetails()+" fare for "+distance+"km = " + v.calculateFare(distance));
        }
    }
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    public Vehicle(String vehicleId,String driverName,double ratePerKm){
        this.vehicleId=vehicleId; this.driverName=driverName; this.ratePerKm=ratePerKm;
    }
    public String getVehicleId(){ return vehicleId; }
    public String getDriverName(){ return driverName; }
    public double getRatePerKm(){ return ratePerKm; }
    public String getVehicleDetails(){ return driverName+" ("+vehicleId+") ratePerKm="+ratePerKm; }
    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}

class Car extends Vehicle implements GPS {
    private String location="Unknown";
    public Car(String id,String driver,double rate){ super(id,driver,rate); }
    @Override public double calculateFare(double distance){ return getRatePerKm()*distance; }
    @Override public String getCurrentLocation(){ return location; }
    @Override public void updateLocation(String loc){ this.location = loc; }
}

class Bike extends Vehicle implements GPS {
    private String location="Unknown";
    public Bike(String id,String driver,double rate){ super(id,driver,rate); }
    @Override public double calculateFare(double distance){ return getRatePerKm()*distance*0.7; }
    @Override public String getCurrentLocation(){ return location; }
    @Override public void updateLocation(String loc){ this.location = loc; }
}

class Auto extends Vehicle implements GPS {
    private String location="Unknown";
    public Auto(String id,String driver,double rate){ super(id,driver,rate); }
    @Override public double calculateFare(double distance){ return getRatePerKm()*distance*0.6; }
    @Override public String getCurrentLocation(){ return location; }
    @Override public void updateLocation(String loc){ this.location = loc; }
}
