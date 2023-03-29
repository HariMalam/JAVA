package CWH.Chapter04_Conditionals.PracticeSet;
import java.util.Scanner;


// Question 2 : Write a java program to find out whether a student is pass or fail;
//              if it requires total 40% and at least 33% in each subject to pass.
//              Assume 3 subjects and take marks as an input from the user.

public class Ch04_Que02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte m1,m2,m3;

        System.out.print("Enter your marks in Physics   : ");
        m1 = sc.nextByte();
        System.out.print("Enter your marks in Chemistry : ");
        m2 = sc.nextByte();
        System.out.print("Enter your marks in Maths     : ");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3f;

        System.out.println("your overall percentage is : " + avg + "%");

        if(avg>= 40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You have been promoted");
        }
        else {
            System.out.println("Sorry, You have not been promoted ! Please try again.");
        }
    }
}
