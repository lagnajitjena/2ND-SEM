/*Define a base class Person with instance variable name, age. The instance variables are 
initialized through constructors. The prototype of constructor is as below.
      Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance variables 
are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double). Another instance method of Employee class is empDisplay() 
to display the information of employee details. */
import java.util.*;
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person{
    int eid;
    double salary;
    Employee(String name,int age,int eid, double salary){
        super(name,age);
        this.eid = eid;
        this.salary = salary;
    }
    void empdisplay(){
        System.out.println("NAME : " + name);
        System.out.println("AGE = " + age);
        System.out.println("EID : " + eid);
        System.out.println("SALARY : " + salary);
    }
}
public class A2Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age ");
        int age = sc.nextInt();
        System.out.println("Enter eid");
        int eid = sc.nextInt();
        System.out.println("Enter salary ");
        double salary = sc.nextDouble();

        Employee obj = new Employee(name, age, eid, salary);
        System.out.println("\nEmployee Details : ");
        obj.empdisplay();
        sc.close();
    }
}
