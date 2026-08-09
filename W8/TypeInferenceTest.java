package W8;

import java.util.*;

public class TypeInferenceTest {
    public static void main(String[] args) {
        var x = 10;
        System.out.println(x);

        var y = "wofih";
        System.out.println(y);

        var arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        var x2 = 10;

        x2 += 20;

        x2 = 30;

        System.out.println(x2);

        System.out.println(arr);
    }
}
