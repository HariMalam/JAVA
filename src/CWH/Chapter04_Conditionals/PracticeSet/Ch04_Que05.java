package CWH.Chapter04_Conditionals.PracticeSet;
import java.util.Scanner;

//Question 5 : Write a Java program to find whether a year entered by the user is a leap year or not

public class Ch04_Que05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap year");
        }
    }
}
