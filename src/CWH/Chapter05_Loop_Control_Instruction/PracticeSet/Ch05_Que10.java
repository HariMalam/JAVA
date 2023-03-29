package CWH.Chapter05_Loop_Control_Instruction.PracticeSet;

// Question 10 : do while loop is executed :
//               At least once
//               At least twice
//               At most once

public class Ch05_Que10 {
    public static void main(String[] args) {
        int n = 200;
        int i = 1;
        do {
            System.out.println("Do-While Loop Executes "+i+" times");
            i++;
        }while (i>n);

        System.out.println("Answer is do while loop is executed At Least Once");
    }
}
