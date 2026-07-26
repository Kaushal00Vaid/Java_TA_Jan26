package W6;

import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        // HashMap<KeyDataType, ValueDataType>
        HashMap<String, Integer> hash = new HashMap<>();

        hash.put("Kaushal", 50);

        hash.put("Name2", 30);
        hash.put("Name3", 20);
        hash.put("Kaushal", 20); // overwriting the vlaue

        // get
        System.out.println(hash.get("Name2")); // 30
        System.out.println(hash.get("Nameaowifhb")); // null

        System.out.println(hash);

        // iterate through the hashmap
        for (String i : hash.keySet()) {
            System.out.println(hash.get(i));
        }

        System.out.println(hash.getOrDefault("Nameaowifhb", -1));

    }
}
