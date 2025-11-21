package constructor;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay = 1000.0; // Example cost per day

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Generic";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays +
                           ", Total Cost: " + calculateTotalCost());
    }
}
