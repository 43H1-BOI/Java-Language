package Basics.OOPs_9.Classes;

import java.util.Scanner;

public class Employee {

    public static Scanner Sc = new Scanner(System.in);
    private static int salary;
    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName() {
        System.out.print("Enter Employee's Full Name : ");
        name = Sc.nextLine();
    }

    public static void setSalary() {
        System.out.print("Enter Salary of " + name + " : ");
        salary = Sc.nextInt();
    }

    public static int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName();
        e1.setSalary();

        System.out.println("Employee Details :: ");
        System.out.println("Name : " + e1.getName());
        System.out.println("Salary : " + e1.getSalary());

    }
}
