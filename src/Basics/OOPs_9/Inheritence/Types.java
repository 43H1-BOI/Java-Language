package Basics.OOPs_9.Inheritence;

public class Types {
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
}

class Animal {
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

class Fish extends Animal {
    void swim() {
        System.out.println("Fish is Swimming...");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is Walking...");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird is Flying...");
    }
}

