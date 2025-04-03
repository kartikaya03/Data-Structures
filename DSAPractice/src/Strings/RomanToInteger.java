package Strings;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

        HashMap<Character,Integer > map = new HashMap<>();
      map.put('I',1);
      map.put('V',5);
      map.put('X',10);
      map.put('L',50);
      map.put('C',100);
      map.put('D',500);
      map.put('M',1000);

        String s = "MCMXCIV";// 1994
         int total=0;
         //print sum of all characters in string
        for (int i = 0; i < s.length(); i++) {
            int currValue = map.get(s.charAt(i));

            // Check if the next value exists and is greater (subtraction case)
            if (i < s.length() - 1 && currValue < map.get(s.charAt(i + 1))) {
                total -= currValue; // Subtract current value
            } else {
                total += currValue; // Add current value
            }
        }

        System.out.println(total);
    }


        }


