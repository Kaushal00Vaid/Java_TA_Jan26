package W9;

import java.io.*;

public class BufferedWayTest {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt"));

            // read
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }

    }
}
