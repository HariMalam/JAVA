package CWH.Chapter06.PracticeSet;

// Question 8 : Write a Java program to find whether an array is sorted or not

public class Ch06_Que08 {
    public static void main(String[] args) {
        // int [] array = {1,2,3,4,5,6,7,8,9};
        int [] array = {9,8,7,6,5,4,3,2,1};
        boolean isSorted = true;

        int min = 2147483647;
        for (int element : array){
            if(element<min){
                min=element;
            }
        }

        for (int i = 0; i < array.length-1; i++){

            // Check Ascending order sorting
            if (min==array[0]) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    break;
                }
            }
            // Check Descending order sorting
            else {
                if (array[i] < array[i + 1]) {
                    isSorted = false;
                    break;
                }
            }
        }

        if (isSorted){
            System.out.println("The Array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }
    }
}
