package arrays.easy;

public class floor {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 11, 25, 46, 67, 89};

        int target = 99;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target) {

        if(target > arr[arr.length-1]){  //If target is greater than the last element
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return end;

    }
}
