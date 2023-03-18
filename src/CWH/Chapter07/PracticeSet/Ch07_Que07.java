package CWH.Chapter07.PracticeSet;

// Question 7 : Repeat Que04 using recursion

import java.util.Scanner;

public class Ch07_Que07 {
    static void pattern(int n){
        if (n > 0) {
            for (int i = 0; i<n ;i++){
                System.out.print("* ");
            }
            System.out.println();
            pattern(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
        pattern(n);
    }
}