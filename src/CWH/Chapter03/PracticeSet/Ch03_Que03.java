package CWH.Chapter03.PracticeSet;

// Question 3 : Write a Java program to fill in a latter template which looks like below.
//            latter = "Dear <|Name|>, Thanks a lot!"
//            Replace <|Name|> with a string (some name)

public class Ch03_Que03 {
    public static void main(String[] args) {
        String letter = "Dear <|Name|>, Thanks a lot!";
        letter = letter.replace("<|Name|>","Hari");
        System.out.println(letter);

    }
}
