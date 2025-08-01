package Strings;


public class Basics {
    public static void main(String[] args) {

//        String  series = "";
//        for (int i = 0; i < 26 ; i++) {
//            char ch = (char) ('a'+i);
//                series += ch  ;
//        }
//        System.out.println(series);


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
             char ch = (char)('a'+i);
                sb.append(ch);

        }
        System.out.println(sb);

    }
}
