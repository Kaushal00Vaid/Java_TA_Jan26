package W4;

abstract class DataProcessor {
    abstract void process();
    abstract void readData();

    void saveData() {
        System.out.println("Saving Processed data");
    }

    final void processData() {
        readData();
        process();
        saveData();
    }

    void func1();
}

abstract class CSVProcessor extends DataProcessor {
    // must have --> process() and readData()
    void process() {
        System.out.println("Processing CSV Data");
    }

    void readData() {
        System.out.println("Reading CSV...");
    }
}

public class Demo{
    public static void main(String[] args) {
        DataProcessor dp = new CSVProcessor();
        dp.processData();
    }
}
