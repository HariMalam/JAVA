package CWH.Chapter11_Abstract_Classes_And_Interfaces.PracticeSet;

// Question 01: Create an abstract class pen with method write() and refill() as abstract methods
// Question 02: Use the pen class from Que01 to create a concrete class fountainPen with additional method changeNib()

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
public class Ch11_Que01_Que02 {
    public static void main(String[] args) {
        FountainPen myPen = new FountainPen();
        myPen.write();
        myPen.refill();
        myPen.changeNib();
    }
}
