package arrays.medium;

public class IndexElementInSortedArray {
    public static void main(String[] args) {
             int [] nums = {3,5,7,9,10,90,100,130,140,160,170};
             int target = 10;
        System.out.println(ans(nums,target));
    }
    static int ans(int[] nums, int target) {
         int start = 0;
         int end = 1;

         while(target > nums[end]){
             int temp = end + 1;
             end = end + (end - start + 1) * 2;
             start = temp;
         }
         return search(nums,target);
    }
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
