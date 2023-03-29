package CWH.Chapter09_Accesss_Modifiers_And_Constructors.PracticeSet;

// Question 01 : Create a class cylinder and user getters and setters to set its radius and height.

class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class Ch09_Que01 {
    public static void main(String[] args) {
        cylinder myCylinder = new cylinder();
        myCylinder.setHeight(12);
        myCylinder.setRadius(5);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
    }
}