package OPPE;

import java.util.*;

// DEFINE class ComplexNum
class ComplexNum<T extends Number> {
    T real;
    T comp;

    // constructor to initialise the instance variable
    ComplexNum(T real, T comp) {
        this.real = real;
        this.comp = comp;
    }

    public ComplexNum<Double> add(ComplexNum<? extends Number> c) {
        // real = current_real + c.real
        double final_real = this.real.doubleValue() + c.real.doubleValue();
        double final_comp = this.comp.doubleValue() + c.comp.doubleValue();

        return new ComplexNum<Double>(final_real, final_comp);
    }

    // override toString() method
    public String toString() {
        return this.real.doubleValue() + " + " + this.comp.doubleValue() + "i";
    }
}

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt(); // real
        n2 = sc.nextInt(); // imaginary
        d1 = sc.nextDouble(); // real
        d2 = sc.nextDouble(); // imaginary
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}