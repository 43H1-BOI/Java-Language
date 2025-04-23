package Practice.College.AbstractKeyword;

public class Main {
    public static void main(String[] args) {
//        Person p = new Person("Abhi");
        Student s = new Student("Abhi", 20, 1854, "MCA");
        Employee e = new Employee("YoYoo", 25, 3964, "Finance");

        s.printDetails();
        e.printDetails();
    }
}

abstract class Person {
    String name;
    int age;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void printDetails();

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

class Student extends Person {
    int studentID;
    String course;

    Student(String name) {
        super(name);
    }

    Student(String name, int age) {
        super(name, age);
    }

    Student(String name, int age, int studentID, String course) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
    }

    void printDetails() {
        System.out.println("Student Details : ");
        System.out.print(name + "\t");
        System.out.print(age + "\t");
        System.out.print(studentID + "\t");
        System.out.println(course + "\n");
    }
}

class Employee extends Person {
    int empID;
    String department;

    Employee(String name) {
        super(name);
    }

    Employee(String name, int age) {
        super(name, age);
    }

    Employee(String name, int age, int empID, String department) {
        super(name, age);
        this.empID = empID;
        this.department = department;
    }

    void printDetails() {
        System.out.println("Employee Details : ");
        System.out.print(name + "\t");
        System.out.print(age + "\t");
        System.out.print(empID + "\t");
        System.out.println(department + "\n");
    }
}