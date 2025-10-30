import java.util.*;
import java.util.function.*;
public class NotificationFiltering {
    public static void main(String[] args) {
        List<String> xyz = Arrays.asList("Critical","Normal","Low","Urgent");
        Predicate<String> p = a -> a.equals("Critical") || a.equals("Urgent");
        xyz.stream().filter(p).forEach(System.out::println);
    }
}