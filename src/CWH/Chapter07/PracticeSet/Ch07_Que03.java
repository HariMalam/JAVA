package CWH.Chapter07.PracticeSet;
import java.util.Scanner;

// Question 3 : Write a recursive function to calculate sum of first n natural numbers

public class Ch07_Que03 {
    static int sum(int n){
        int sum = 0;
        if(n==1)
        {
            return 1;
        }
        else {
            sum = n + sum(n-1);
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println(sum(n));

    }
}
