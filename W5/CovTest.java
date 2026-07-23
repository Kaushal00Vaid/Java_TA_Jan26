package W5;

class Animal {

}

class Cat extends Animal {

}

class Dog extends Animal {

}

class Box<T extends Animal> {
    // Cat --> Box<Cat> --> fine
    // Dog --> Box<Dog> --> fine
    // Double --> Box<Double> --> not fine

    T anim;

    Box(T anim) {
        this.anim = anim;
    }
}

public class CovTest {
    public static void main(String[] args) {
        Animal anim = new Cat();
        Animal anim2 = new Dog();

        Cat anim3 = new Cat();

        Box<Animal> ob = new Box<Cat>(anim3);
    }
}
