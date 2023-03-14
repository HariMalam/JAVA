package CWH.Chapter05.PracticeSet;
import java.util.Scanner;

// Question 6 : Repeat Que05 using while loop

public class Ch05_Que06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();

        int fact = 1;
        int i = n;
        while (i > 0){
            fact = fact*i;
         // fact *= i;
            i--;
        }

        System.out.println("factorial of " + n + " is " + fact);
    }
}
