package W6;

import java.util.*;

public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();

        // add
        hash.add("Kaushal");
        hash.add("Kaushal");
        hash.add("Kaushal");
        hash.add("Pulkit");
        hash.add("Kshitij");
        hash.add("Kshitij");

        // fetching --> search it up
        System.out.println(hash.contains("Kaushal32423"));

        // remove
        // hash.remove("Kaushal");

        // iterate through the set
        for (String i : hash) {
            // do the operation
        }

        System.out.println(hash);

        TreeSet<String> h = new TreeSet<>(); // sorted order
        h.add("Kaushal");
        h.add("Kaushal");
        h.add("Kaushal");
        h.add("Pulkit");
        h.add("Kshitij");
        h.add("Kshitij");

        System.out.println(h);

        // insertion order
        LinkedHashSet<String> l = new LinkedHashSet<>(); // insertion order
        l.add("Kaushal");
        l.add("Kaushal");
        l.add("Kaushal");
        l.add("Pulkit");
        l.add("Kshitij");
        l.add("Kshitij");

        System.out.println(l);

    }
}
