package Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Kartikaya Gupta my world is small";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("     kartik    ".strip());
        System.out.println(name.codePointAt(2));
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
