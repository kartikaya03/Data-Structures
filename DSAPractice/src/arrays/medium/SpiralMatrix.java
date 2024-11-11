package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
      int [][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));

//  1  →  2  →  3  →4
//                  ↓
//  5  →  6  →  7   8
//  ↑               ↓
//  9  ← 10 ← 11 ← 12

    }

    static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        int left = 0;
        int top = 0;

        int right = matrix[0].length-1;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom) {


        for (int rows = left; rows <= right; rows++) {    //reading from left to right
            list.add(matrix[top][rows]);
        }
        top++;
        for (int rows = top; rows <= bottom; rows++) {      //reading from top to bottom
            list.add(matrix[rows][right]);
        }
        right--;
        if(top<=bottom) {
            for (int rows = right; rows >= left; rows--) {      //reading from right to left
                list.add(matrix[bottom][rows]);
            }
            bottom--;
        }
        if(left<=right) {
            for (int rows = bottom; rows >= top; rows--) {      //reading from bottom to top
                list.add(matrix[rows][left]);
            }
        }
        left++;
    }

    return list;
    }
}
