package CWH.Chapter08_Introduction_to_OOPS.Practice;

class Employee{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class Ch08_Ex01_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is out custom class");

//      Instantiating a new Employee Object
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

//      Setting Attributes for Hari
        emp1.id = 1;
        emp1.salary = 20;
        emp1.name = "Hari";

//      Setting Attributes for Tirth
        emp2.id = 2;
        emp2.salary = 15;
        emp2.name = "Tirth";

//      Printing the Attributes
        // System.out.println(emp1.id);
        // System.out.println(emp1.name);
        emp1.printDetails();
        System.out.println("Salary : "+emp1.getSalary());
        System.out.println();
        emp2.printDetails();
        System.out.println("Salary : "+emp2.getSalary());
    }
}
