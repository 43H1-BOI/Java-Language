package Basics.OOPs_9.Classes.Constructors;

import java.util.*;

import static Basics.OOPs_9.Classes.Constructors.Constructors.Sc;
/*
Constructors are Special Member Function which are called when an Object is Created .
They are used to Initialise values to Data Members of Objects.

Types Of Constructor :-
1. Default / Non-Parameterised Constructor
2. Parameterised Constructor
3. Copy Constructor

1. Default / Non-Parameterised Constructor :-
        These do not require any Parameter and uses Default values to initialise object
        and can be created Implicitly by the Compiler Itself if no Default Constructor
        is Given to it.

2. Parameterised Constructor
        These Constructors uses Argument to Initialise Values to Data Members of object.
        We can Give different types of Parameter to the Constructors and this overloading
        of Constructors is known as Constructor Overloading.
        ( This is known as Polymorphism )

3. Copy Constructor
        These are used to Copy Data Members of one Object to Another Object.


Java Garbage Collectors are used to Free up Memory at Runtime
This Concept is not in C++ , Hence we Create Destructors There

*/

public class Constructors {
    static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        Movies m1 = new Movies();
        m1.ShowDetails();
        System.out.println();

        Movies m2 = new Movies("Vikram", 2005, 250, 8.5F);
        m2.ShowDetails();
        System.out.println();

        Movies m3 = new Movies(m1);
        m3.ShowDetails();

    }
}

class Movies {
    String name;
    int releaseYear;
    int budget;
    float imdb;

    // 1. Default / Non-Parameterised Constructor
    Movies() {
        System.out.println("\nEnter Movie Details ");

        System.out.print("Enter Movie Name : ");
        name = Sc.next();
        System.out.print("Enter Release Year : ");
        releaseYear = Sc.nextInt();
        System.out.print("Enter Movie Budget (in Cr.) : ");
        budget = Sc.nextInt();
        System.out.print("Enter Movie's IMDB Rating : ");
        imdb = Sc.nextFloat();

        System.out.println("\nDetails Entered Successfully ! ");
    }

    // 2. Parameterised Constructor
    // Having All Parameters
    Movies(String Name, int Year, int Budget, float Imdb) {
        System.out.println("Parameterised Constructor Called ");
        name = Name;
        releaseYear = Year;
        budget = Budget;
        imdb = Imdb;
    }

    // 3. Copy Constructor
    Movies(Movies M1) {
        System.out.println("Copy Constructor Called ");
        this.name = M1.name;
        this.releaseYear = M1.releaseYear;
        this.budget = M1.budget;
        this.imdb = M1.imdb;
    }


    void ShowDetails() {
        System.out.println("\nShowing Movie's Details ...");
        System.out.println("Movie Name : " + name);
        System.out.println("Release Year : " + releaseYear);
        System.out.println("Movie Budget : " + budget + " Cr.");
        System.out.println("Movie's IMDB Rating : " + imdb);
    }
}