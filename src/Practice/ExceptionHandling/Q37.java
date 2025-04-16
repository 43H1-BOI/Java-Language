package Practice.ExceptionHandling;

import java.util.*;

class Employee {
    private String fName;
    private String lName;
    private double monthlySal;

    // constructor
    Employee(String firstN, String lastN, double monSal) {
        fName = firstN;
        lName = lastN;
        monthlySal = monSal;
    }

    // get function
    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public double getMonthlySalary() {
        return monthlySal;
    }

    public double calYearlySal() {
        return monthlySal * 12;
    }

    // Increment Salary by given percent
    public double raiseSal(int percent) {
        return ((monthlySal * percent) + monthlySal);
    }

    public void getData() {
        System.out.println("Employee Details : ");
        System.out.println("Name : ");
        System.out.println("Monthly Salary : ");
        System.out.println("Yearly Salary : ");
    }

}

class Main {
    public static void main(String[] args) {
        Employee Dhairya = new Employee("Dhairya", "Joshi", 900000);
        Employee Divya = new Employee("Divya", "Sharma", 10000000);

        Dhairya.getData();
        System.out.println();
        Divya.getData();
    }
}