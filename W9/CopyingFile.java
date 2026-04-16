package W9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyingFile {
    public static void main(String[] args) {
        // read the file from input.txt
        // BufferedReader
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt"));

            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("output.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
