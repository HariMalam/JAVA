package CWH.Chapter06.PracticeSet;

// Question 3 : Calculate the average marks from an array containing marks of all students in physics using for-each loop

public class Ch06_Que03 {
    public static void main(String[] args) {
        float [] marks = {45.6f,56.7f,78.0f,46.5f,78.6f};
        float sum = 0;
        for (float element : marks ){
            sum += element;
        }
        System.out.println("The value of average marks is : " + sum/marks.length);
    }
}
