package W9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultsStreamTest {
    public static void main(String[] args) {
        String[] original = { "Hello", "Worldd", "Bye Bye" };

        Stream<String> filteredStream = Arrays.stream(original)
                .filter(n -> n.length() <= 5);

        // to Array
        String[] filteredArray = filteredStream.toArray(String[]::new);

        for (String i : filteredArray) {
            System.out.println(i);
        }

        // toList
        List<String> listOfString = Arrays.stream(original)
                .filter(n -> n.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(listOfString);

        Set<String> set = Arrays.stream(original)
                .filter(n -> n.length() <= 5)
                .collect(Collectors.toSet());

        System.out.println(set);

        TreeSet<String> set1 = Arrays.stream(original)
                .filter(n -> n.length() <= 5)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(set1);

        Map<Integer, String> hash = Arrays.stream(original)
                .filter(n -> n.length() >= 5)
                .collect(Collectors.toMap(
                        n -> n.length(), // key
                        n -> n // value
                ));

        System.out.println(hash);

    }
}
