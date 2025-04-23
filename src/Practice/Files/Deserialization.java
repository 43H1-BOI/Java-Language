package Practice.Files;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) {
        String filename = new String("C:\\Users\\Abhishek\\Java Language\\src\\Practice\\College\\Serialize\\Stu.ser");

        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s1 = (Student) ois.readObject();
            Student s2 = (Student) ois.readObject();
            Student s3 = (Student) ois.readObject();
            Student s4 = (Student) ois.readObject();
            Student s5 = (Student) ois.readObject();

            System.out.println("Displaying Students Info : ");
            s1.displayInfo();
            s2.displayInfo();
            s3.displayInfo();
            s4.displayInfo();
            s5.displayInfo();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}