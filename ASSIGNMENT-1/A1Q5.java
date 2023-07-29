/*Write a java method to calculate the sum of digits of a given number until the number is a 
  single digit. The method signature is as follows.
    public static int sum_Of_Digits(int n) */
import java.util.Scanner;
public class A1Q5 {
    public static int sum_of_digits(int n){
        int sum = 0, r;
        while(n!=0){
            r = n%10;
            sum += r;
            n /= 10;
       }
        if(sum>10){
            sum_of_digits(sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int s = sum_of_digits(num);
        System.out.println("The sum is : " + s);
        sc.close();
    }
}
