/*Write a Java program that takes two arrays a and b of length n storing int values, and returns
  the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
  for i = 0, . . . , n − 1.  */
import java.util.Scanner;
public class HA1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int []b = new int[n];
        int c[] = new int[n];
        for(int i = 0; i<n ; i++){
            c[i] = a[i]*b[i];
        }
        for(int i = 0; i<c.length; i++){
            System.out.println(c[i]);
        }
        sc.close();
    }
}
