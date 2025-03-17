package arrays.searching;


public class LinearSearch {
    public static int search(int arr[], int target)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }


    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int target = 11;

        // Function call
        int result = search(arr, target);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
}






