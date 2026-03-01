import java.util.Scanner;
public class lab07 {
    public static void main(String[] args) {
        //Search for a target number in the array. Print the index where it was found, or "Not found" if it is not in the array.
        Scanner read = new Scanner(System.in);
        int[] arr = {14, 27, 35, 48, 56}; 
        System.out.println("Enter the number");
        int num = read.nextInt();
        // int a =0;
        for (int i = 0; i <arr.length; i++){
            if (num == arr[i] ){
                System.out.println("Found "+ num +" at index :"+ i);
                break;
            }else{
                 if (num != arr[arr.length-1]){
            System.out.println("not found"); 
            }  
            }        
        }  
    }
}
