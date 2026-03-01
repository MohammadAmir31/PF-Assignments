import java.util.Scanner;
public class lab02 {
    public static void main(String[] args) {
        //sum of given n numbers
         Scanner read = new Scanner(System.in);
         System.out.print("enter the number");
         int num = read.nextInt();
         int c = 0;
         while(num > 0){
            int b = num%10;
            c= c+b;
            num = num/10;
         }
         System.out.print("\t"+"Sum: "+ c );

    }
    
}
