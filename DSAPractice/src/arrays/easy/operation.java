package arrays.easy;

import java.util.Arrays;

public class operation {
    public static void main(String[] args) {
        int [] nums = {1,0,4,0,0,2,0};

        int [] result = applyOperation(nums);

        System.out.println(Arrays.toString(result));
    }
    static int[] applyOperation(int [] nums){
        int n = nums.length-1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                continue;
            }
            nums[i]*=2;
            nums[i+1]=0;
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }

}

