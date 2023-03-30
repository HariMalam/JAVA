package CWH.Chapter11_Abstract_Classes_And_Interfaces.Practice;

interface camera {
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
interface wifi {
    String [] getNetwork();
    void ConnectToNetwork(String network);
}
class MyCellPhone {
    void callNumber (int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickNumber () {
        System.out.println("Connecting...");
    }
}

class smartPhone extends MyCellPhone implements wifi,camera {
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
public class Ch11_Ex03_Default_Methods {
    public static void main(String[] args) {
        smartPhone ms = new smartPhone();
        // ms.greet(); --> Throws an Error
        ms.record4KVideo();
        String [] arr = ms.getNetwork();
        for (String item : arr) {
            System.out.println(item);
        }
    }
}