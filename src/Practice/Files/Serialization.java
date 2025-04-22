package Practice.Files;

import java.io.ObjectInputStream;

public class Serialization {
    public static void main(String[] args) {
        Employee e1 = new Employee("Abhi", "IIPS", "MCA", 81034);
        Employee e2 = new Employee("Tushar", "EMRC", "Film Making", 96303);
        Employee e3 = new Employee("Divya", "IMS", "EShip", 85426);
        Employee e4 = new Employee("Akshata", "SOC", "Bakwas", 79854);

        try {
//            ObjectInputStream ois = new ObjectInputStream();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Employee {
    String name;
    String department;
    String course;
    int studentID;

    Employee(String name, String department, String course, int studentID) {
        this.name = name;
        this.department = department;
        this.course = course;
        this.studentID = studentID;
    }
}