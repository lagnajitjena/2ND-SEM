package Q10A;
import java.util.*;
public class Test extends Student {
    public double mark1;
    public double mark2;
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark 1");
        mark1 = sc.nextDouble();
        System.out.println("Enter mark 2");
        mark2 = sc.nextDouble();
    }
    public void output(){
        super.output();
        System.out.println("MARK 1 = " + mark1 + "\nMARK 2 = " + mark2);
    }
}
