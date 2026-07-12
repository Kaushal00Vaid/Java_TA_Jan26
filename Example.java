class A {
    public void show() {
        System.out.println("A show() called");
    }
}

class B extends A {

    public void show() {
        System.out.println("B show() called");
    }
}

public class Example {
    public static void main(String[] args) {

        B ob = new B();

        ob.show();

    }
}