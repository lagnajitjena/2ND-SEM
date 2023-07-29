/*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
  values using the following header:
    public static double sumMajorDiagonal(double[][] m) */
import java.util.Scanner;
public class A1Q9 {
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[0].length;j++){
                if(i == j){
                    sum +=  m[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        double [][] a = new double[row][col];
        System.out.println("Enter elements of the array");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Sum of major diagonal = " + sumMajorDiagonal(a));
        sc.close();
    }
}
