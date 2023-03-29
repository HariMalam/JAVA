package CWH.Chapter02_Operator_And_Expressions.PracticeSet;
import java.util.Scanner;

// Question 3: Use comparison operators to find out whether a given number is greater than the user entered number or not.

public class Ch02_Que03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.println(a>8);
    }
}
