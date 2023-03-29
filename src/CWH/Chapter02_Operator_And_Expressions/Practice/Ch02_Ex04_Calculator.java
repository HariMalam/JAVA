package CWH.Chapter02_Operator_And_Expressions.Practice;

import java.util.Scanner;
public class Ch02_Ex04_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value of a : ");
        float a = sc.nextFloat();

        System.out.print("Enter Value of b : ");
        float b = sc.nextFloat();

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "*" + b + "=" + (a*b));
        System.out.println(a + "/" + b + "=" + (a/b));
    }
}