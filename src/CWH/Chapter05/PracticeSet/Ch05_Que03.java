package CWH.Chapter05.PracticeSet;
import java.util.Scanner;

//Question 3 : Write a java program to print multiplication table of a given number n

public class Ch05_Que03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
