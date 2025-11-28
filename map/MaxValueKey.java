import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (String k : map.keySet()) {
            if (map.get(k) > maxValue) {
                maxValue = map.get(k);
                maxKey = k;
            }
        }
        System.out.println(maxKey);
    }
}
