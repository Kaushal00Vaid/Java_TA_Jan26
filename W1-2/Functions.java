class ClassA {
    public int add2(int a, int b) {
        return a + b;
    }
}


public class Functions {

    // returnType funcName(args)

    

    int add(int a, int b) {
        ClassA obj1 = new ClassA();
        return obj1.add2(a, b);
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        // add(a, b);
    }
}
