package CWH.Chapter09_Accesss_Modifiers_And_Constructors.PracticeSet;

// Question 04 : Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class Ch09_Que04 {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        System.out.println(myRectangle.getBreadth());
        System.out.println(myRectangle.getLength());
        Rectangle myRectangle2 = new Rectangle(10,20);
        System.out.println(myRectangle2.getLength());
        System.out.println(myRectangle2.getBreadth());
    }
}
