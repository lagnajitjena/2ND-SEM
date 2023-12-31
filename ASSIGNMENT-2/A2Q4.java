/*Define a class called product. Two instance variables of the class are pid (product-id) and 
price (product price). It consists of one static variable tot_price (total price). Initialize the value 
of instance variables through parameterized constructor. It consists of a display ( ) method to 
display the value of instance variables. A person went to market and purchase 5 different 
products. Using the above mentioned class, display the details of products that the person has 
purchased. Also, determine how much total amount the person will pay for the purchase of 5 
products. */
import java.util.*;
class Product{
    int pid;
    double price;
    static double tot_price;
    Product(int pid, double price){
        this.pid = pid;
        this.price = price;
    }
    public static double calcamt(Product [] obj){
        for(int i = 0; i<obj.length; i++){
            tot_price += obj[i].price;
        }
        return tot_price;
    }
    void display(){
        System.out.println("PID = " + pid + "\nPRICE = " + price);
        System.out.println();
    }
}
public class A2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pid;
        double price;
        Product [] obj = new Product[5];
        for(int i = 0; i<5; i++){
            System.out.print("Enter pid and price ");
            pid = sc.nextInt();
            price = sc.nextDouble();
            obj[i] = new Product(pid, price);
        }
        for(int i = 0; i<5; i++){
            obj[i].display();
        }
        double amt = Product.calcamt(obj);
        System.out.println("TOTAL AMOUNT = " + amt);
        sc.close();
    }
}