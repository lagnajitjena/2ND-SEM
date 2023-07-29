/*Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, 
  and finds the first row and column with the most 1s */
public class HA1Q5 {
    public static int rowIndex(int [][] a){
        int max = 0;
        int temp = 0;
        for(int i = 0; i<a.length; i++){
            int count = 0;
            for(int j = 0; j<a[0].length; j++){
                if(a[i][j] == 1)
                    count++;                 
            }
            if(count>temp){
                temp = count;
                max = i;
            }
        }
        return max;
    }
    public static int colIndex(int [][] a){
        int maxColumn = 0;
        int max = 0;
        for(int i = 0; i<a[0].length; i++){
            int count = 0;
            for(int j = 0; j<a.length; j++){
                if(a[i][j] == 1)
                    count++;                 
            }
            if(count>max){
                max = count;
                maxColumn = i;
            }
        }
        return maxColumn;
    }
    public static void main(String[] args) {
        int [][] a = new int[4][4];
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                a[i][j] = (int)(Math.random()*2);
            } 
        }
        System.out.println("The largest row index : " + rowIndex(a));
        System.out.println("The largest column index : " + colIndex(a));
    }
}
