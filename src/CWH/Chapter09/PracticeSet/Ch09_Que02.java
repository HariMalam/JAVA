package CWH.Chapter09.PracticeSet;

// Question 02 : Use Que01 to calculate surface area and volume of the cylinder

class cylinder1{
    private int height;
    private int radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
public class Ch09_Que02 {
    public static void main(String[] args) {

        cylinder1 myCylinder1 = new cylinder1();
        myCylinder1.setHeight(12);
        myCylinder1.setRadius(9);
        System.out.println(myCylinder1.surfaceArea());
        System.out.println(myCylinder1.volume());
    }
}
