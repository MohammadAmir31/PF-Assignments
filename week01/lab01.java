import java.util.Scanner;
public class lab01{
    public static void main(String[] args) {
        //table of n number
         Scanner read = new Scanner(System.in);
         System.out.print("enter the number");
         int num = read.nextInt();
         for (int i =0; i<=10; i++){
            int c = num*i;
            System.out.println("\t"+num+" x "+i+" = "+c);
            
         }
    }
}