package Basics.OOPs_9.Abstraction.Abstract_Class;

public class AbstractClass {


    public static void main(String[] args) {
        Horse Neel = new Horse();
        Neel.eat();
        Neel.setName("Neel");
        Neel.setAge(20);
        Neel.setSpeed(75.6);
        Neel.info();

        System.out.println();

        Dog Muku = new Dog();
        Muku.eat();
        Muku.setName("Muku");
        Muku.setAge(7);
        Muku.setSpeed(5.6);
        Muku.info();

    }

    /*
     A class which is declared with the abstract keyword is known as an abstract class in Java.
     It can have abstract and non-abstract methods (method with the body).
     The main motive of Abstract class is to Bind up all the Important methods and data members in a single class and then
     reuse them in child class.

     * Objects of Abstract Class Cannot be Created
     * Methods can be Abstract or Non-Abstract
     * Abstract Methods can be defined only inside abstract class and then defined in child class
    */
    static abstract class Animal {
        int age;
        double speed;
        String name;

        // non-abstract functions
        void eat() {
            System.out.println("Animal Eats...");
        }

        void setName(String s) {
            name = s;
        }

        void setSpeed(double s) {
            speed = s;
        }

        void setAge(int a) {
            age = a;
        }

        // abstract methods can be declared in parent class but must be defined in
        // child class else it  will show an error.
        abstract void info();

    }

    static class Horse extends Animal {
        // Overriding eat() function
        void eat() {
            System.out.println("Horse Eat's Black Chana");
        }

        void info() {
            System.out.println("Name of Horse is " + name);
            System.out.println("Speed of Horse is " + speed + " km/h");
            System.out.println("Horse is " + age + " Years Old .");
        }
    }

    static class Dog extends Animal {
        // Overriding eat() function
        void eat() {
            System.out.println("Dog Eat's Meat and Milk .");
        }

        void info() {
            System.out.println("Name of Dog is " + name);
            System.out.println("Speed of Dog is " + speed + " km/h");
            System.out.println("Dog is " + age + " Years Old .");
        }
    }

}