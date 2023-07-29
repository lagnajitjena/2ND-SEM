/*Write a method that returns the sum of all the elements in a specified column in a matrix 
  using the following header:
    ublic static double sumColumn(double[][] m, int columnIndex) */
import java.util.Scanner;
public class A1Q10 {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for(int i = 0; i<m[0].length; i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and cols");
        int row = sc.nextInt();
        int col = sc.nextInt();
        double [][] a = new double[row][col];
        System.out.println("Enter elements of the array");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                a[i][j] = sc.nextDouble();
            }
        }
        for(int i = 0; i<row; i++){
            System.out.println("Sum of col " + (i+1) + " = " + sumColumn(a, i));
        }
        sc.close();
    }
}
