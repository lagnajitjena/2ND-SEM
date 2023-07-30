/*Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
java program to display area of different shapes */
import java.util.*;
abstract class Shape{
    abstract double area();
}
class Square extends Shape{
    double area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side ");
        double side = sc.nextDouble();
        return side*side;
    }
}
class Triangle extends Shape{
    double area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height respectively");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        return 0.5*base*height;
    }
}
class Circle extends Shape{
    double area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius  = sc.nextDouble();
        return Math.PI*radius*radius;
    }
}
public class A2Q6 {
    public static void main(String[] args) {
        Shape obj = new Square();
        System.out.println("Area of Shape 1 = " + obj.area());
        obj = new Triangle();
        System.out.println("Area of Shape 2 = " + obj.area());
        obj = new Circle();
        System.out.println("Area of Shape 3 = " + obj.area());
        }
    }

