package Practice.Files;
/*
import java.io.*;

public class CopyPaste {
    public static void main(String[] args) throws IOException {
        try {
            File in = new File("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt");

            if (in.createNewFile()) {
                System.out.println("File Created Successfully : " + in.getName());
            }


        } catch (IOException e) {
            System.out.println("Exception Occurred : " + e.getMessage());
        } finally {
            System.out.println("Program Ended Successfully !");
        }
    }
}
*/

import java.io.*;

class IOStreams {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }

            System.out.println("Operation Successful !");
        }
    }
}