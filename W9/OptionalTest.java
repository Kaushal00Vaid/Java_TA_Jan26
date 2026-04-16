package W9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalTest {
    public static void main(String[] args) {
        // String name = null;

        // System.out.println(name.length());

        // int[] arr = new int[]{4, 5, 6, 7};

        // int random = arr.stream().filter(n -> n < 2).max();

        // CREATING OPTIONALS
        Optional<String> name = Optional.of("hello");

        // toString() overriden
        System.out.println(name);

        // Optional<String> errorOne = Optional.of(null); // NullPointerException

        // toString() overriden
        System.out.println(name);

        // ofNullable
        Optional<String> name2 = Optional.ofNullable(null);

        Optional<String> name3 = Optional.ofNullable("Kaushal");

        System.out.println(name2);

        // empty
        Optional<String> empty = Optional.empty();

        System.out.println(empty);

        // CHECKING VALUES
        Optional<Double> val = Optional.of(45.89);

        Optional<Double> emptyVal = Optional.ofNullable(null);

        List<Double> res = new ArrayList<>();

        // ifPresent
        // n -> cond. (action)
        val.ifPresent(v -> res.add(v));
        emptyVal.ifPresent(v -> res.add(v));

        System.out.println(res); // [45.89]

        // ifPresentOrElse
        emptyVal.ifPresentOrElse(v -> res.add(v),
                () -> System.out.println("the value is empty"));

        // if(emptyVal.isEmpty()) {
        // System.out.println("the value is empty");
        // } else {
        // res.add(v);
        // }

        System.out.println(res);

        // DEFAULT VALUES

        // .orElse()
        // Streams can be empty
        double orElse = val.orElse(-1.0);
        System.out.println(orElse);

        // orElseGet()

        double orElseGet = emptyVal.orElseGet(() -> randomValue());
        System.out.println(orElseGet);

        // orElseThrow()
        double orElseThrow = emptyVal.orElseThrow();
        System.out.println(orElseThrow);

        try {
            double orElseThrow2 = emptyVal.orElseThrow(IllegalStateException::new);

            System.out.println(orElseThrow2);
        } catch (IllegalStateException e) {
            System.out.println("Exception occured");
        }

    }

    public static double randomValue() {
        return Math.random();
    }
}