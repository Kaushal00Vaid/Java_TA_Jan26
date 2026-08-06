package W7;

class NotAValidTeamException extends Exception {
    NotAValidTeamException(String msg) {
        super(msg);
    }
}

class NotAGoodTeamException extends Exception {
    NotAGoodTeamException(String msg) {
        super(msg);
    }
}

class Player {
    String name;
    int age;

    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class CricketTeamQ3 {
    Player[] players;
    int[] scores;

    CricketTeamQ3() {
        players = new Player[11];
        scores = new int[11];

        for (int i = 0; i < 11; i++) {
            scores[i] = (int) (Math.random() * 100);
        }
    }

    public void isValid() throws NotAValidTeamException {
        if (players.length > 11) {
            throw new NotAValidTeamException("Not a Valid Team");
        }
    }

    public void isGood() throws NotAGoodTeamException {
        for (int i : scores) {
            if (i < 80) {
                throw new NotAGoodTeamException("Bad Team");
            }
        }

        System.out.println("Good Team");
    }

    public static void main(String[] args) {

    }
}
