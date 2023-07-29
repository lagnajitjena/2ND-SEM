/*Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
  method can't use the multiplication, modulus, or division operators, The method signature is 
  as follows.
    public static boolean isOdd(int n) */
import java.util.Scanner;
public class A1Q6 {
    public static boolean isOdd(int n){
        if((n&1) == 0){
            return false;
        }
        else 
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        System.out.println(n + " is odd : " + isOdd(n));
        sc.close();
    }
}
