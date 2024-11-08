package Arrays.easy;

import java.util.Arrays;

public class Shuffle {

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffleArray(nums, n);

            System.out.print("Shuffled array: "+Arrays.toString(result));

    }

    public static int[] shuffleArray(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }
        return result;
    }
}
