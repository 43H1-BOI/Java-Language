package Basics.OOPs_9.Inheritence.Types_Of_Inheritance;

public class Multi_Level {

    public static void main(String[] args) {
        Animal Golu = new Animal();
        Golu.reproduce();
        Golu.eat();

        System.out.println();
        Fish Goldy = new Fish();
        Goldy.eat();
        Goldy.swim();

        System.out.println();
        Shark Deadly = new Shark();
        Deadly.swim();
        Deadly.hunt();

    }


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

    // Fish is a Child Class of Single Parent Class i.e. Animal
    static class Fish extends Animal {
        void swim() {
            System.out.println("Fish is Swimming...");
        }
    }

    // Shark is a Child Class of Another Child Class i.e Fish
    static class Shark extends Fish {
        void hunt() {
            System.out.println("Shark is Hunting...");
        }
    }

}