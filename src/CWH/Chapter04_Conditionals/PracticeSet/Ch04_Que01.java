package CWH.Chapter04_Conditionals.PracticeSet;

// Question 1 : What will be the output of this program:
//             int a = 10;
//             if(a = 11)
//                system.out.println("I am 11");
//             else
//                system.out.println("I am not 11");

public class Ch04_Que01 {
    public static void main(String[] args) {
        int a = 10;
        if(a == 11) // only a=10 is throwing an error
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");

    }
}
