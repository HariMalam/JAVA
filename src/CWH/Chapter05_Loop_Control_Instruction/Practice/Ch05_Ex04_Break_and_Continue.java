package CWH.Chapter05_Loop_Control_Instruction.Practice;

public class Ch05_Ex04_Break_and_Continue {
    public static void main(String[] args) {

        // Break and Continue using loops!

        System.out.println("Break:");
        for (int i = 0;i<5;i++){
            System.out.print(i);
            if(i==2){
                System.out.println(" Breaking the loop!");
                break;
            }
            System.out.println(" Running Loop...");
        }
        System.out.println("Continue Other code...");

        System.out.println("\nContinue:");
        for (int i = 0; i<5; i++){
            if (i==2)
            {
                System.out.println("Skip...");
                continue;
            }
            System.out.print(i);
            System.out.println(" Running Loop...");
        }
        System.out.println("Continue Other code...");
    }
}                