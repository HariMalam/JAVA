package CWH.Chapter09.Practice;

class Employee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
        // this.name = n; // valid Syntax
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class Ch09_Ex01_Access_Modifier_Private {
    public static void main(String[] args) {
        Employee emp;
        emp = new Employee();

        // --> Throws an error due to private access modifier
        // emp.id = 1;
        // emp.name = "Hari";

        emp.setId(1);
        emp.setName("Hari");

        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
