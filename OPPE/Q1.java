package OPPE;

import java.util.*;

class Player {
    private String name;
    private String[] games;

    // *****Define constructor(s) here
    Player(String name, String[] games) {
        this.name = name;
        // this.games = games; // SHALLOW COPY -- Also works

        games = new String[games.length];

        for (int i = 0; i < games.length; i++) {
            this.games[i] = games[i];
        }
    }

    public Player(Player p) {
        this.name = p.name;

        // SHALLOW COPY
        // this.games = p.games;

        // DEEP COPY
        // 1) initialise the array
        // 2) copy the elements one by one
        this.games = new String[p.games.length];

        for (int i = 0; i < p.games.length; i++) {
            games[i] = p.games[i];
        }
    }

    public void setName(String n) {
        name = n;
    }

    public void setGames(int indx, String g) {
        games[indx] = g;
    }

    public String getName() {
        return name;
    }

    public String getGames(int indx) {
        return games[indx];
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] games = { "Throwball", "Javelin", "Volleyball" };
        Player p1 = new Player("Ranjit", games);
        // copy costructor
        Player p2 = new Player(p1);
        p2.setName(sc.next());
        p2.setGames(1, sc.next());
        System.out.println(p1.getName() + ": " + p1.getGames(1));
        System.out.println(p2.getName() + ": " + p2.getGames(1));
    }
}