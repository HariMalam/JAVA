package CWH.Chapter05_Loop_Control_Instruction.PracticeSet;
import java.util.Scanner;

// Question 5 : Write a Java program to find factorial of a given number using for loop

public class Ch05_Que05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = n; i > 0 ; i--){
            fact = fact*i;
        }

        System.out.println("factorial of " + n + " is " + fact);
    }
}
