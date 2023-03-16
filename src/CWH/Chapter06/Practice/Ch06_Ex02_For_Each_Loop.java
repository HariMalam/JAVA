package CWH.Chapter06.Practice;

public class Ch06_Ex02_For_Each_Loop {
    public static void main(String[] args) {
         int [] marks1 = {100,70,80,70,98};
        System.out.print("Length of Array marks1 : ");
        System.out.println(marks1.length); // gives the length of the integer array

        // Displaying the Array (Naive Way)
        System.out.print("Array marks1 (Using Naive Way) : ");
        System.out.print(marks1[0]+" ");
        System.out.print(marks1[1]+" ");
        System.out.print(marks1[2]+" ");
        System.out.print(marks1[3]+" ");
        System.out.println(marks1[4]);

        float [] marks2 = {92.2f,87.2f,82.31f};
        System.out.print("\nLength of Array marks2 : ");
        System.out.println(marks2.length); // gives the length of the float array

        // Displaying the Array (for loop)
        System.out.print("Array marks2 (Using for loop) : ");
        for (int i=0; i<marks2.length;i++){
            System.out.print(marks2[i]+" ");
        }

        // Quick Quiz : Display the Array in Reverse Order (for loop)
        System.out.print("\nArray marks2 (Using for loop in reverse order) : ");
        for (int i=marks2.length-1; i>=0;i--){
            System.out.print(marks2[i]+" ");
        }

        String [] students = {"Hari","Tirth","Deep"};
        System.out.print("\n\nLength of Array students : ");
        System.out.println(students.length); // gives the length of the String array

        // Display the Array (for each loop)
        System.out.print("Array students (using for each loop) : ");
        for (String element : students) {
            System.out.print(element + " ");
        }
    }
}
