package CWH.Chapter03_Strings.PracticeSet;

// Question 2 : Write a Java program to replace spaces with underscores.

public class Ch03_Que02 {
    public static void main(String[] args) {
        String text = "Malam hari Devshibhai";
        text = text.replace(" ","_");
        System.out.println(text);
    }
}
