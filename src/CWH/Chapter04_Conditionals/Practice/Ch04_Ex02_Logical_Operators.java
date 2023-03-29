package CWH.Chapter04_Conditionals.Practice;

public class Ch04_Ex02_Logical_Operators {
    public static void main(String[] args) {

        // Logical AND Operator
        // true  && true  = true
        // true  && false = false
        // false && true  = false
        // false && false = false


        // Logical OR Operator
        // true  || true  = true
        // true  || false = true
        // false || true  = true
        // false || false = false


        // Logical Not Operator
        // true = false
        // false = true


        boolean a = true;
        boolean b = false;

        System.out.print("Logical Not (true)  : ");
        System.out.println(!a);
        System.out.print("Logical Not (false) : ");
        System.out.println(!b);

        // (true - false)
        a = true;
        b = false;
        System.out.print("\nLogical AND (true && false)  : ");
        if (a && b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        System.out.print("Logical OR  (true && false)  : ");
        if (a || b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        // (true - true)
        a = true;
        b = true;
        System.out.print("\nLogical AND (true && true)   : ");
        if (a && b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        System.out.print("Logical OR  (true && true)   : ");
        if (a || b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        // (false - true)
        a = false;
        b = true;
        System.out.print("\nLogical AND (false && true)  : ");
        if (a && b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        System.out.print("Logical OR  (false && true)  : ");
        if (a || b) {
                System.out.println("true");
        }
        else {
                System.out.println("false");
        }

        // (false - false)
        a = false;
        b = false;
        System.out.print("\nLogical AND (false && false) : ");
        if (a && b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        System.out.print("Logical OR  (false || false) : ");
        if (a || b) {
                System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
