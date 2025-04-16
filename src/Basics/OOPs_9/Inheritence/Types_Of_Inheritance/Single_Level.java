package Basics.OOPs_9.Inheritence.Types_Of_Inheritance;

public class Single_Level {
    public static void main(String[] args) {
        Human Me = new Human();

        Me.name = "Abhishek";
        Me.age = 19;
        Me.Hum = TypeOfHuman.Good;
        Me.foodType = "Herbivorous";
        Me.nationality = "Indian";
        Me.Details();

        System.out.println();
        Me.Born();
        Me.Eat();
        Me.Reproduce();
        Me.Died();

    }


    enum TypeOfHuman {
        Good,
        Bad,
    }

    static class Living_Beings {
        String name;
        String foodType;
        int age;

        void Born() {
            System.out.println(name + " : The Beginning...");
        }

        void Eat() {
            System.out.println(name + " is Eating...");
        }

        void Reproduce() {
            System.out.println(name + " is Reproducing...");
        }

        void Died() {
            System.out.println(name + " : The Conclusion...");
        }

        void Details() {
            System.out.println("Name : " + name);
            System.out.println("Food Type : " + foodType);
            System.out.println("Age : " + age);
        }

    }

    static class Human extends Living_Beings {
        String nationality;
        TypeOfHuman Hum;

        void Details() {
            System.out.println("Name : " + name);
            System.out.println("Food Type : " + foodType);
            System.out.println("Age : " + age);
            System.out.println("Nationality : " + nationality);
            System.out.println("Type Of Human : " + Hum);
        }
    }
}
