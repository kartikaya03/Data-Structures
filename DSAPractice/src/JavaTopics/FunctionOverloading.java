package JavaTopics;

public class FunctionOverloading {
    public static void main(String[] args) {

        fun(10);
        fun("kartikeya");


    }
    static void fun(int num){
        System.out.println(num);
    }
    static void fun(String name){
        System.out.println(name);

    }

}
