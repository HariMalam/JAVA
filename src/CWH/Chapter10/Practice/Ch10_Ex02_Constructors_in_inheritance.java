package CWH.Chapter10.Practice;

class Base1 {
    public int x;
    Base1(){
        System.out.println("I am a Base constructor");
    }
    Base1(int x){
        System.out.println("I am overloaded constructor with value of x as : " + x);
    }
}

class Derived1 extends Base1{
    public int y;
    Derived1(){
        super(0);
        System.out.println("I am a Derived class constructor");
    }
    Derived1(int x,int y) {
        super(x);
        System.out.println("I am overloaded constructor of derived with value of y  as : " + y);

    }
}

class ChildOfDerived extends Derived1 {
    ChildOfDerived(){
        System.out.println("I am a child of Derived Constructor");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of child of derived with value of z as : " + z);
    }
}

public class Ch10_Ex02_Constructors_in_inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Base1 b = new Base1(3);
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(3,4);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(3,4,5);
    }
}
