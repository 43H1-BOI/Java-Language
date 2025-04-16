package Basics.OOPs_9.Inheritence.Types_Of_Inheritance;


// If we Combine all type of Inheritance ( Single , Multiple , Multi Level ) ,
// then This type of Inheritance is known as Hybrid Inheritance.
public class Hybrid {
    public static void main(String[] args) {
        Animal Golu = new Animal();
        Golu.reproduce();
        Golu.eat();

        System.out.println();
        Fish Goldy = new Fish();
        Goldy.eat();
        Goldy.swim();

        System.out.println();
        Mammal Gold = new Mammal();
        Gold.breath();
        Gold.walk();

        System.out.println();
        Shark Deadly = new Shark();
        Deadly.swim();
        Deadly.hunt();

    }

    // Top Most Parent Class
    static class Animal {
        void eat() {
            System.out.println("Eating...");
        }

        void breath() {
            System.out.println("Breathing...");
        }

        void reproduce() {
            System.out.println("Reproducing...");
        }
    }

    // All these classes are Child Class of Single Parent Class i.e. Animal
    static class Fish extends Animal {
        void swim() {
            System.out.println("Fish is Swimming...");
        }
    }


    static class Mammal extends Animal {
        void walk() {
            System.out.println("Mammal is Walking...");
        }
    }


    static class Bird extends Animal {
        void fly() {
            System.out.println("Bird is Flying...");
        }
    }


    // Shark is a Child Class of Another Child Class i.e. Fish
    static class Shark extends Fish {
        void hunt() {
            System.out.println("Shark is Hunting...");
        }
    }


}
