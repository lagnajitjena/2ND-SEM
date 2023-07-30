/*Write a Java program to declare a Class named as Student which contains roll number,name and course as instance variables 
and input_Student () and display_Student () as instance methods. A derived class Exam is created from the class Student. 
The derived class contains mark1, mark2, mark3 as instance variables representing the marks of three subjects and input_Marks () 
and display_Result () as instance methods. Create an array of objects of the Exam class and display the result of 5 students */
import java.util.*;
class Student1{
    String name;
    String course;
    int roll;
    void input_Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student ");
        name = sc.nextLine();
        
        System.out.println("Enter the course");
        course = sc.nextLine();
        
        System.out.println("Enter roll number");
        roll = sc.nextInt();
    }
    void display_Student(){
        System.out.println("NAME : " + name + "\nROLL : " + roll + "\nCOURSE : " + course);
    }
}
class Exam extends Student1{
    double mark1, mark2, mark3;
    void input_Marks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark 1");
        mark1 = sc.nextDouble();
        System.out.println("Enter Mark 2");
        mark2 = sc.nextDouble();
        System.out.println("Enter Mark 3");
        mark3 = sc.nextDouble();
    }
    void display_Result(){
        System.out.println("MARK 1 = " + mark1 + "\nMARK 2 = " + mark2 + "\nMARK 3 = " + mark3);
        System.out.println("TOTAL MARK = " + (mark1+mark2+mark3));
    }
}
public class A2Q9 {
    public static void main(String[] args) {
        Exam [] obj = new Exam[5];
        for(int i = 0; i<5; i++){
            obj[i] = new Exam();
            obj[i].input_Student();
            obj[i].input_Marks();
        }
        for(int i = 0 ; i<5 ; i++){
            System.out.println();
            obj[i].display_Student();
            obj[i].display_Result();
        }
        
    }
}
