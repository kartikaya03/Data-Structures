package RandomProblems.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 100, 40, 60};
        secondLargest(arr);


    }

    static void secondLargest(int [] arr ){

        int largest = Integer.MIN_VALUE;
        int second  =  Integer.MIN_VALUE;


        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }

        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);







    }




}
