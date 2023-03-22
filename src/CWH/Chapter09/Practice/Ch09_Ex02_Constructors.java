package CWH.Chapter09.Practice;

class MyEmployee{
    private int id;
    private String name;
    private final int salary;

    public MyEmployee(){
        id = 0;
        name = "Your-Name-Here";
        salary = 10000;
    }
    public MyEmployee(String myName){
        id = 1;
        name = myName;
        salary = 100000;
    }
    public MyEmployee(int myId, String myName){
        id = myId;
        name = myName;
        salary = 100000;
    }
    public MyEmployee(int myId, String myName, int mySalary){
        id = myId;
        name = myName;
        salary = mySalary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
}
public class Ch09_Ex02_Constructors {
    public static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee();
        MyEmployee emp2 = new MyEmployee("Hari");
        MyEmployee emp3 = new MyEmployee(2,"Deep");
        MyEmployee emp4 = new MyEmployee(3,"Tirth",20000);

        System.out.println("Id\tname\t\t\t\tsalary");
        System.out.format("%d\t%s\t\t%d\n",emp1.getId(),emp1.getName(),emp1.getSalary());
        System.out.format("%d\t%s\t\t\t\t%d\n",emp2.getId(),emp2.getName(),emp2.getSalary());
        System.out.format("%d\t%s\t\t\t\t%d\n",emp3.getId(),emp3.getName(),emp3.getSalary());
        System.out.format("%d\t%s\t\t\t\t%d\n",emp4.getId(),emp4.getName(),emp4.getSalary());
    }
}
