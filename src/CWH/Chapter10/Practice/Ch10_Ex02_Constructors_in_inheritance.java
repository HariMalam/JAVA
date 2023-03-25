package CWH.Chapter10.Practice;

class Base1 {
    public int x;
    Base1(){
        System.out.println("I am a Base constructor");
    }
}

class Derived1 extends Base1{
    public int y;
    Derived1(){
        System.out.println("I am a Derived class constructor");
    }
}
public class Ch10_Ex02_Constructors_in_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1();
    }
}
