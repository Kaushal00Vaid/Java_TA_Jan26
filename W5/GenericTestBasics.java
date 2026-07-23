package W5;

class GoldFish {

}

class Shark {

}

class Aquarium<T> {
    // 2 fish
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

class Pair<T, V> {
    T name;
    V marks;

    Pair(T n, V m) {
        name = n;
        marks = m;
    }
}

public class GenericTestBasics {

    public static void main(String[] args) {
        GoldFish f1 = new GoldFish();
        GoldFish f2 = new GoldFish();

        Shark s1 = new Shark();

        // Aquarium aq = new Aquarium(f1, s1);

        Aquarium<GoldFish> aqG = new Aquarium<GoldFish>(f1, f2);
        Aquarium<Shark> aqS = new Aquarium<Shark>(s1, s1);

        // T --> Name
        // V --> marks
        Pair<String, Integer> p1 = new Pair<>("Kaushal", 20);

        // T --> Friend1
        // V --> Frind2
        Pair<String, String> p2 = new Pair<>("kaushal", "983265");
    }
}