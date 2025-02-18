package RandomProblems.arrays;

public class largestNumber {
    public static void main(String[] args) {
        int [] arr = {90,12,23,42,87,124};
        int maxNo = arr[0];


        for (int i = 0; i < arr.length ; i++) {
            if(maxNo<=arr[i]){
                maxNo = arr[i];
            }
        }
        System.out.println(maxNo);

    }
}
