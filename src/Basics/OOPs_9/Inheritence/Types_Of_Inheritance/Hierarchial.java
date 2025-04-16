package Basics.OOPs_9.Inheritence.Types_Of_Inheritance;

public class Hierarchial {
    public static void main(String[] args) {
        Fish Goldy = new Fish();
        Goldy.eat();
        Goldy.swim();

        System.out.println();
        Mammal Gold = new Mammal();
        Gold.breath();
        Gold.walk();

        System.out.println();
        Bird Golu = new Bird();
        Golu.reproduce();
        Golu.fly();

    }

    // Single Parent Class
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

}