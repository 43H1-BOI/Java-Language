package Basics.OOPs_9.Polymorphism.Run_Time;

public class Method_Overriding {

    /*
    Method Overriding :-
        If subclass (child class) has the same method as declared in the parent class,
        it is known as method overriding in Java.
        Method overriding is used for runtime polymorphism.

    A Static Method Cannot be Overridden.

    Rules for Method Overriding :-
    * The method must have the same name as in the parent class.
    * The method must have the same parameter as in the parent class.
    * There must be an IS-A relationship (inheritance).


    */

    public static void main(String[] args) {
        Animal Ani = new Animal();
        Ani.eat();

        System.out.println();

        Horse Neel = new Horse();
        Neel.eat();

        System.out.println();

        Dog Muku = new Dog();
        Muku.eat();

        System.out.println();


        Bichu Tatiya = new Bichu();
        Tatiya.eat();
    }

    static class Animal {
        void eat() {
            System.out.println("Animal Eats...");
        }
    }

    static class Horse extends Animal {
        // Overriding eat() function
        void eat() {
            System.out.println("Horse Eat's Black Chana");
        }
    }

    static class Dog extends Animal {
        // Overriding eat() function
        void eat() {
            System.out.println("Dog Eat's Meat and Milk .");
        }
    }

    static class Bichu extends Animal {
// If Base Class Don't Override Method of Parent Class then Method of Parent Class is Called.
    }

}
