package CWH.Chapter10_Inheritance.Practice;

class ex{
    int v;

    public ex(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }
}

class ex2 extends ex{
    ex2 (int c){
        super(c);
        System.out.println("i am a constructor of derived class");
    }
}
public class Ch10_Ex03_this_super {
    public static void main(String[] args) {
        ex e = new ex(6);
        ex2 e2 = new ex2(5);
        System.out.println(e.getV());
    }
}
