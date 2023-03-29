package CWH.Chapter06_Arrays.PracticeSet;

// Question 4 : Create a Java program to add two matrix of size 2x3

public class Ch06_Que04 {
    public static void main(String[] args) {
        int [][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int [][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        int [][] result = {{0, 0, 0}, {0, 0, 0}};

        for(int i = 0 ; i< matrix1.length;i++)
        {
            for (int j = 0; j<matrix1[i].length; j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
