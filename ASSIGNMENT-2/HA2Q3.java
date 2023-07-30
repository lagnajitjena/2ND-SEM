/*Write a Java code that would represent Distance object (meters, centimetres) using classes. The class 
definition include a parameterized constructor, display ( ) to display the instance variables, sum 
(Distance, Distance) to add two distances. Now write a main function that creates a couple of Distance 
objects and demonstrates the addition of two distances. */
import java.util.*;
class Distance{
    int meters;
    int centimetres;
    Distance(int meters, int centimetres){
        if(centimetres >= 100){
            meters += centimetres/100;
            centimetres = centimetres % 100;
        }
        this.meters = meters;
        this.centimetres = centimetres;
    }
    Distance add(Distance D1, Distance D2){
        int m = D1.meters + D2.meters;
        int cm = D1.centimetres + D2.centimetres;
        return new Distance(m, cm);
    }
    void display(){
        System.out.println(meters + " m " + centimetres + " cm");
    }
}
public class HA2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in meters and centimeters for object 1");
        int m = sc.nextInt();
        int cm = sc.nextInt();
        Distance D1 = new Distance(m, cm);
        System.out.println("Enter distance in meters and centimeters for object 2");
        m = sc.nextInt();
        cm = sc.nextInt();
        Distance D2 = new Distance(m, cm);
        Distance D3 = D1.add(D1,D2);
        D1.display();
        D2.display();
        System.out.println("The sum of two distances : ");
        D3.display();
        sc.close();
    }
}
