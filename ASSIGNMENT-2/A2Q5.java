/*Define a class Deposit. The instance variable of the class Deposit are mentioned below.
Instance variable Datatype
               Principal-->Long 
               Time------->Integer
               rate------->Double     
               Total_amt-->Double
Initialize the instance variables Principal, Time, rate through constructors. Constructors are 
overloaded with the following prototypes. 
    Constructor1: Deposit ()
    Constructor2: Deposit (long, int, double)
    Constructor3: Deposit (long, int)
    Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are (i) display (): to display the 
value of instance variables, (ii) calc_amt() to calculate the total amount. 
Total_amt = Principal + (Principal×rate×Time)/100;
 */
import java.util.*;
class Deposit{
    int time;
    long principle;
    double rate;
    double total_amt;
    Deposit(){}
    Deposit (long principal, int time, double rate){
        this.principle = principal;
        this.time = time;
        this.rate = rate;
    }
    Deposit (long principal, int time){
        this.principle = principal;
        this.time = time;
    }
    Deposit (long principal, double rate){
        this.principle = principal;
        this.rate = rate;
    }
    void calc_amt(){
        total_amt = principle + (principle*rate*time)/100;
    }
    void display(){
        System.out.println("PRINCIPLE = " + principle + "\nRATE = " + rate + "\nTIME = " + time);
        System.out.println("TOTAL AMOUNT = " + total_amt);
    }
}
public class A2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle ");
        long principle = sc.nextLong();
        System.out.println("Enter time in years");
        int time = sc.nextInt();
        System.out.println("Enter rate in percent");
        double rate = sc.nextDouble();
        Deposit D1 = new Deposit(principle,time, rate);

        System.out.println("\nEnter principle ");
        principle = sc.nextLong();
        System.out.println("Enter time in years");
        time = sc.nextInt();
        Deposit D2 = new Deposit(principle,time);

        System.out.println("\nEnter principle");
        principle = sc.nextLong();
        System.out.println("Enter rate in percent");
        rate = sc.nextDouble();
        Deposit D3 = new Deposit(principle, rate);
        
        System.out.println("\nDetails of Input 1");
        D1.calc_amt();
        D1.display();
        System.out.println("\nDetails of Input 2");
        D2.calc_amt();
        D2.display();
        System.out.println("\nDetails of Input 3");
        D3.calc_amt();
        D3.display();
        sc.close();
    }
}
