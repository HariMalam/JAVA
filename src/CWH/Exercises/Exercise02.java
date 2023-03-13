package CWH.Exercises;
import java.util.Random;
import java.util.Scanner;

// Exercise 2 : Write a program to make a stone paper scissors game

public class Exercise02 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int com = rand.nextInt(1,4);

        System.out.println("Select any one option\n[1] Stone [2] Paper [3] Scissors ");
        int you = sc.nextInt();

        if(you == com)
        {
            System.out.println("it's tie ! ");
        }
        else if (you == 1 && com == 2){
            System.out.println("com win");
        }
        else if (you == 1 && com == 3){
            System.out.println("you win");
        }
        else if (you == 2 && com == 1){
            System.out.println("you win");
        }
        else if (you == 2 && com == 3){
            System.out.println("com win");
        }
        else if (you == 3 && com == 1){
            System.out.println("com win");
        }
        else if (you == 3 && com == 2){
            System.out.println("you win");
        }


        if(you == 1)
            System.out.println("\n[You selected Stone]");
        else if(you == 2)
            System.out.println("\n[You selected Paper]");
        else if(you == 3)
            System.out.println("\n[You selected Scissor]");
        else
            System.out.println("\nPlease Select Valid Option !");

        if(com == 1)
            System.out.println("[Com selected Stone]");
        else if(com == 2)
            System.out.println("[Com selected Paper]");
        else if(com == 3)
            System.out.println("[Com selected Scissor]");
    }
}
