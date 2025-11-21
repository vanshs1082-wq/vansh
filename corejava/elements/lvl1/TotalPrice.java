import java.util.*;
class TotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double price = input.nextDouble();
        System.out.print("Enter quantity: ");
        double quantity = input.nextDouble();
        double total = price * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + price);
    }
}