package Basics.OOPs_9.Classes;

public class Cellphone {

    public static void main(String[] args) {
        Cell Oppo = new Cell();
        Oppo.Ring();
        Oppo.Vibrate();
    }
}

class Cell {
    public static void Ring() {
        System.out.println("Ringing...");
    }

    public static void Vibrate() {
        System.out.println("Vibrating...");
    }
}