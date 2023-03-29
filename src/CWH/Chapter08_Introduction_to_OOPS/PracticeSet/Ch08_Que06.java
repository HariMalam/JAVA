package CWH.Chapter08_Introduction_to_OOPS.PracticeSet;

// Question 6 : Repeat Que04 for a circle

class Circle{
    int radius;
    public float area(){
        return (3.13f*radius*radius);
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }
}
public class Ch08_Que06 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.radius = 10;
        System.out.println("area      : " + obj.area());
        System.out.println("perimeter : " + obj.perimeter());
    }
}
