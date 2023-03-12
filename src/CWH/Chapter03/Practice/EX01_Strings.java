package CWH.Chapter03.Practice;
import java.util.Scanner;

public class EX01_Strings {
    public static void main(String[] args) {
        // String name = new String("hari");
        String name = "hari";
        System.out.print("The name is : ");
        System.out.println(name);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("the value of a is %d and value of b is %f\n",a,b);
        System.out.format("the value of a is %d and value of b is %f\n",a,b);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String st = sc.nextLine();
        System.out.print("Your String is : ");
        System.out.println(st);
    }
}
