package Practice.College;

public class MainEmp {
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
