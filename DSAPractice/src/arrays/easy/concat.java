package arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class concat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
         int [] nums  = new int [size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = concatination(nums);
        System.out.println(Arrays.toString(result));

    }
    public static int[] concatination(int[] nums) {

        int[] result = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }
}


