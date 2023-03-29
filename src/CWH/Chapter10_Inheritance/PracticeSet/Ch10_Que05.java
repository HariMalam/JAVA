package CWH.Chapter10_Inheritance.PracticeSet;

// Question 05 : What is the order of constructor execution for the following inheritance hierarchy.

//        Base
//        Derived 1
//        Derived 2

//        Derived 2 Obj = new Derived 2();
//        Which constructor(s) will be executed & in what order ?

class Base {
    public Base() {
        System.out.println("Base Constructor");
    }
}

class Derived1 extends Base {
    public Derived1() {
        System.out.println("Derived1 Constructor");
    }
}

class Derived2 extends Derived1 {
    public Derived2() {
        System.out.println("Derived2 Constructor");
    }
}

public class Ch10_Que05 {
    public static void main(String[] args) {
        Derived2 obj = new Derived2();
    }
}