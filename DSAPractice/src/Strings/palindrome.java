package Strings;

public class palindrome {
    public static void main(String[] args) {
        String str = "abbcbba";
        System.out.println(isPalindrome(str));
    }
    static Boolean isPalindrome(String str){
           str = str.toLowerCase();
        if(str == null|| str.isEmpty())
            return true;

        for (int i = 0; i < str.length()/2; i++) {
            char start =  str.charAt(i);
            char end =  str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
