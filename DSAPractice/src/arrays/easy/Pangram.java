package arrays.easy;

public class Pangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(s);
        System.out.println(ans);
    }

    public static boolean checkIfPangram(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
