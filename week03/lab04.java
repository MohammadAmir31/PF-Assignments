import java.util.Scanner;
public class lab04{
    public static void main(String[] args) {
        //write a program that finds average score for student's results array.
        Scanner read = new Scanner(System.in);

        System.out.println("enter the no of subjects");
        int a = read.nextInt();
        int score[] = new int[a];
        
        System.out.println("----enter the score------");
        for(int i = 0; i<a; i++){
            int val = read.nextInt();
            score[i] = val;
        }
        int start = score[0];
         for(int k = 0; k<score.length-1; k++){
             start +=score[k+1];
        }
        int result = start/score.length;

        System.out.println("----the average score is :" + result);
       
    }
}