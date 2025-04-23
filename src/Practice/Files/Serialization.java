package Practice.Files;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        Student s1 = new Student("Abhi", "IIPS", "MCA", 81034);
        Student s2 = new Student("Tushar", "EMRC", "Film Making", 96303);
        Student s3 = new Student("Divya", "IMS", "EShip", 85426);
        Student s4 = new Student("Akshata", "SOC", "Bakwas", 79854);
        Student s5 = new Student("Akshat", "SOL", "BALLB", 56454);

        String filename = new String("C:\\Users\\Abhishek\\Java Language\\src\\Practice\\College\\Serialize\\Stu.ser");

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream ois = new ObjectOutputStream(fos);

            ois.writeObject(s1);
            ois.writeObject(s2);
            ois.writeObject(s3);
            ois.writeObject(s4);
            ois.writeObject(s5);

            ois.close();
            fos.close();
            System.out.println("Object Serialized Successfully ! ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Student implements Serializable {
    String name;
    String department;
    String course;
    int studentID;

    Student(String name, String department, String course, int studentID) {
        this.name = name;
        this.department = department;
        this.course = course;
        this.studentID = studentID;
    }

    void displayInfo() {
        System.out.println("\nName : " + name);
        System.out.println("ID : " + studentID);
        System.out.println("Department : " + department);
        System.out.println("Course : " + course);
    }
}