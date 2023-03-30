package CWH.Chapter11_Abstract_Classes_And_Interfaces.Practice;

interface Bicycle {
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle {
    int x = 45;
    void blowHornK3g();
    void blowHorn5gn();
}

class AvonCycle implements Bicycle,HornBicycle {
    public int x = 40;
    public void blowHornK3g(){
        System.out.println("Pee Pee pee");
    }
    public void blowHorn5gn(){
        System.out.println("Poo Poo Poo");
    }
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
    }
}

public class Ch11_Ex02_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHari = new AvonCycle();
        cycleHari.applyBrake(1);
        cycleHari.speedUp(1);
        cycleHari.blowHorn5gn();
        cycleHari.blowHornK3g();
        // You can Create properties in interfaces
        System.out.println(cycleHari.a);
        System.out.println(cycleHari.x);
        // you cannot modify the properties in interfaces as they are final
        // cycleHari.a = 40;
    }
}
