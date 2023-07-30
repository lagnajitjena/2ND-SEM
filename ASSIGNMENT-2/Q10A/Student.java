package Q10A;
import java.util.Scanner;
public class Student {
    public String name;
    public int roll;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        name = sc.nextLine();

        System.out.println("Enter roll");
        roll = sc.nextInt();
    }
    public void output(){
        System.out.println("NAME : " + name + "\nROLL : " + roll);
    }
}
