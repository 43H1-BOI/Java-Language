package Practice.College;

/*
4. Create a class called Employee that includes these instance variables
	- EmpNo
	- MonthlySal
	- Employee() {Constructor}
	- yearlySalary() {Display each employees annual salary}
	- raisedSalary() {Give each employee 10% raise and display each Employee's increased salary} using method

    Objects of Employee Class - 2
*/

import java.util.Scanner;

public class Employee {
    Scanner Sc = new Scanner(System.in);
    private int EmpNo;
    private double MonthlySal;
    private double YearlySal;

    Employee(int empNo, double monthlySalary) { // Parameterized Constructor
        EmpNo = empNo;
        MonthlySal = monthlySalary;
//        YearlySal = (MonthlySal * 12);
    }

    Employee() { //  Default Constructor
        System.out.print("Enter Employee No : ");
        EmpNo = Sc.nextInt();

        System.out.print("Enter Monthly Salary of (Emp" + EmpNo + ") : ");
        MonthlySal = Sc.nextInt();

        YearlySal = (MonthlySal * 12);
    }

    void yearlySalary() {
        System.out.println("Yearly Salary of (Emp" + EmpNo + ") = " + (MonthlySal * 12));
    }

    void displayInfo() {
        System.out.println("\nEmployee No. : " + EmpNo);
        System.out.println("Monthly Salary : " + MonthlySal);
    }

    void raisedSal(double percent) {
        percent /= 100;
        System.out.println("Percent = " + percent);
        MonthlySal += (MonthlySal * percent);
        System.out.println("Monthly Sal * Percent = " + (MonthlySal * percent));
        displayInfo();
    }
}
