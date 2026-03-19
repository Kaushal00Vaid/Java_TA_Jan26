package W5;

class GoldFish {
    public void func1() {
        System.out.println("Hi from goldfish");
    }
}

class Shark {
    public void func1() {
        System.out.println("Hi from goldfish");
    }
}

// generics
class Aquarium <T> {
    private T fish1;
    private T fish2;

    Aquarium(T f1, T f2) {
        fish1 = f1;
        fish2 = f2;
    }

    public T getFish1() {
        return fish1;
    }

    public T getFish2() {
        return fish2;
    }
}

public class Basics {

    public static void main(String[] args) {
        GoldFish f1 = new GoldFish();
        Shark f2 = new Shark();

        // Aquarium aq = new Aquarium(f1, f2);

        Aquarium<GoldFish> aq = new Aquarium<GoldFish>(f1, f1);

        Aquarium<Shark> aq2 = new Aquarium<>(f2, f2);

        // Aquarium<GoldFish> aq2 = new Aquarium<>(f1, f2); // ERROR

        // RAW TYPING
        // Aquarium aq2 = new Aquarium(f1, f2);

    }
}