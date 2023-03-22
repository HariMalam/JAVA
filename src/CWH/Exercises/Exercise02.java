package CWH.Exercises;
import java.util.Random;
import java.util.Scanner;

// Exercise 02 : Write a java program to make a stone paper scissors game

public class Exercise02 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int youWin=0;
        int comWin=0;
        int i;

        for (i = 1; true ; i ++){
            int com = rand.nextInt(1,4);
            System.out.println("\n[1] Stone [2] Paper [3] Scissors [4] Exit");
            System.out.print("Your Choice : ");
            boolean bool = sc.hasNextInt();
            int you = sc.nextInt();
            if (you>0 && you<4) {
                System.out.println("Round : " + i);
                if (com == you) {
                    System.out.print("[Draw]");
                    youWin++;
                    comWin++;
                } else if (you == 1 && com == 3 || you == 2 && com == 1 || you == 3 && com == 2) {
                    System.out.print("[You win round this round]");
                    youWin++;
                } else {
                    System.out.print("[Computer win round this round]");
                    comWin++;
                }
            }
            else if(you == 4){
                    break;
                }
            else {
                System.out.println("Please Select valid Option !");
                i--;
                continue;
            }
            System.out.print("\nComputer Choice : ");
            if (com==1){
                System.out.println("Stone");
            }
            else if(com == 2){
                System.out.println("Paper");
            }
            else {
                System.out.println("Scissor");
            }
            System.out.format("Score[you-com] : %d - %d\n",youWin,comWin);
        }

        System.out.println("\nTotal Rounds : " + (i-1));
        System.out.format("Score[you-com] : %d - %d\n",youWin,comWin);

        if (youWin==comWin){
            System.out.println("Nice, Draw this game !");
        }
        else if (youWin>comWin){
            System.out.println("Congratulation, you win this game !");
        }
        else {
            System.out.println("Sorry, Computer win this game !");
        }
    }
}
