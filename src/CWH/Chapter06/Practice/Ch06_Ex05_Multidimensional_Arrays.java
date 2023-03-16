package CWH.Chapter06.Practice;

public class Ch06_Ex05_Multidimensional_Arrays {
    public static void main(String[] args) {
        int [] marks; // 1-D Array
        int [][] flats; // 2-D Array
        flats = new int [2][3];
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Display Array (for loop) : ");
        for (int i = 0; i < flats.length; i++){
            for (int j = 0; j<flats[i].length; j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }

        // Displaying the 2-D Array (for each loop)
        System.out.println("\nDisplay Array (for each loop) : ");
        for (int[] flat : flats) {
            for (int i : flat) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
