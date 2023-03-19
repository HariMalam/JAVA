package CWH.Chapter08.PracticeSet;

// Question 2 : Create a class cellphone with methods to print
// "ringing...", "vibrating..." etc.

class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling deep...");
    }
}
public class Ch08_Que02 {
    public static void main(String[] args) {
        cellPhone asus = new cellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();
    }
}
