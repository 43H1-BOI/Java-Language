package Practice.AllInOne;

//import java.util.*;

public class GUI {
    public static void main(String[] args) {
        Employee e = new Employee("Abhishek", "IIPS", 1980);

    }

}

class Employee {
    public String name;
    public String designation;
    public int eNum;

    Employee(String name, String designation, int eNum) {
        this.designation = designation;
        this.name = name;
        this.eNum = eNum;
    }
}