/*Write a java program to print M-by-N array in the tabular format. Also, display the sum of 
  elements of the array. */
import java.util.Scanner;
public class A1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the array");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int sum = 0;
        int [][] a = new int[row][col];
        System.out.println("Enter elements of the array");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
        }
        System.out.println("Elements of the array are : ");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
