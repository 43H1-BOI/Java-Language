package Basics.Questions.CodingNinja;
/*
Create a class named Person with a string variable 'name' and an integer variable 'age,'
such that these variables are not accessible outside the class and implement a
way to initialize the variables and print the variables.
    Functions:
1.setValue- that sets the variables value.
2.getValue- that prints the variables value.
*/
import java.util.* ;

class Person {
    private String name;
    private int age;

    public Person (){
        name = "noName";
        age = 0;
    }

    public Person setValue(){
        Scanner Sc = new Scanner(System.in);
        name = Sc.next();
        age = Sc.nextInt();
        return this;
    }

    public void  getValue(){
        System.out.println("The name of the person is " + name + " and the age is " + age + ".");
    }

}

class P2_C1_CN {
    public static void main(String args[]) {
        Person P = new Person().setValue();
        P.getValue();
    }
}
