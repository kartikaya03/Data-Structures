package arrays.medium;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
         int  mid = start + (end - start) / 2;
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        return nums[start];
    }
}





