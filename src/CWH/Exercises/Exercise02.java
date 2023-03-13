package CWH.Exercises;
import java.util.Random;
import java.util.Scanner;

// Exercise 2 : Write a java program to make a stone paper scissors game

public class Exercise02 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int com = rand.nextInt(1,4);

        System.out.println("Select any one option\n[1] Stone [2] Paper [3] Scissors ");
        int you = sc.nextInt();

        switch (you) {
            case 1 -> {
                if (com == 1) {
                    System.out.println("it's tie");
                    System.out.println("\n[com selected Stone]");
                } else if (com == 2) {
                    System.out.println("Com win");
                    System.out.println("\n[com selected Paper]");
                } else if (com == 3) {
                    System.out.println("You win");
                    System.out.println("\n[com selected Scissor]");
                }
                System.out.println("[you selected Stone]");
            }
            case 2 -> {
                if (com == 2) {
                    System.out.println("it's tie");
                    System.out.println("\n[com selected Paper]");
                } else if (com == 1) {
                    System.out.println("You win");
                    System.out.println("\n[com selected Stone]");
                } else if (com == 3) {
                    System.out.println("Com win");
                    System.out.println("\n[com selected Scissor]");
                }
                System.out.println("[you selected Paper]");
            }
            case 3 -> {
                if (com == 3) {
                    System.out.println("it's tie");
                    System.out.println("\n[com selected Scissor]");
                } else if (com == 2) {
                    System.out.println("You win");
                    System.out.println("\n[com selected Paper]");
                } else if (com == 1) {
                    System.out.println("Com win");
                    System.out.println("\n[com selected Stone]");
                }
                System.out.println("[you selected Scissor]");
            }
            default -> System.out.println("\n[Please Select Valid Option!]");
        }
    }
}
