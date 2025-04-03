package arrays.searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {90,75,60,22,17,11,5,1};
        int target = 90;
        int ans = OrderAgnosticBinarySearch(arr,target);
        System.out.println(ans);
    }

    static int OrderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid]==target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid -1 ;

                } else
                    start = mid + 1;
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else  {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
