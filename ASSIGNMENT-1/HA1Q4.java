/*Write a method to add two matrices, the header of the method is as follows:
    public static double[][] addMatrix(double[][] a, double[][] b)
  In order to be added, the two matrices must have the same dimensions and the same or
  compatible types of elements.
 */
import java.util.Scanner;
public class HA1Q4 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        int row = a.length;
        int col = a[0].length;
        double [][] c = new double[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and col of the array");
        int row = sc.nextInt();
        int col = sc.nextInt();
        double a [][] = new double[row][col];
        double [][] b = new double[row][col];
        System.out.println("Enter elements of the first array");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                a[i][j] = sc.nextInt();
            } 
        }
        System.out.println("Enter elements of the second array ");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                b[i][j] = sc.nextInt();
            } 
        }
        double [][] d = addMatrix(a, b);
        System.out.println("Sum of elements of the array are : ");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
               System.out.println(d[i][j] + " ");
            } 
        }
        sc.close();
    }
}
