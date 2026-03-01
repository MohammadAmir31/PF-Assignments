public class lab02 {
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
           for( int k=0; k<a.length; k++){
            for (int p=0; p<a[k].length; p++) {
                
                System.out.print("\t"+a[k][p]);
                
            }
            System.out.println("\n"); 
        } 
    }
    }