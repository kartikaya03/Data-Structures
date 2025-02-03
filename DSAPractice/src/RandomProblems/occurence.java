package RandomProblems;

public class occurence {
    public static void main(String[] args) {


        int[] arr = {90, 10, 20, 80, 70, 100,80,80,80};
        int number = 80;
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==number){
                count++;
            }

        }
        System.out.println(count);

    }
}
