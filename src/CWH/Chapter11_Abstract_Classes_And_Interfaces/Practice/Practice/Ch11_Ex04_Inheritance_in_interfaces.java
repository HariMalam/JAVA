package CWH.Chapter11_Abstract_Classes_And_Interfaces.Practice;

interface sampleInterface {
    void math1();
    void math2();
}
interface childSampleInterface extends sampleInterface {
    void math3();
    void math4();
}
class mySampleClass implements childSampleInterface {
    public void math3(){
        System.out.println("Math3");
    }
    public void math4(){
        System.out.println("Math4");
    }
    public void math1(){
        System.out.println("Math1");
    }
    public void math2(){
        System.out.println("Math2");
    }
}
public class Ch11_Ex04_Inheritance_in_interfaces {
    public static void main(String[] args) {
        mySampleClass sc = new mySampleClass();
        sc.math1();
        sc.math2();
        sc.math3();
        sc.math4();
    }
}
