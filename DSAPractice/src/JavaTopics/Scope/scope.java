package JavaTopics.Scope;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b =  20;
        String name = "kartik";
        {
             // int a =100; // already initialized in same method so you cannot change it again : -> gives error
            a =100;   // reassigning of value
           int c = 99;
            System.out.println(a);
            name = "rahul";
            System.out.println(name);
            System.out.println(c);    //c =99 valid only inside this block only that is b/w line 8 - 16.
        }
          int c = 900;
        System.out.println(c);
        System.out.println(name);
        System.out.println(a);
       // System.out.println(c); cannot access outside of scope

    }
}


//NOTES

//1. If you initialize something inside scope you can only use it inside scope
//2. if you reassign value inside scope you can change it and print inside scope and outside ,  the value will be changed
//3. you have to create int a = ? something for new value

//OVERALL : Anything you initialized outside can access/update inside but anything you Initialized inside cannot used outside PERIOD.
          //if initialized inside also can initialize outside but cannot use outside.