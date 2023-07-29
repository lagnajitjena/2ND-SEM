/*Write a java program to check whether a number is a spy number or not. */
import java.util.*;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int cn = n;
        int ps = 1, s = 0,r;
        while (n!=0) {
            r = n%10;
            s += r;
            ps *= r;
            n /= 10;
        }
        if(s == ps){
            System.out.println(cn + " is a spy number ");
        }
        else{
            System.out.println(cn + " is not a spy number ");
        }
        sc.close();
    }
}
