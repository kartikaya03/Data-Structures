package RandomProblems;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        Boolean result = eligible(age);
        System.out.println(result);
    }

    static Boolean eligible(int age){
        return age >= 18;
    }
}
