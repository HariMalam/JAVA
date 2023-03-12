package CWH.Chapter01.PracticeSet;
import java.util.Scanner;

// Questions 4 : Write a Java program to convert kilometers to miles
public class Que04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of Kilometers : ");
        float km = sc.nextFloat();
        float miles = km * 0.62137119f;
        System.out.println(km + "km = " + miles + "miles");
    }
}