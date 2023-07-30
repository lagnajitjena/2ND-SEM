/*A point in the x-y plane is represented by its x-coordinate and y-coordinate. Design a class,
PointType in Java, that can store and process a point in the x-y plane. You should then
perform operations on the point, such as showing the point, setting the coordinates of the
point, printing the coordinates of the point, returning the x-coordinate, and returning the 
y-coordinate. Every circle has a centre and a radius. Given the radius, we can determine the
circle’s area and circumference. Given the centre, we can determine its position in the x-y
plane. The centre of a circle is a point in the x-y plane. Design a class, CircleType that can
store the radius and centre of the circle. Because the center is a point in the x-y plane and
you designed the class to capture the properties of a point from PointType class. You must
derive the class CircleType from the class PointType. You should be able to perform the
usual operations on a circle, such as setting the radius, printing the radius, calculating and
printing the area and circumference, and carrying out the usual operations on the center. */
import java.util.*;
class PointType{
    int x, y;
    PointType(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("Point : (" + x + "," + y + ")");
    }
    void setCoordinates(){
        System.out.println("Point lies in : ");
        if(x>0 && y>0){
            System.out.println("1st Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("2nd Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("3rd Quadrant");
        }
        else{
            System.out.println("4th Quadrant");
        }
    }
}
class CircleType extends PointType{
    double radius;
    CircleType(int x, int y, double radius){
        super(x, y);
        this.radius = radius;
    }
    void getRadius(){
        System.out.println("Radius = " + (Math.PI*radius*radius));
    }
}
public class HA2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate and y-coordinate");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter radius of circle");
        double radius = sc.nextDouble();
        CircleType obj = new CircleType(x, y, radius);
        obj.setCoordinates();
        System.out.println("Radius of Circle : ");
        obj.getRadius();
        sc.close();
    }   
}
