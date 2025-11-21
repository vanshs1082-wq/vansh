import java.time.LocalDate;

public class Problem4 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2025, 9, 22);
        LocalDate d2 = LocalDate.of(2025, 10, 5);

        if (d1.isBefore(d2)) {
            System.out.println("First date is before second date.");
        } else if (d1.isAfter(d2)) {
            System.out.println("First date is after second date.");
        } else if (d1.isEqual(d2)) {
            System.out.println("Both dates are equal.");
        }
    }
}
