package CWH.Chapter10_Inheritance.Practice;

// Super Class
class phone {
    public void on(){
        System.out.println("Turning on Phone...");
    }
    public void showTime(){
        System.out.println("Time is 8 am");
    }
}

// Sub Class
class smartPhone extends phone{
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
    public void music(){
        System.out.println("Playing music...");
    }
}

public class Ch10_Ex05_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // smartPhone obj = new phone(); // Not Allowed
        phone obj = new smartPhone(); // Allowed
        obj.on(); // Allowed (2) is called (Method of object) --> on of Smartphone
        obj.showTime(); // Allowed (1) is called --> showTime of Phone
        // obj.music();  // Not Allowed
    }
}
