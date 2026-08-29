package W9;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class CollectingResultsTest {
        public static void main(String[] args) {
                Stream<Double> stream = Stream.generate(Math::random)
                                .filter(n -> n > 0.5)
                                .limit(2);

                Double[] arr = stream.toArray(Double[]::new);

                stream = Stream.generate(Math::random)
                                .filter(n -> n > 0.5)
                                .limit(2);

                // Integer[] arr1 = stream.toArray(Integer[]::new);

                for (Double i : arr) {
                        System.out.print(i + " ");
                }
                // for (Integer i : arr1) {
                // System.out.print(i + " ");
                // }

                System.out.println();

                // Collection --> Set, List, Map
                stream = Stream.generate(Math::random)
                                .filter(n -> n > 0.5)
                                .limit(2);

                List<Double> list = stream.collect(Collectors.toList());
                System.out.println(list);

                stream = Stream.generate(Math::random)
                                .filter(n -> n > 0.5)
                                .limit(2);

                Set<Double> set = stream.collect(Collectors.toSet());
                System.out.println(set);

                stream = Stream.generate(Math::random)
                                .filter(n -> n > 0.5)
                                .limit(2);

                Map<Double, Double> map = stream.collect(Collectors.toMap(
                                (v) -> v,
                                (v) -> Math.pow(v, 2)));

                System.out.println();
                System.out.println(map);

                String[] names = { "John", "Kaushal", "Dhruv", "Dhruv" };

                Stream<String> namesStream = Arrays.stream(names);

                // array of String
                String[] convertedArray = namesStream.toArray(String[]::new);

                for (String i : convertedArray) {
                        System.out.print(i + " ");
                }
                System.out.println();

                // List
                namesStream = Arrays.stream(names);

                List<String> convertedList = namesStream.collect(Collectors.toList());
                System.out.println(convertedList);

                // Set
                namesStream = Arrays.stream(names);
                Set<String> convertedSet = namesStream.collect(Collectors.toSet());
                System.out.println(convertedSet);

                // Map
                // [John, Kaushal, Dhruv, Dhruv]
                /**
                 * {
                 * "John" : 4,
                 * "Kaushal": 7,
                 * "Dhruv": 5
                 * }
                 */
                namesStream = Arrays.stream(names);
                Map<String, Integer> convertedMap = namesStream.collect(Collectors.toMap(
                                (v) -> v, // keymapper
                                (v) -> v.length(), // valueMapper
                                (oldVal, newVal) -> oldVal)); // mergeFunction

                System.out.println(convertedMap);

                // ArrayList
                namesStream = Arrays.stream(names);
                ArrayList<String> convertedArrList = namesStream.collect(
                                Collectors.toCollection(ArrayList::new));
                System.out.println(convertedArrList);

                // HashSet
                namesStream = Arrays.stream(names);
                HashSet<String> convertedHashSet = namesStream.collect(
                                Collectors.toCollection(HashSet::new));
                System.out.println(convertedHashSet);

                // TreeSet
                namesStream = Arrays.stream(names);
                TreeSet<String> convertedTreeSet = namesStream.collect(
                                Collectors.toCollection(TreeSet::new));
                System.out.println(convertedTreeSet);

                // TreeMap
                namesStream = Arrays.stream(names);
                TreeMap<String, Integer> treeMap = namesStream.collect(Collectors.toMap(
                                (v) -> v,
                                (v) -> v.length(),
                                (oldVal, newVal) -> oldVal,
                                TreeMap::new));

        }
}
