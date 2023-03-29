package CWH.Chapter07_Methods.Practice;

public class Ch07_Ex01_Methods {
    static int logic(int x,int y){
        int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    int logic1(int x,int y){
        int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a,b);

        int a1 = 2;
        int b1 = 1;
        int c1;
        // Methods invocation using Object creation
        Ch07_Ex01_Methods obj = new Ch07_Ex01_Methods();
        c1 = obj.logic1(a1,b1);

        System.out.println(c);
        System.out.println(c1);
    }
}
