package CWH.Chapter06.PracticeSet;

// Question 1 : Create an array of 5 floats and calculate their sum

public class Ch06_Que01 {
    public static void main(String[] args) {
        float [] marks = {45.6f,56.7f,78.0f,46.5f,78.6f};
        float sum = 0;
        for (float element : marks )
        {
            sum += element;
        }
        System.out.println("Sum of all element is : "+sum);
    }
}
