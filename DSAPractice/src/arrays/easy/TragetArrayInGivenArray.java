package arrays.easy;

import java.util.Arrays;

public class TragetArrayInGivenArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};


        int[] result = createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }
        static int[] createTargetArray(int[] nums, int[] index) {
            int[] target = new int[nums.length];

            // Shift elements and insert values
            for (int i = 0; i < nums.length; i++) {
                int insertIndex = index[i];

                // Shift elements to the right from the insertIndex
                for (int j = nums.length - 1; j > insertIndex; j--) {
                    target[j] = target[j - 1];
                }

                // Insert the current element
                target[insertIndex] = nums[i];
            }

            return target;
        }
    }



