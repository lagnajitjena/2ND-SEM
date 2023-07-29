/*Write a java program to find the maximum and minimum and how many times they both occur
  in an array of n elements. Find out the positions where the maximum first occurs and the
  minimum last occurs.
 */
import java.util.Scanner;
public class A1Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter " + (i+1) + " element of the array");
            a[i] = sc.nextInt();
        }
        int mc = 0;
        int lc = 0;
        int max = 0;
        int min = a[a.length-1];
        int posl = -1;
        int posm = n-1;
        //Finding max element of the array
       for(int i = 0; i<a.length ; i++){
            if(a[i] > max){
                max = a[i];
                posl = i+1;
            }
        }
        //Finding minimum element of the array
        for(int i = n-1 ; i>=0 ; i--){
            if(a[i] < min){
                min = a[i];
            }
        }
        //Finding the occurence of the max and min occurence of the elements in the array
        for(int i = 0; i<a.length ; i++){
            if(a[i] == max){
                mc++;
            }
            if(a[i] == min){
                lc++;
            }
        }
        System.out.println("The maximimum element of the array is : " + max );
        System.out.println(max + " occurs " + mc + " times");
        System.out.println("Position of maximum element from the start : " + posl);
        System.out.println("\nThe minimum element of the array is " + min);
        System.out.println(min + " occurs " + lc + " times ");
        System.out.println("Position of minium element from the end : " + posm);
        sc.close();
    }
}
