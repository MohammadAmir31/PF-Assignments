public class lab02 {
    public static void main(String[] args) {
        //write a program that perform transpose operation on a 3x3 matrix
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] at = new int[3][3];

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
            int c = a[i][j];
            at[j][i] = c;

         }
         }
        for( int k=0; k<at.length; k++){
            for (int p=0; p<at[k].length; p++) {
                
                System.out.print("\t"+at[k][p]);
                
            }
            System.out.println("\n");
        }
    }
}
