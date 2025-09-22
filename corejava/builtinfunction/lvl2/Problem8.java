import java.util.*;

public class Problem8 {
    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Enter unit (C/F): ");
        String unit = sc.next();
        if (unit.equalsIgnoreCase("C"))
            System.out.println("In Fahrenheit: " + cToF(temp));
        else if (unit.equalsIgnoreCase("F"))
            System.out.println("In Celsius: " + fToC(temp));
        sc.close();
    }
}
