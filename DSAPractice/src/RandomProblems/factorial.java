package RandomProblems;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int ans = factNumber(n);
        System.out.println(ans);

    }
    static int factNumber(int n){
        if( n ==0 || n ==1){
            return 1;
        }
        return n * factNumber(n-1);
    }
}
