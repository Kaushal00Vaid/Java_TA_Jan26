package W6;

// import all the collection framework --> util package
import java.util.*;

public class ArrayListTest extends ArrayList<Integer> {
    ArrayList<Integer> arr;

    ArrayListTest(ArrayList<Integer> a) {
        arr = a;
    }

    public String toString() {
        String x = "{";
        for(Integer i : arr) {

            // [10, 20, 30, 10] --> Integer --> String --> 10 + "" --> "10"

            // --> {10, 20, 30, 10, 
            x += i + ", ";
        }

        x += "}";

        return x;
    }

    public static void main(String[] args) {
        // how to define ArrayList
        ArrayList<Integer> intArr = new ArrayList<>();

        // how to actually add elements inside it --> .add()
        intArr.add(10);
        intArr.add(20);
        intArr.add(30);
        intArr.add(10);
        // intArr.add(40.78); // Error

        // ArrayListTest myArray = new ArrayListTest(intArr);

        // System.out.println(myArray);

        // printing the thing
        System.out.println(intArr);


        // remove
        intArr.remove(2);

        intArr.remove((Integer)10); // first occurance

        System.out.println(intArr);

        // contains
        // 1) --> travel accross the arraylist and just check
        // for(Integer i : intArr) {
        //     if(i == 30) {
        //         System.out.println("Present");
        //         break;
        //     }
        // }
        System.out.println(intArr.contains(30));

        // iterate in arraylist
        // for(Integer i : intArr) {

        // }

        for(int i = 0; i < intArr.size() ; i++) {
            int x = intArr.get(i); // intArr[i]
            System.out.println(x);
        }


        // get from the user --> how many digits i want
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many elements you want: ");
        int n = in.nextInt();
        

        ArrayList<Integer> userArr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            userArr.add(in.nextInt());
        }

        // remove 20s first occurance
        userArr.remove((Integer)20);

        System.out.println("Enter value to be searched: ");
        int search = in.nextInt();

        System.out.println(userArr.contains(search));

        System.out.println(userArr);

        in.close();

    }
}