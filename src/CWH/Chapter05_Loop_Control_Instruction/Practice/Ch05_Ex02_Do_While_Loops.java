package CWH.Chapter05_Loop_Control_Instruction.Practice;
import java.util.Scanner;
public class Ch05_Ex02_Do_While_Loops {
    public static void main(String[] args) {

        // Executes the code & then checks the condition.
        // That it is guaranteed to execute at least once.
        int b = 0;
        do {
            System.out.println(b);
            b++;
        }while (b<5); // Note this semicolon

        Scanner sc = new Scanner(System.in);

        // Quick Quiz : Write a program to print first n natural numbers using do-while loop
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i<=n);
    }
}
