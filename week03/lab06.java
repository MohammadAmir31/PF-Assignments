public class lab06 {
    public static void main(String[] args) {
        //Count how many numbers in the array are even and how many are odd. Print both counts.
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8,6,89,32,11,3,7};
        int even =0;
        int odd = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even count: "+even);
        System.out.println("even odd: "+odd);

    }
}
