package CWH.Chapter11_Abstract_Classes_And_Interfaces.Practice.PracticeSet;

abstract class pen {
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen {
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refilling...");
    }

    void changeNib() {
        System.out.println("Changing the Nib...");
    }
}
public class Ch11_Que01 {
    public static void main(String[] args) {
        FountainPen myPen = new FountainPen();
        myPen.write();
        myPen.refill();
        myPen.changeNib();
    }
}
