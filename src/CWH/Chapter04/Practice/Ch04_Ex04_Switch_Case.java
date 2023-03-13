package CWH.Chapter04.Practice;
import java.util.Scanner;

public class Ch04_Ex04_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        switch (age) {
            case 18 -> {
                System.out.println("You are going to become an Adult !");
                System.out.println("Amazing");
            }
            case 23 -> System.out.println("You are going to join a Job !");
            case 68 -> System.out.println("You are going to get Retired !");
            default -> System.out.println("Enjoy you life !");

//            case 18 :
//                System.out.println("You are going to become an Adult !");
//                System.out.println("Amazing");

//                break;
//            case 23 :
//                System.out.println("You are going to join a Job !");
//                break;
//            case 68 :
//                System.out.println("You are going to get Retired !");
//                break;
//            default:
//                System.out.println("Enjoy you life !");

        }
    }
}
