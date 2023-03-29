package CWH.Chapter07_Methods.Practice;

public class Ch07_Ex04_VarArgs {

//    static int sum(int a, int b) {
//        return a + b;
//    }

//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }

//    static int sum(int a, int b, int c, int d) {
//        return a + b + c +d;
//    }


//    Note : In this case x is compulsory that means one argument is compulsory
//    static int sum(int x,int ...arr){   // at least one integer is required now
//        int result = x;
//        for (int e : arr){
//            result += e;
//        }
//        return result;
//    }

    static int sum(int ...arr){
        int result = 0;
        for (int e : arr){
            result += e;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my world");
        System.out.println("The sum of Nothing : " + sum());
        System.out.println("The sum of 4 and 5 is : " + sum(4, 5));
        System.out.println("The sum of 4 and 5 is : " + sum(4, 5, 6));
        System.out.println("The sum of 4 and 5 is : " + sum(4, 5, 6, 7));
    }
}
