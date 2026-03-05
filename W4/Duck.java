package W4;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Eating extends Flyable {
    void eat();
}

public class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("i can fly");
    }

    public void swim() {
        System.out.println("I am swim too");
    }
}
