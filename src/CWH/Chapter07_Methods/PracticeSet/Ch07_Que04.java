package CWH.Chapter07_Methods.PracticeSet;
import java.util.Scanner;

// Question 4 : Write a function to print the following pattern :
// * * * *
// * * *
// * *
// *

public class Ch07_Que04 {
    static void pattern(int n){
        for (int i=0; i<n;i++){
            for (int j=0;j<n-i;j++){
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
