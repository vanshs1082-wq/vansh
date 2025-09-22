// EmployeeManagementSystem.java
// All classes and interfaces in a single file. Run: javac EmployeeManagementSystem.java && java EmployeeManagementSystem
import java.util.*;

public class EmployeeManagementSystem {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("FT001","Alice",30000,5000));
        employees.add(new PartTimeEmployee("PT001","Bob",0,80,200));
        for(Employee e: employees){
            e.displayDetails();
        }
    }
}

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getEmployeeId(){ return employeeId; }
    public void setEmployeeId(String id){ this.employeeId = id; }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public double getBaseSalary(){ return baseSalary; }
    public void setBaseSalary(double s){ this.baseSalary = s; }
    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private double monthlyBonus;
    private String department;
    public FullTimeEmployee(String id, String name, double baseSalary, double monthlyBonus){
        super(id,name,baseSalary);
        this.monthlyBonus = monthlyBonus;
    }
    public double getMonthlyBonus(){ return monthlyBonus; }
    public void setMonthlyBonus(double b){ this.monthlyBonus = b; }
    @Override
    public double calculateSalary(){ return getBaseSalary() + monthlyBonus; }
    @Override
    public void assignDepartment(String dept){ this.department = dept; }
    @Override
    public String getDepartmentDetails(){ return department == null ? "No Dept" : department; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;
    public PartTimeEmployee(String id, String name, double baseSalary, int hoursWorked, double hourlyRate){
        super(id,name,baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public int getHoursWorked(){ return hoursWorked; }
    public void setHoursWorked(int h){ this.hoursWorked = h; }
    @Override
    public double calculateSalary(){ return hoursWorked * hourlyRate; }
    @Override
    public void assignDepartment(String dept){ this.department = dept; }
    @Override
    public String getDepartmentDetails(){ return department == null ? "No Dept" : department; }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}
