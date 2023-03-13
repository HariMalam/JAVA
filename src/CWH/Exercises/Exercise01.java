package CWH.Exercises;
import java.util.Scanner;

// Exercise 1.1 : Write  a program to calculate percentage of a given student in CBSE bord exam.
// His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Subject 1 Marks: ");
        float sub1 = sc.nextFloat();

        System.out.print("Subject 2 Marks: ");
        float sub2 = sc.nextFloat();

        System.out.print("Subject 3 Marks: ");
        float sub3 = sc.nextFloat();

        System.out.print("Subject 4 Marks: ");
        float sub4 = sc.nextFloat();

        System.out.print("Subject 5 Marks: ");
        float sub5 = sc.nextFloat();

        float percentage = (sub1 + sub2 + sub3 + sub4 + sub5) * 100 / 500;
        System.out.println("Percentage of a given Student in CBSE bord Exam: ");
        System.out.print(percentage);
    }
}
