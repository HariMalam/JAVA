package CWH.Chapter07_Methods.PracticeSet;
import java.util.Scanner;

// Question 10 : Repeat Que03 using iterative approach

public class Ch07_Que10 {
    static int sum (int n){
        int sum=0;
        for (int i = 1; i < n; i++){
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
