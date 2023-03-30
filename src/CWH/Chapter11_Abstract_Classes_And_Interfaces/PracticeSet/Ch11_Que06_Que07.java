package CWH.Chapter11_Abstract_Classes_And_Interfaces.PracticeSet;

// Question 06: Create an interface TVRemote and use it inherit another interface SmartTVRemote
// Question 07: Create a class TV which implements TVRemote interface from Que06

interface TVRemote {
    void play();
    void pause();
    void forward();
    void reverse();
}
interface SmartTVRemote extends TVRemote {
    void GoogleAssistance();
}

class TV implements TVRemote {
    public void play(){
        System.out.println("play");
    }
    public void pause(){
        System.out.println("Pause");
    }
    public void forward(){
        System.out.println("Forward");
    }
    public void reverse(){
        System.out.println("reverse");
    }
}
public class Ch11_Que06_Que07 {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.play();
    }
}
