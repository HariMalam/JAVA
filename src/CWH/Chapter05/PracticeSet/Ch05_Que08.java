package CWH.Chapter05.PracticeSet;


//  Question 8 : What can be done using one type of loop can also be done using the other two types of loops
//              - True or False
public class Ch05_Que08 {
    public static void main(String[] args) {
        int n=3;
        int i=0;
        System.out.print("While Loop :");
        while(i<=n){
            System.out.print(" "+i);
            i++;
        }
        System.out.print("\nDo-While Loop :");
        i=0;
        do {
            System.out.print(" "+i);
            i++;
        }while (i<=n);
        System.out.print("\nFor Loop :");
        for (i=0;i<=n;i++){
            System.out.print(" "+i);
        }
        System.out.println("\n\nAnswer is True...");
        System.out.println("Yes can be done using one type of loop can also be done using the other two types of loops");
    }
}
