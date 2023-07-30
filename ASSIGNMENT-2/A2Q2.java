/* Define a class called Complex with instance variables real, imag and instance methods
   setData(), display(), add(). Write a Java program to add two complex numbers.
   The prototype of add method is: 
       public Complex add(Complex, Complex). */
import java.util.*;
class Complex{
    int real;
    int img;
    void setdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary values");
        real = sc.nextInt();
        img = sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println(real + " + " + img +" i ");
    }
    public Complex add(Complex C1, Complex C2){
        Complex C3 = new Complex();
        C3.real = C1.real + C2.real;
        C3.img = C1.img + C2.img;
        return C3;
    }
}
public class A2Q2 {
    public static void main(String[] args) {
        Complex obj = new Complex();
        Complex obj1 = new Complex();
        Complex obj2 = new Complex();
        obj.setdata();
        obj1.setdata();
        System.out.println("Input Values are : ");
        obj.display();;
        obj1.display();
        obj2 = obj2.add(obj, obj1);
        System.out.println("After complex addition, result : ");
        obj2.display();
    }
}
