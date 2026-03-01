import java.util.Scanner;
public class lab04 {
    public static boolean pNum(int a) {
        boolean c;
        if(a == 2 ) {
            c = true;
            System.out.println(c);
        }else if (a % 2 != 0 ) {
            c = true;
            System.out.println(c);
        }
        else{
            c = false;
            System.out.println(c);
        }
        return c;
    }
    public static void main(String[] args) {
        // Write a function that checks if an integer is a prime number, returns true if it is, otherwise false
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a prime number");
        int num = read.nextInt();
        while(num <=1){
        System.out.println("it should be greater than 1..");
        num = read.nextInt();
        }
        pNum(num);
    }
}
