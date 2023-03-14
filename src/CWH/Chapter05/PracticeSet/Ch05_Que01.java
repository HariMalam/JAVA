package CWH.Chapter05.PracticeSet;
import java.util.Scanner;

// Question 1 : Write a java Program to print the following pattern.
//              * * * * *
//              * * * *
//              * * *
//              * *
//              *

public class Ch05_Que01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = n; j > i; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
