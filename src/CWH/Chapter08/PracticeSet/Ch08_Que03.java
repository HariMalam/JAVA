package CWH.Chapter08.PracticeSet;

// Question 3 : Create a class square with method to initialize its side, calculating area, perimeter etc.

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Ch08_Que03 {
    public static void main(String[] args) {
        Square obj = new Square();
        obj.side = 10;
        System.out.println("area      : " + obj.area());
        System.out.println("perimeter : " + obj.perimeter());
    }
}
