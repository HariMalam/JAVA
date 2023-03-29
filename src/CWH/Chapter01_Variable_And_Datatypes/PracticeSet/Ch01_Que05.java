package CWH.Chapter01_Variable_And_Datatypes.PracticeSet;
import java.util.Scanner;

// Questions 05 : Write a Java Program to detect whether a number entered by the user is integer or not.

public class Ch01_Que05 {
    public static void main(String[] args) {
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
