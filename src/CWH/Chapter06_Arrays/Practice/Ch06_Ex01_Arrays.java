package CWH.Chapter06_Arrays.Practice;

public class Ch06_Ex01_Arrays {
    public static void main(String[] args) {

//        There are three main ways to create an array in Java

        // 1. Declaration and then memory allocation
        // int [] = marks;
        // marks = new int[5];

        // 2. Declaration, Memory allocation and initialization together
        // int [] marks = {100,70,80,70,98};

        // 3. Declaration and Memory Allocation
        int [] marks = new int[5];
        // Initialization
        marks[0] = 100; // Note that index starts from 0
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        marks[4] = 90;
        // marks[5] = 100; --> Throwing Error

        // Accessing Array Elements
        System.out.println(marks[4]);
    }
}
