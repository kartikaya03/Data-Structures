package JavaTopics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,4,5,7,8,9,93,4,67,7,8);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
