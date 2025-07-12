package arrays.medium;

public class peakElement {
    public static void main(String[] args) {
         int []  arr = {80,20,15,2,23,10};
          int result  =  peakEl(arr);
        System.out.println(result);
    }

    static int peakEl(int[] nums ){

        int n = nums.length;

        int start = 0;
        int end = nums.length - 1;

        if (n == 1) {
            return 0;
        }

        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else if (nums[mid] < nums[mid - 1])
                end = mid - 1;
            else {
                return mid;
            }

        }

        return 0;
    }

}
