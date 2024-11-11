package arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

// SUM OF 1D ARRAY
public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int [size];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= sc.nextInt();
        }
        int [] ans = runningSum(nums);
        System.out.println(Arrays.toString(
                ans
        ));
    }

    static int[] runningSum(int [] nums){

        for (int i = 1; i < nums.length; i++) {
            nums[i]= nums[i-1]+nums[i];
        }

      return nums;
    }
}
