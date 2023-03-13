package CWH.Chapter03.PracticeSet;

// Question 4 : Write a Java program to detect double and triple spaces in a string.
public class Ch03_Que04 {
    public static void main(String[] args) {
        String myString = "This string contains  double and triple   spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}
