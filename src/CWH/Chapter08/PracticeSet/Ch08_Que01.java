package CWH.Chapter08.PracticeSet;

// Question 1 : Create a class Employee with following properties and methods :
//              salary(property)(int)
//              getSalary(method returning int)
//              name(property)(string)
//              getName(method returning string)
//              setName(method changing name)

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setSalary(int n){
        salary = n;
    }
}
public class Ch08_Que01 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Hari");
        emp1.setSalary(200000);
        System.out.println("name   : " + emp1.getName());
        System.out.println("salary : " + emp1.getSalary());
    }
}
