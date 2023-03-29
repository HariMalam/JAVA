package CWH.Chapter10_Inheritance.Practice;
class A {
    public void math1(){
        System.out.println("I am method 1 of class A");
    }
    public void math2(){
        System.out.println("I am method 2 of class A");
    }
    public void math3(){
        System.out.println("I am method 3 of class A");
    }
}
class B extends A {
    public void math1(){
        System.out.println("I am method 1 of class B");
    }
    @Override
    public void math2(){
        System.out.println("I am method 2 of class B");
    }
}
public class Ch10_Ex04_Method_Overriding {
    public static void main(String[] args) {
        B b = new B();
        b.math1();
        b.math2();
        b.math3();
    }
}
