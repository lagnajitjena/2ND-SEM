/*Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display 
name of a person, count the no. of characters present in the name of the person. */
import java.util.Scanner;
interface DetailInfo{
    void display();
    void count();
}
class Person implements DetailInfo{
    String name;
    static int maxcount = 0;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the person");
        name = sc.nextLine();
        sc.close();
    }
    public void display(){
        System.out.println("NAME : " + name);
        System.out.println("No.of characters present in the name = " + maxcount);
    }
    public void count(){
        char [] ch = name.toCharArray();
        for(int i = 0; i<ch.length; i++){
            if(ch[i] != ' '){
                maxcount++;
            }
        }
    }
}
public class A2Q8 {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.input();
        obj.count();
        obj.display();
    }
}
