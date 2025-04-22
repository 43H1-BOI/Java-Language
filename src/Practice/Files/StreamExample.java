package Practice.Files;

import java.io.*;

public class StreamExample {
    public static void main(String[] args) {
        String inFile = "input.txt";
        String outFile = "output.txt";

//        FileOutputStream fos = new FileOutputStream(inFile);
        // Write data to the input file
        try (FileOutputStream fos = new FileOutputStream(inFile)) {
            String data = "Hello, Streams!";
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data from the input file and write to the output file
        try (FileInputStream fis = new FileInputStream(inFile);
             FileOutputStream fos = new FileOutputStream(outFile)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Data copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}