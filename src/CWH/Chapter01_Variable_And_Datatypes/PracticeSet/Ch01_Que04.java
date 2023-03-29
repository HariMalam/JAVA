package CWH.Chapter01_Variable_And_Datatypes.PracticeSet;
import java.util.Scanner;

// Ch01_Questions 04 : Write a Java program to convert kilometers to miles

public class Ch01_Que04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of Kilometers : ");
        float km = sc.nextFloat();
        float miles = km * 0.62137119f;
        System.out.println(km + "km = " + miles + "miles");
    }
}