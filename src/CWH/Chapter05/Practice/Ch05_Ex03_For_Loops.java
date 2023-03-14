package CWH.Chapter05.Practice;
import java.util.Scanner;

public class Ch05_Ex03_For_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter value of n : ");
        int n = sc.nextInt();

        // Quick Quiz : Write a program to print first n odd numbers using a for loop.

        System.out.println("First " + n + " odd numbers");
        for (int i = 0; i < n; i++){
            System.out.println(2*i+1);
        }

        // Quick Quiz : Write a program to print first n natural numbers in reverse order

        System.out.println("\nFirst" + n + "natural numbers in reverse order");
        for (int i = n; i > 0; i--){
            System.out.println(i);
        }
    }
}
