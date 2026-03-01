public class lab05{
    public static void main(String[] args) {
        //write a program that finds average score for student's results array.
        int[] num = {34, 71, 12, 98, 45, 23};
        int Lnum = num[0];
        for(int i=0; i < num.length; i++){
           if(num[i] > Lnum){
            Lnum = num[i]; 
           }
        }
        System.out.println(Lnum);
    }

}