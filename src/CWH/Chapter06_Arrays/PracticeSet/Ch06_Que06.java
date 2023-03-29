package CWH.Chapter06_Arrays.PracticeSet;

// Question 6 : Write a Java program to find the maximum element in an array

public class Ch06_Que06 {
    public static void main(String[] args) {
        System.out.println("Minimum integer value : " + Integer.MIN_VALUE);
        int [] array = {1,2,6,4,5};
        int max = -2147483648;
        for (int element : array){
            if(element>max){
                max=element;
            }
        }
        System.out.println("The maximum element is : " + max);
    }
}
