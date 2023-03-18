package CWH.Chapter07.PracticeSet;
import java.util.Scanner;

// Question 1 : Write a Java method to print multiplication table of a number n

public class Ch07_Que01 {
    static void multiplicationTable(int n){
        for (int i =1 ; i<=10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        multiplicationTable(n);
    }
}
