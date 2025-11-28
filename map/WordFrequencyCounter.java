import java.util.*;
import java.io.*;

public class WordFrequencyCounter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        HashMap<String, Integer> map = new HashMap<>();
        while ((line = br.readLine()) != null) {
            line = line.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
            String[] words = line.split("\s+");
            for (String w : words) {
                if (w.length() > 0) {
                    map.put(w, map.getOrDefault(w, 0) + 1);
                }
            }
        }
        br.close();
        System.out.println(map);
    }
}
