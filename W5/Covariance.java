package W5;

class Box <T> {

}

class Animal {
    public void func1() {
        System.out.println("Animal class");
    }
}

class Cat extends Animal {
    public void func1() {
        System.out.println("Animal class");
    }
}

class Dog extends Animal {
    public void func1() {
        System.out.println("Animal class");
    }
}

public class Covariance {
    // we could do this subtyping
    Animal a = new Cat();

    // covariance is not allowed in generics
    // Box<Animal> b = new Box<Cat>(); // ERROR
    
    Box<Cat> b = new Box<Cat>();
}
