package CWH.Chapter11_Abstract_Classes_And_Interfaces.Practice;

abstract class Base {
    public Base() {
        System.out.println("I am Base Constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Derived extends Base {
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
abstract class Derived2 extends Base {
    public void th(){
        System.out.println("I am Good");
    }
}

public class Ch11_Ex01_Abstract {
    public static void main(String[] args) {
        // Derived2 d = new Derived2(): // Throwing an Error
        Derived2 d = new Derived2() {
            @Override
            public void greet() {
                System.out.println("Good Afternoon");
            }
        };

        Derived d1 = new Derived();
    }
}
