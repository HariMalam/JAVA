package CWH.Chapter07.Practice;

public class Ch07_Ex02_Method_Calling {
    static void tellJoke(){
        System.out.println("I invented a new word! \nPlagiarism");
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int []arr){
        arr[0]=98;
    }

    public static void main(String[] args) {
        tellJoke();

        // Case 1 : Changing the Integer
        int x = 45;
        System.out.println("The value of x after running change is : " + x);

        // Case 2 : Changing the Array
        // In case of Arrays, the reference is passed. Same is the case for object passing to methods.
        int [] Array = {1,2,3,4,5,6};
        change2(Array);
        System.out.println("The value of Array[0] after running change2 is : " + Array[0]);
    }
}
