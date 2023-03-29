package CWH.Chapter05_Loop_Control_Instruction.Practice;

public class Ch05_Ex01_While_Loops {
    public static void main(String[] args) {

        // Checks the condition & executes the code
        int i=1;
        while (i<=3){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish running while loop!");


        // Quick Quiz : Write a program to print natural numbers from 100 to 200.
        i = 100;
        while (i<=200){
            System.out.println(i);
            i++;
        }

        /*
        while (true){
            System.out.println("infinite while loop");
        }
        */
    }
}
