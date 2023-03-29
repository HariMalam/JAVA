package CWH.Chapter07_Methods.Practice;

public class Ch07_Ex05_Recursion {

    // Recursive Method
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    // iterative approach
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is : " + factorial(5));
        System.out.println("Factorial of 5 is : " + factorial_iterative(5));
    }
}
