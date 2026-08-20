package W9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutputStreamsTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input_new.txt");

            // System.out.println((char) fis.read()); // reads 1 byte --> 1 character

            // byte[] fullArrayOfFile = fis.readAllBytes();
            // for (byte i : fullArrayOfFile) {
            // System.out.print((char) i);
            // }

            int data;

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

            fis.close();

            // writing to a file
            FileOutputStream fos = new FileOutputStream("output_new.txt", true);

            String text = "\nAgain Hi";

            fos.write(text.getBytes());

            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
