package W6;
import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();

        hash.add(20);
        hash.add(30);
        hash.add(20);
        hash.add(20);

        System.out.println(hash);

        // drawback of HashSet --> the order is unpredictable
        // TreeMap, TreeSet comes into the play --> sorts the set

        HashSet<String> strHash = new HashSet<>();
        strHash.add("Delhi");
        strHash.add("Hyderabad");
        strHash.add("Chennai");
        strHash.add("Mumbai");
        strHash.add("Hyderabad");
        strHash.add("Chennai");

        System.out.println(strHash);


    }
}
