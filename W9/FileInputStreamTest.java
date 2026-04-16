package W9;

import java.io.FileInputStream;

public class FileInputStreamTest {
    public static void main(String[] args) {
        // read a file --> FileInputStream

        try {
            FileInputStream fis = new FileInputStream("input.txt"); // input.txt

            int data;
            while ((data = fis.read()) != -1) {
                System.out.println((char) data); // reads 1 byte and then prints it.
            }

        } catch (Exception e) {
            System.out.println("I am not able to perform this");
        }
    }
}
