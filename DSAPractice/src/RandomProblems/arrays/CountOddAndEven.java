package RandomProblems.arrays;

public class CountOddAndEven {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3,4,5,12,14,5000,600,700,8,9,10,11,13,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        CountOddAndEven obj = new CountOddAndEven();
        obj.countEvenOdd(arr);


    }
    void countEvenOdd(int [] arr){
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2==0){
                evenCount++;
            } else if ( arr[i]%2==1) {
                oddCount++;

            }
        }
        System.out.println("Even Count : "+evenCount);
        System.out.println("Odd Count : "+oddCount);

    }
}
