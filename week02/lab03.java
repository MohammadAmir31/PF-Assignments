public class lab03 {
    
    public static int reverseN(int n){
        float f = n/10;
        int c = n%10;
        int w = c*10;
            f = f/10;
        int k =1;    
        int q = 0;
        while(f>0){
        c = k%10;
         q=w+c;
        f = f/10;
        
        
    }
        return q;
    }
    public static void main(String[] args) {
        //sum of given n numbers
        int result = reverseN(12345);
        System.out.println("result: "+result);
    }
    
}
