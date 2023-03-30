package CWH.Chapter11_Abstract_Classes_And_Interfaces.PracticeSet;

// Question 04: Create a class Telephone with ring(), lift90 and disconnect() methods as abstract methods.
// Create another class SmartTelephone and demonstrate polymorphism

abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone {
    void music(){
        System.out.println("Plying music...");
    }
    void ring(){
        System.out.println("Ringing...");
    }
    void lift(){
        System.out.println("Lifting...");
    }
    void disconnect(){
        System.out.println("Disconnecting...");
    }
}

public class Ch11_Que04 {
    public static void main(String[] args) {
        Telephone tp = new SmartTelephone();
        tp.ring();
        tp.lift();
        tp.disconnect();
        // tp.music(); --> Not Allow
    }
}
