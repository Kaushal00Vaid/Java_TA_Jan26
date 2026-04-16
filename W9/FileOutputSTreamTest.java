package W9;

import java.io.FileOutputStream;

public class FileOutputSTreamTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");

            String text = "Hello world";

            fos.write(text.getBytes());

        } catch (Exception e) {
            System.out.println("I cant perform this");
        }
    }
}
