package CWH.Chapter05_Loop_Control_Instruction.PracticeSet;
import java.util.Scanner;

// Question 4 : Write a Java program to print multiplication table of 10 in reverse order.

public class Ch05_Que04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();

        for (int i = 10 ; i >= 1 ; i--){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
