package CWH.Chapter07_Methods.PracticeSet;

// Question 8 : Repeat Que02 using Recursion

import java.util.Scanner;

public class Ch07_Que08 {
    static void pattern(int n){
        if (n > 0) {
            pattern(n - 1);
            for (int i = 0; i<n ;i++){
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

