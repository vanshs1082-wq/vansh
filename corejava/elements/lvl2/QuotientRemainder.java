import java.util.*;
class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Quotient: " + quotient + ", Remainder: " + remainder + " of numbers " + a + " and " + b);
    }
}