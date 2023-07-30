/*A phone number can be thought of as having three parts: the area code, the exchange code and 
the number. 
Example: A phone number, such as (212) 767-8900, can be thought of as having three parts: 
the area code (212), the exchange (767) and the number (8900).
Define a class Phone to store these three parts of a phone number separately as instance 
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.) 
operator and instance variable with value area_code: 212, exchange: 767, 
number: 8900), and initialize other from the user through member method input ( ). Display 
both the numbers.
 */
import java.util.*;
class Phone{
    int area_code;
    int exchange;
    int number;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter area code, exchange and number");
        area_code= sc.nextInt();
        exchange = sc.nextInt();
        number = sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println("("+area_code +") " + exchange +"-" + number);
    }
}
public class A2Q1 {
    public static void main(String[] args) {
        int area_code = 212;
        int exchange = 767;
        int number = 8900;
        Phone obj = new Phone();
        obj.input();
        System.out.println("My number is : ");
        System.out.println("("+area_code +") " + exchange +"-" + number);
        System.out.println("Your number is : ");
        obj.display();
    }
}
