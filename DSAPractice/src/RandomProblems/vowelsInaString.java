package RandomProblems;

public class vowelsInaString {
    public static void main(String[] args) {


        String name = " My name is kartikaya Gupta";
        String[] vowels = {"a", "e", "i", "o", "u"};

        for (int i = 0; i <= name.length()-1; i++) {
            for (int j = 0; j <vowels.length; j++) {
                if (name.charAt(i) == vowels[j].charAt(0)) {
                    System.out.println(vowels[j]);
                }
            }
        }
    }
}