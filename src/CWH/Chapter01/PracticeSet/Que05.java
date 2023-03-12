package CWH.Chapter01.PracticeSet;
import java.util.Scanner;

// Questions 5 : Write a Java Program to detect whether a number entered by the user is integer or not.
public class Que05 {
    public static void main(String[] args) {
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
