package CWH.Chapter02_Operator_And_Expressions.PracticeSet;

// Question 4: Write the following expression in a java program
//             V^2 - U^2 / 2as

public class Ch02_Que04 {
    public static void main(String[] args) {
        float v = 4;
        float u = 2;
        float a = 2;
        float c = 3;
        float out = (v * v - u * u) / (2 * a * c);
        System.out.println(out);
    }
}
