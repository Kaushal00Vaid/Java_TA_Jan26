package W8;

import java.util.*;
import java.util.stream.Stream;

public class StreamsTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Apple");
        arr.add("Hippopotamous");
        arr.add("banana");
        arr.add("encyclopedia");

        // fetch / filter out any words > 10 length
        for (String i : arr) {
            if (i.length() > 10) {
                System.out.println(i);
            }
        }

        long count = arr.stream().filter(x -> x.length() > 10).count();

        System.out.println(count);

        // 1) Stream<Integer> --> List<Integer>
        Stream<Integer> iter = Stream.iterate(0, i -> i < 50, i -> i + 1);

        // iter = [0, 1, 2, 3, 4, 5, ..., 49] as Stream<Integer>
        iter = iter.filter(i -> i % 7 == 0);

        iter.forEach(System.out::println);

        // 2)
        Stream.iterate(0, i -> i < 50, i -> i + 1)
                .map(i -> i % 7 == 0)
                .forEach(System.out::println);

        // 3)
        Stream.iterate(0, i -> i < 50, i -> i + 1)
                .map(i -> i % 7 == 0)
                .forEach(System.out::println);
    }
}
