package CWH.Exercises;
import java.util.Random;
import java.util.Scanner;

/* Exercise 03 : Create a class Game, which allows a user to play "Guess the Number"
   Game should have the following methods :

 1. Constructor to generate the random number
 2. takeUserInput() to take a user input of number
 3. isCorrectNumber() to detect whether the number entered by the user is true
 4. getters and setters for noOfGuesses
 Use properties such as noOfGuesses(int), etc. to get this task done ! */


class game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
     void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the Number: ");
        inputNumber = sc.nextInt();
    }
    public void  setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    public game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guess is right, it was %d\nYou guessed in %d attempts",number,noOfGuesses);
            return true;
        }
        else if (inputNumber < number) {
        System.out.println("To Low...");
        }
        else if (inputNumber>number) {
            System.out.println("To High...");
        }
        return false;
    }
}

public class Exercise03 {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
