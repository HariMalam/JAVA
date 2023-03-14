package CWH.Chapter01.PracticeSet;
import java.util.Scanner;

// Ch01_Questions 03 : Write a Java program which asks the user to enter his/her Name and Grades them which "Hello <Name>, have a good day" text.
public class Ch01_Que03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.next();
        System.out.println("Hello " + name + ", have a good day");
    }
}