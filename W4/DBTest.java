package W4;

import java.util.*;

// Define interface Connectable
interface Connectable {
    void connect(String config);
}

class DBManager {
    // Define private inner class PostgresWorker
    private class PostgresWorker implements Connectable {
        public void connect(String str) {
            if (str.equals("SQL")) {
                System.out.println("Connected to Relational DB");
            } else {
                System.out.println("Invalid Postgres config");
            }
        }
    }

    // Define private inner class MongoWorker
    private class MongoWorker implements Connectable {
        public void connect(String str) {
            if (str.equals("NoSQL")) {
                System.out.println("Connected to Document DB");
            } else {
                System.out.println("Invalid Mongo config");
            }
        }
    }

    // Define getSQLWorker()
    public Connectable getSQLWorker() {
        return new PostgresWorker();
    }

    // Define getNoSQLWorker()
    public Connectable getNoSQLWorker() {
        return new MongoWorker();
    }
}

public class DBTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String conf1 = new String("SQL");
        String conf2 = sc.next();

        DBManager manager = new DBManager();
        Connectable sql = manager.getSQLWorker();
        Connectable nosql = manager.getNoSQLWorker();

        sql.connect(conf1);
        nosql.connect(conf2);
    }
}
