package CWH.Chapter04.Practice;

import java.util.Scanner;

public class Ch04_Ex03_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        if (marks > 80) {
            System.out.println("Your Grade : A");
        } else if (marks > 60) {
            System.out.println("Your Grade : B");
        } else if (marks > 40) {
            System.out.println("Your Grade : C");
        } else if (marks > 30) {
            System.out.println("Your Grade : D");
        } else {
            System.out.println("Fail");
        }
    }
}
