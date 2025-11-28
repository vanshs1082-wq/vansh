import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        HashMap<Integer, List<String>> inv = new HashMap<>();
        for (String k : map.keySet()) {
            int v = map.get(k);
            if (!inv.containsKey(v)) {
                inv.put(v, new ArrayList<>());
            }
            inv.get(v).add(k);
        }
        System.out.println(inv);
    }
}
