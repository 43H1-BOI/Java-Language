package Basics.OOPs_9.Abstraction.Interface;
/*
Class is blueprint of Object.

Interface is a Blueprint of a Class
It is used to perform Multiple Inheritance
It helps in achieving Total Abstraction.

Basic Properties :-
* Defined by "interface" keyword
* To inherit we use implement keyword whereas we use extends keyword during inheritance
* Variable in the interface are final , public and static
* Used to achieve total Inheritance


*/


public class InterfaceEx_1 {
    interface House {

        // To get carpet Area of any house
        void carpetArea();

        // To get number of floors
        void floor();

        // To get no of Rooms
        void rooms();
    }

    static class Bungalow implements House {
        public void carpetArea() {
            System.out.println("Carpet Area of Bungalow House is 2,000 square feet.");
        }

        public void floor() {
            System.out.println("There are 2 Floor in a Bungalow House.");
        }

        public void rooms() {
            System.out.println("There are total 16 Rooms in a Bungalow House.");
        }
    }

    static class PentHouse implements House {
        public void carpetArea() {
            System.out.println("Carpet Area of Pent House is 1,000 square feet.");
        }

        public void floor() {
            System.out.println("There are 4 Floors in a Pent House.");
        }

        public void rooms() {
            System.out.println("There are total 7 Rooms in a Pent House.");
        }
    }


    public static void main(String[] args) {
        PentHouse ShantiNagar = new PentHouse();
        ShantiNagar.carpetArea();
        ShantiNagar.floor();
        ShantiNagar.rooms();

        System.out.println();

        Bungalow NyayNagar = new Bungalow();
        NyayNagar.carpetArea();
        NyayNagar.floor();
        NyayNagar.rooms();
    }
}
