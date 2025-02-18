package RandomProblems.arrays;

public class zeroes {
    public static void main(String[] args) {
 int [] arr = {0,1,0,3,12};

        shiftZeroesToEnd(arr);

        // Print the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void shiftZeroesToEnd(int[] arr) {
        int j = 0; // Pointer for non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) { // If not zero, swap with the first zero found
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

}
