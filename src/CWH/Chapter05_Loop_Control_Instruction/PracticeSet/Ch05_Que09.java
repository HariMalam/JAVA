package CWH.Chapter05_Loop_Control_Instruction.PracticeSet;

// Question 9 : Write a Java Program to calculate the sum of the number occurring in the multiplication table of 8.

public class Ch05_Que09 {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        for (int i = 1; i<=10 ; i++){
            sum += n*i;
        }
        System.out.println("Sum = "+sum);
    }
}
