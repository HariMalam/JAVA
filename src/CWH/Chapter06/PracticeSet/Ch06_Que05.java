package CWH.Chapter06.PracticeSet;

// Question 5 : Write a Java  program to reverse an array

public class Ch06_Que05 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int length = array.length;

        // You can also use math function.
        // This method returns the largest (closest to positive infinity) integer value that is less than or equal to the algebraic quotient.
        // int n = Math.floorDiv(length,2);

        for (int i = 0; i < length/2; i ++){
            // Swap a[i] and a[l-1-i]
            int temp = array[i];
            array[i]=array[length-1-i];
            array[length-1-i]=temp;
        }
        for (int elements : array) {
            System.out.print(elements + " ");
        }
    }
}
