package CWH.Chapter06.PracticeSet;
import java.util.Scanner;

// Question 2 : Write a Java program to find out whether given integer is present in an array or not

public class Ch06_Que02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] marks = {45,56,78,46,78};
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        boolean isInArray = false;

        for (float element : marks )
        {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("the value is present in the array");
        }
        else {
            System.out.println("the value is not present in the array");
        }

    }
}
