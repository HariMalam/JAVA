package CWH.Chapter07.PracticeSet;
import java.util.Scanner;

// Question 2 : Write a Java program using functions to print the following pattern :
// *
// * *
// * * *
// * * * *

public class Ch07_Que02 {
    static void pattern(int n){
        for (int i=0; i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
        pattern(n);
    }
}
