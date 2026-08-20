package W9;

import java.lang.classfile.ClassFile.Option;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTypesTest {

    public Double someRandomFunction(int x) {
        // x^2 + 10;
        return Math.pow(x, 2) + 10;
    }

    public static Optional<Double> reverse(int x) {

        if (x == 0) {
            return Optional.empty();
        }
        return Optional.of(1.0 / x);

        // return Optional.ofNullable(x == 0 ? null : 1.0 / x);
    }

    public static void main(String[] args) {
        // ifPresentOrElse

        Optional<Double> opt1 = Optional.of(42.5);
        Optional<Double> opt2 = Optional.empty();

        // ifPresent
        opt1.ifPresent(x -> System.out.println(x));

        opt2.ifPresent(x -> System.out.println(x)); // ignored

        opt2.ifPresentOrElse(
                x -> System.out.println(x),
                () -> System.out.println("This is a null value"));

        Optional<Double> val = Stream.generate(Math::random)
                .limit(100)
                .filter(n -> n > 0.5)
                .max(Double::compareTo);

        // orElse() --> have a default value
        Double extractedVal1 = val.orElse(-1.0);
        System.out.println(extractedVal1);

        // Double extractedVal2 = val.orElseGet(() -> someRandomFunction());
        // System.out.println(extractedVal2);

        // orElseThrow() --> throw a exception
        try {
            Double extractedVal2 = val.orElseThrow(NullPointerException::new);
            System.out.println(extractedVal2);
        } catch (Exception e) {
            System.out.println("Some exception occuerd");
        }
    }
}
