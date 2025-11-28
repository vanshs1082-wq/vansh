import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1);
        m1.put("B", 2);
        HashMap<String, Integer> m2 = new HashMap<>();
        m2.put("B", 3);
        m2.put("C", 4);
        HashMap<String, Integer> res = new HashMap<>();
        for (String k : m1.keySet()) {
            res.put(k, m1.get(k));
        }
        for (String k : m2.keySet()) {
            res.put(k, res.getOrDefault(k, 0) + m2.get(k));
        }
        System.out.println(res);
    }
}
