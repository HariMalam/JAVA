package CWH.Chapter10_Inheritance.PracticeSet;

// Question 01 : Create a class circle and use inheritance to create another class cylinder from it.

// Question 03 : Create methods for area and volume in Que01

class circle{
    public int radius;
    circle(){
        System.out.println("Circle Non parameterized constructor");
    }
    circle (int r){
        System.out.println("Circle Parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class cylinder extends circle{
    public int height;

    cylinder(int r,int h){
         super(r);
        this.height = h;
        System.out.println("Cylinder Parameterized constructor");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class Ch10_Que01_Que03 {
    public static void main(String[] args) {
        // circle objc = new circle(6);
        cylinder obj = new cylinder(12,4);
    }
}