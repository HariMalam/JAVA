package CWH.Chapter02_Operator_And_Expressions.Practice;

public class Ch02_Ex03_Resulting_Data_Type {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 8;
        float b = 6.4f;
        System.out.println(b);

        // Increment and Decrement Operators

        int i = 56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        y = 7;
        System.out.println(++y * 8);

        char ch ='a';
        System.out.println(++ch);
    }
}
