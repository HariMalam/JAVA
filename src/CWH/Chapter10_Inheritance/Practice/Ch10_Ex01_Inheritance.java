package CWH.Chapter10_Inheritance.Practice;

class Base{
    public int x;

    public int getX() {
        System.out.print("Base    : Returning x -> ");
        return x;
    }

    public void setX(int x) {
        System.out.println("Base    : Setting   x =  " + x);
        this.x = x;
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        System.out.print("Derived : Returning y -> ");
        return y;
    }

    public void setY(int y) {
        System.out.println("Derived : Setting   y =  " + y);
        this.y = y;
    }
}

public class Ch10_Ex01_Inheritance {
    public static void main(String[] args) {

        // Create an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an Object of derived class
        Derived d = new Derived();
        d.setY(6);
        System.out.println(d.getY());
        d.setX(10);
        System.out.println(d.getX());
    }

}
