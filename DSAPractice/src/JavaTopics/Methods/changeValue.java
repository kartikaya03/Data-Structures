package JavaTopics.Methods;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {

        int [] arr = {1,2,34,5,7};
            change(arr);
        System.out.println(Arrays.toString(arr));   // change in object of arr and nums via different variable can happen

    }
    static void change(int [] nums){
        nums[0]=99;
    }
}
