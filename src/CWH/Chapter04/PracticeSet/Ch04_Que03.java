package CWH.Chapter04.PracticeSet;
import java.util.Scanner;

// Question 3 : Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//              income slab     Tax
//              2.5L - 5.0L     5%
//              5.0L - 10.0L    20%
//              Above 10.0L     30%

public class Ch04_Que03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        System.out.print("Enter your income : ");
        float income = sc.nextFloat();
        if(income<=2.5f){
            tax = tax + 0;
        }
        else if (income>2.5f && income <=5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5f && income <=10f){
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income >10f){
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.2f * (10f - 5f);
            tax = tax + 0.3f * (income - 10f);
        }

        System.out.println("The total tax paid by the employee is : " + tax);

    }
}
