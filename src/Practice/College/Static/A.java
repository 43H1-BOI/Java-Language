package Practice.College.Static;

class A {

    static int a = 10;
    int b = 20;

    public static void main(String[] args) {
        // To Call/Use static members , no need to instantiate object of class
        A.showA();
        System.out.println(A.a);

        // Must instantiate object to use non-static members
        A x = new A();
        x.showB();
        System.out.println(x.b);
    }

    static void showA() {
        // these can only access static members
        System.out.println("Static Method :  " + a);
    }

    void showB() {
        // these can access both static and non-static members
        System.out.println("Non - Static Method :  " + a + " " + b);
    }
}