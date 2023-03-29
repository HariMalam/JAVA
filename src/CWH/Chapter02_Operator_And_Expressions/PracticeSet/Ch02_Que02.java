package CWH.Chapter02_Operator_And_Expressions.PracticeSet;

// Question 2: Write a java program to encrypt a grade by adding 8 to it. Decrypting it to show the correct grade.

public class Ch02_Que02 {
    public static void main(String[] args) {
        char grade = 'B';

        // Encrypting the grade
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
