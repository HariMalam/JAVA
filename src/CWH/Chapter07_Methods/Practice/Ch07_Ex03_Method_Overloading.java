package CWH.Chapter07_Methods.Practice;

public class Ch07_Ex03_Method_Overloading {
    static void foo(){
        System.out.println("Good Morning!");
    }
    static void foo(int a){
        System.out.println("Good Morning! "+a);
    }
    static void foo(int a,int b){
        System.out.println("Good Morning! "+a);
        System.out.println("Good Morning! "+b);
    }


    public static void main(String[] args) {
        foo();
        foo(2);
        foo(3,4); // Arguments are actual

        // Note : Method overloading cannot be performed by changing the return type of methods.
    }
}
