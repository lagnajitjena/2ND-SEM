/*Write a Java program that takes all the lines input to standard input and writes them to
standard output in reverse order. That is, each line is output in the correct order, but the
ordering of the lines is reversed */
import java.util.Scanner;
public class HA1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no lines you want to print");
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i<str.length; i++){
            System.out.println("Enter line " + (i+1));
            str[i] = sc.nextLine();
        }
        System.out.println("The lines in reverse are : ");
        for(int i = str.length-1; i>=0; i--){
            System.out.println(str[i]);
        }
        sc.close();
    }
}
