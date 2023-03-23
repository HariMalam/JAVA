package CWH.Chapter09.PracticeSet;

// Question 05 : Repeat Que01 for a sphere
class Sphere{
    private int radius;

    public Sphere() {
        this.radius = 5;
    }
    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4/3f) * Math.PI * radius * radius * radius;
    }
}

public class Ch09_Que05 {
    public static void main(String[] args) {
        Sphere mySphere = new Sphere();
        System.out.println(mySphere.getRadius());
        System.out.println(mySphere.surfaceArea());
        System.out.println(mySphere.volume());
    }
}
