package CWH.Chapter11_Abstract_Classes_And_Interfaces.Practice;

interface camera2 {
    void takeSnap();
    void recordVideo();

    // method can't use in implement class but can be used in this current class
    private void greet(){
        System.out.println("Good Morning");
    }

    // method can be overwritten in implement class
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface wifi2 {
    String [] getNetwork();
    void ConnectToNetwork(String network);
}
class MyCellPhone2 {
    void callNumber (int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickNumber () {
        System.out.println("Connecting...");
    }
}

class smartPhone2 extends MyCellPhone2 implements wifi2,camera2 {
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String [] getNetwork(){
        String [] networkList = {"Hari","Deep","Tirth"};
        return networkList;
    }
    public void ConnectToNetwork(String Network){
        System.out.println("Connecting to " + Network);
    }
}
public class Ch11_Ex05_Polymorphism {
    public static void main(String[] args) {
        camera2 cam2 = new smartPhone2(); // This is a Smartphone but, must be use it as a camera.
        cam2.takeSnap();
        cam2.recordVideo();
        cam2.record4KVideo();
        // cam2.getNetwork(); --> Not Allowed
    }
}
