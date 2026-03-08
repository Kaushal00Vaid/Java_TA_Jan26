package W4;

interface InnerPvtClassTestInterface {
    void pvtfunc();
    int getStd();
}

// nested classes --> class inside a class
class ClassA {
    String x;

    private class ClassB implements InnerPvtClassTestInterface {
        int std;
        private String name;

        ClassB() {
            name = "Kaushal";
            std = 10;
        }

        public void pvtfunc() {
            System.out.println("I am inside PvtClass");
        }

        public int getStd() {
            return std;
        }

    }

    int abc() {
        ClassB ob = new ClassB();
        return ob.std + 10;
    }
    

    // getter for pvt class
    public ClassB getPvtClassAccess() {
        // return new ClassB();
        ClassB ob = new ClassB();
        return ob;
    }
}

public class PvtClassTest {
    public static void main(String[] args) {
        ClassA obj = new ClassA();

        // ClassB ob = new Classb(); // because private class

        // InnerPvtClassTestInterface acc = new ClassB();
        InnerPvtClassTestInterface acc = obj.getPvtClassAccess();

        acc.pvtfunc();
    }
}