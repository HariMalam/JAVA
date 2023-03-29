package CWH.Chapter05_Loop_Control_Instruction.PracticeSet;
import java.util.Scanner;

// Question 7 : Repeat 1 using for/while loop

public class Ch05_Que07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
        int i = 0;
        while ( i < n ){
            for (int j = n; j > i; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
            i++;
        }
    }
}
