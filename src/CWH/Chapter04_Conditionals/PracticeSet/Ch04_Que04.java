package CWH.Chapter04_Conditionals.PracticeSet;
import java.util.Scanner;

// Question 4 : Write a java program to find out the day of the week given the number [ 1 for monday, 2 for tuesday,... and so on! ]

public class Ch04_Que04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        byte day = sc.nextByte();

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Enter day between 1 and 7");
        }
    }
}
