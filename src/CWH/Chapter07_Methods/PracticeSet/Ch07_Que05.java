package CWH.Chapter07_Methods.PracticeSet;
import java.util.Scanner;

// Question 5 : Write a function to print nth term of fibonacci series using recursion

public class Ch07_Que05 {
    static int fibonacci (int n){
        if (n==1 || n==2){
//            System.out.format("%d ",n-1);
            return n-1;
        }
        else {
//            System.out.format("%d ",fibonacci(n-1)+fibonacci(n-2));
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.format("%dth term of fibonacci series %d",n,fibonacci(n));
        System.out.print("\nfibonacci series : ");
        for (int i=1 ; i<=n; i++){
            System.out.print(fibonacci(i)+ " ");
        }
    }
}
