package class25;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipstick", 100.0);
        makeup.put("BlushOn", 68.00);
        makeup.put("EyeLiner", 50.5);
        makeup.put("Foundation", 120.0);
        makeup.put("Base", 25.0);

        Set<String> keys = makeup.keySet();
        var keys1 = makeup.keySet();
        System.out.println(keys1);
        System.out.println(keys);
        Collection<Double> values = makeup.values();
        System.out.println(values);
        var values1 = makeup.values();
        System.out.println(values1);
    }
}
