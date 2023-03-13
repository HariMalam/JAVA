package CWH.Chapter04.PracticeSet;
import java.util.Scanner;

// Question 6 : Write a Java Program to find out the type of website from the url.
//              .com -> Commercial Website
//              .org -> Organization Website
//              .in  -> Indian Website

public class Ch04_Que06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Website url : ");
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("This is an Organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is an Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
        else {
            System.out.println("Please enter valid website url !");
        }
    }
}
