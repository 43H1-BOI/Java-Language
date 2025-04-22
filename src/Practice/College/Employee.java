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

class MainEmp {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.displayInfo();
        E1.yearlySalary();
        E1.raisedSal(20);

        Employee E2 = new Employee(3142, 12000);
        E2.displayInfo();
        E2.yearlySalary();
        E2.raisedSal(10);
    }
}

public class Employee {
    /*
    public static void main(String[] args){
        Employee Abhi = new Employee(1243,12000.20);
        Employee Anu = new Employee(1133,15000);
        Employee Tushar = new Employee();

        Abhi.yearlySalary();
        Anu.yearlySalary();
        Tushar.yearlySalary();

        Abhi.displayInfo();
        Anu.displayInfo();
        Tushar.displayInfo();

        Abhi.raisedSal(10);
        Anu.raisedSal(10);
        Tushar.raisedSal(20);
    }
    */
    private final int EmpNo;
    Scanner Sc = new Scanner(System.in);
    private double MonthlySal;
//    private double YearlySal;

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
//        YearlySal = (MonthlySal * 12);
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
        MonthlySal += (MonthlySal * percent);
        displayInfo();
    }
}
