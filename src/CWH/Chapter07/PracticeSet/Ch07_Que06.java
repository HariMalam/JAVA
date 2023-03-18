package CWH.Chapter07.PracticeSet;

// Question 6 : Write a function to find average of a set of numbers passed as arguments

public class Ch07_Que06 {
    static int avg (int ...arr){
        int sum=0;
        for (int i : arr){
            sum += i;
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        System.out.println(avg(1,2,3,4,5));
    }
}
