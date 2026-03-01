public class lab01 {
    public static void main(String[] args) {
         int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
         int [][] b = {{5,6,1},{9,3,4},{7,1,6}};
        int [][] sum = new int[3][3];

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
            int c = a[i][j];
            int d = b[i][j];
            sum[i][j] = c+d;
         }

           for( int k=0; k<sum.length; k++){
            for (int p=0; p<sum[k].length; p++) {
                
                System.out.print("\t"+sum[k][p]);
                
            }
            System.out.println("\n"); 
        } 
    }
}
}