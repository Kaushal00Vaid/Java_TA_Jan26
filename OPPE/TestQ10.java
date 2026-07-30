package OPPE;

class User {
    String name;

    User(String n) {
        name = n;
    }

    public void validateAccess() {
        System.out.println(name + " Has Full User Access");
    }
}

class Admin extends User {
    Admin(String n) {
        super(n);
    }

    public void validateAccess() {
        System.out.println(super.name + " has full admin access");
    }
}

class Member extends User {
    Member(String n) {
        super(n);
    }

    public void validateAccess() {
        System.out.println(super.name + " has member access");
    }
}

class Guest extends User {
    Guest(String n) {
        super(n);
    }

    public void validateAccess() {
        System.out.println(super.name + " has guest access only");
    }
}

public class TestQ10 {
    public static void main(String[] args) {
        User user1 = new Admin("Amit");
        User user2 = new Member("Bhavna");
        User user3 = new Guest("Chitra");

        user1.validateAccess();
        user2.validateAccess();
        user3.validateAccess();
    }
}
