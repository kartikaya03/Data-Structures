package RandomProblems;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class addToArrayForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();

        int[] arr =  new int[size];
        for (int i = 0; i <arr.length ; i++) {
             arr[i]=sc.nextInt();
        }

        int k = sc.nextInt();

        List<Integer> result = addArray(arr, k);
        System.out.println(result);
    }

    static List<Integer> addArray(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = arr.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += arr[i];
                i--;
            }

            ans.add(k % 10);
            k = k / 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
