package CWH.Chapter06.PracticeSet;

// Question 7 : Write a Java program to find the minimum element in an array

public class Ch06_Que07 {
    public static void main(String[] args) {
        System.out.println("Maximum integer Value : " + Integer.MAX_VALUE);
        int [] array = {1,2,6,4,5};
        int min = 2147483647;
        for (int element : array){
            if(element<min){
                min=element;
            }
        }
        System.out.println("The minimum element is : " + min);
    }
}
