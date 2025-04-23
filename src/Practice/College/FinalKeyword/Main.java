package Practice.College.FinalKeyword;

public class Main {
    public static void main(String[] args) {
        // final variable can't be reassigned
        // final variable will be written in ALL CAPS (Standard Version)
        final String NAME = "Abhishek";
        // NAME = "Yadav";

        // final methods can't be overridden
        // final String className() { return "Person"; }

        // final class can't be inherited
        // final class Owner { }

        System.out.println("Name : " + NAME);

        Student s1 = new Student("Abhi", 18, 1546, "MCA");
        System.out.println(s1.className());
    }
}