package W5;

class Dictionary <T, U> {
    T key;
    U value;

    Dictionary(T key, U value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(T k) {
        key = k;
    }
}

public class DictTest {
    public static void main(String[] args) {
        Dictionary<String, Integer> dict = new Dictionary<>("key1", 20);
        
        dict.setKey("20");
    }
}
