package CWH.Chapter10_Inheritance.PracticeSet;

// Question 02 : Create a class Rectangle and use inheritance to create another class Cuboid. Try to rap it as close to real world scenario as possible

// Question 04 : Create methods for area & volume in Que02. Also create getters and setters
class Rectangle {
    public int length;
    public int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    Rectangle(int l, int w){
        this.length = l;
        this.width = w;
    }

    public double area(){
        return this.length*this.width;
    }
}

class Cuboid extends Rectangle {
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Cuboid(int l, int w, int h){
        super(l,w);
        this.height = h;
    }
    public double volume(){
        return this.length*this.width*this.height;
    }
}

public class Ch10_Que02_Que04 {
    public static void main(String[] args) {
    Cuboid obj = new Cuboid(4,5,6);
        System.out.println(obj.area());
        System.out.println(obj.volume());
    }
}
