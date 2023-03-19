package CWH.Chapter08.PracticeSet;

// Question 4 : Create a class Rectangle & repeat Que03

class Rectangle{
    int width;
    int height;
    public int area(){
        return width*height;
    }
    public int perimeter(){
        return 2*(width+height);
    }
}
public class Ch08_Que04 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.width = 10;
        obj.height = 5;
        System.out.println("area      : " + obj.area());
        System.out.println("perimeter : " + obj.perimeter());
    }
}
