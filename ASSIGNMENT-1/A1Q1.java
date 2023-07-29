/*Write a Java program that can take a positive integer greater than 2 as input and write out the
  number of times one must repeatedly divide this number by 2 before getting a value less
  than 2 */
import java.util.*;
public class A1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int count = 0;
        while(n>2){
            n /= 2;
            count++;
        }
        System.out.println("The number is now " + n + " and it was divided " + count + " times by 2");
        sc.close();
    }
}
