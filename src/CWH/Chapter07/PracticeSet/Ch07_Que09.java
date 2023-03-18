package CWH.Chapter07.PracticeSet;

// Question 9 : Write a function to convert Celsius temperature to Fahrenheit

import java.util.Scanner;

public class Ch07_Que09 {
    static float celsiusToFahrenheit(float c){
        return (c * 9/5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Celsius : ");
        float celsius = sc.nextFloat();
        System.out.printf("%.2f Celsius = %.2f Fahrenheit",celsius,celsiusToFahrenheit(celsius));
    }
}
