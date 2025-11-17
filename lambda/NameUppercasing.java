import java.util.*;
public class NameUppercasing {
    public static void main(String[] args) {
        List<String> xyz = Arrays.asList("ram","shyam","mohan");
        xyz.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}