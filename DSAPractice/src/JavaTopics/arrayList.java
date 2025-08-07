package JavaTopics;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        //initialization part
        for (int index = 0; index < 3 ; index++) {
              list.add(new ArrayList<>());
        }


        //printing multiDimention arrayList
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {


                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);


    }
}
