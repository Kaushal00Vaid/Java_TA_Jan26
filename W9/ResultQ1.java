package W9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultQ1 {
    public static boolean isPrime(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count == 2;
    }

    public static void main(String[] args) {
        // int [] --> [...]
        // filter out primes
        // square all the remaining ones
        // convert to new integer array

        Integer[] arr = new Integer[] { 2, 5, 25, 45, 39, 13, 11 };

        Stream<Integer> ans = Arrays.stream(arr)
                .filter(n -> isPrime(n))
                .map(n -> n * n);

        // converting to array
        Integer[] finalAns = ans.toArray(Integer[]::new);

        for (Integer i : finalAns) {
            System.out.println(i);
        }

        // to List<Integer>

        List<Integer> list = Arrays.stream(arr)
                .filter(n -> isPrime(n))
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
