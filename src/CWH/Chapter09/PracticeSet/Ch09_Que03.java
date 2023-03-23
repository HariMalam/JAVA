package CWH.Chapter09.PracticeSet;

// Question 03 : Use a constructor and repeat Que01

class cylinder2{
    private int radius;
    private int height;

    public cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public int getRadius() {
        return radius;
    }
}
public class Ch09_Que03 {
    public static void main(String[] args) {
        cylinder2 myCylinder = new cylinder2(9,12);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
    }
}