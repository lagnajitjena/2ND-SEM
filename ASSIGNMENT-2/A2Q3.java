/*Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class 
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable 
and to display the value of instance variable. Write a program to create the details of 5 students. 
Display the information of the students who has secured the highest DSA_Mark. */
import java.util.*;
class Student{
    int roll;
    String name;
    double mark;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        name = sc.nextLine();
        System.out.println("Enter roll");
        roll = sc.nextInt();
        System.out.println("Enter DSA mark");
        mark = sc.nextDouble();
        sc.close();
    }
    void showData(){
        System.out.println("NAME : " + name + "\nROLL : " + roll + "\nDSA MARK : " + mark);
    }
}
public class A2Q3 {
    public static void main(String[] args) {
        Student [] obj = new Student[5];
        for(int i = 0; i<5; i++){
            obj[i] = new Student();
            obj[i].getData();
        }
        double highest = obj[0].mark;
        int index = -1;
        for(int i = 1; i<5; i++){
            if(obj[i].mark>highest){
                highest = obj[i].mark;
                index = i;
            }
        }
        System.out.println("Highest DSA Mark : " + highest);
        System.out.println("Details of DSA Topper : ");
        obj[index].showData();
    }
}
