package W6;
import java.util.*;

class CricketPlayer {
    private int jerseyNo;
    private String name;

    CricketPlayer(int jerseyNo, String n) {
        this.jerseyNo = jerseyNo;
        name = n;
    }

    // getters for my pvt inst var
    public int getJerseyNo() {
        return jerseyNo;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return jerseyNo + " " + name;
    }
}

public class CricketPlayerTest {
    public static void main(String[] args) {
        HashSet<CricketPlayer> hash = new HashSet<>();

        hash.add(new CricketPlayer(18, "Virat"));
        hash.add(new CricketPlayer(8, "Dhoni"));

        hash.add(new CricketPlayer(18, "Virat"));

        for(CricketPlayer i : hash) {
            System.out.println(i);
        }

    }
}
