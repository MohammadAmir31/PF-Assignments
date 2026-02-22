public class lab01{
    public static void main(String[] args) {
        //write a program that loops over an array, and prints sum of that array
        int[] num = {2,4,5,6,7,8};
        int start = num[0];
        for(int i=0; i<num.length-1; i++){
           start +=num[i+1];
        }
        System.out.println(start);
    }

}