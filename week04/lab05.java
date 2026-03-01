
import java.util.Arrays;

public class lab05 {

    public static int[][] addMatrix(int[][] a,int[][] b ){
        int [][] sum = new int[3][3];
          for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
            int c = a[i][j];
            int d = b[i][j];
            sum[i][j] = c+d;
         }
        }
        return sum;
    }
     public static int[][] subMatrix(int[][]a ,int[][]b){
         int [][] sum = new int[3][3];
          for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
            int c = a[i][j];
            int d = b[i][j];
            sum[i][j] = c-d;
         }
        }
        return sum;
    }
     public static int[][] tranMatrix(int[][] a){
         int [][] at = new int[3][3];

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
            int c = a[i][j];
            at[j][i] = c;

         }
         }
        return at;
    }
     public static void symetric(int[][] a){
         int [][] at = new int[3][3];

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
            int c = a[i][j];
            at[j][i] = c;

         }
         }
         if (Arrays.deepEquals(at, a)){
          System.out.println("Given matrix is a symmetric matrix");  
         }
         else{
          System.out.println("Given matrix is not symmetric matrix");  

         }
        //  return 0;
        
    }
    public static void sumDia(int[][] a){
        int sum =0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
            int c = a[i][j];
            if (i == j) {
                sum+= a[i][j];
            }
         }
        }
        System.out.println("Sum of diagonals : "+ sum);
    }
    public static void printt(int[][]a) {
         for( int k=0; k<a.length; k++){
            for (int p=0; p<a[k].length; p++) {
                
                System.out.print("\t"+a[k][p]);
                
            }
            System.out.println("\n"); 
        } 
        
    }
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b = {{5,6,1},{9,3,4},{7,1,6}};
        int [][] s = {{1,1,1},{1,1,1},{1,1,1}};

        int [][] r = addMatrix(a,b);
        int [][] r2 = subMatrix(a,b);
        int [][] r3 = tranMatrix(a);
        // symetric(s);
        sumDia(b);

    
        // printt(r3);
        
    }
}
