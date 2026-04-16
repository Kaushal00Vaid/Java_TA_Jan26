package W9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Person class
class Person {
    int id;
    String name;

    // constructors
    Person(int n, String n2) {
        id = n;
        name = n2;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // toString() overriden
    // Person{name='<name>'}
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

public class ResultsQ2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person(1, "Name-1"));
        list.add(new Person(3, "Name-2"));
        list.add(new Person(5, "Name-3"));
        list.add(new Person(9, "Name-4"));

        Map<Integer, Person> idToPerson = list.stream()
                .collect(Collectors.toMap(
                        n -> n.getId(),
                        n -> n));

        System.out.println(idToPerson);
    }
}
