package CWH.Chapter01.Practice;
import java.util.Scanner;
public class EX03_TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();

        System.out.print("Enter Number 2 : ");
        // int b = sc.nextInt();
        float b = sc.nextFloat();

        // int sum = a + b;
        float sum = a + b;

        System.out.print("The sum of a and b is ");
        System.out.println(sum);

        System.out.print("Enter String : ");
        String str = sc.next();
        System.out.println(str);

        String  newline = sc.nextLine();
        System.out.println(newline);

        System.out.print("Enter String : ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}




