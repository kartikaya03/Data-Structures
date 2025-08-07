package RandomProblems;


import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter num 1 : ");
        int num1 =  sc.nextInt();
        System.out.print("enter num 2 : ");
        int num2 =  sc.nextInt();
        System.out.print("enter num 3 : ");
        int num3 =  sc.nextInt();

        int MaximumNumber =  MaxNumber(num1,num2,num3);
        int MinimumNumber =  MinNumber(num1,num2,num3);
        System.out.println("max number is  : "+MaximumNumber);
        System.out.println("min number is : " +MinimumNumber);

    }

    static int  MaxNumber(int num1 , int num2 , int num3 ){

             int max1 = Math.max(num1,num2);
             int max2 = Math.max(num2,num3);

             return Math.max(max1,max2);
    }
    static int  MinNumber(int num1 , int num2 , int num3 ){

        int min1 = Math.min(num1,num2);
        int min2 = Math.min(num2,num3);

        return Math.min(min1, min2);
    }

}
