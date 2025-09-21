import java.util.*;
class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = input.nextDouble();
        System.out.print("Enter second number: ");
        double b = input.nextDouble();
        System.out.println("Addition: " + (a+b) + " Subtraction: " + (a-b) + " Multiplication: " + (a*b) + " Division: " + (a/b));
    }
}