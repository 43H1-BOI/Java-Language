package Practice.College.FinalKeyword;

class Person {
    String name;
    int age;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    // final methods can't be overridden
    final String className() {
        return "Person";
    }
}

class Student extends Person {
    String course;

    Student(String name) {
        super(name);
    }

    Student(String name, int age) {
        super(name, age);
    }

    Student(String name, int age, int studentID, String course) {
        super(name, age);
        this.course = course;
    }

    void printDetails() {
        System.out.println("Student Details : ");
        System.out.print(name + "\t");
        System.out.print(age + "\t");
        System.out.println(course + "\n");
    }

    // can't override final methods
    //    String className(){}
}
