package RandomProblems;



public class CommonElementInThreeSortedArray {
    public static void main(String[] args) {



       int [] firstArray = {1,2,9};
       int [] secondArray = {3,8,9};
       int [] thirdArray = {1,9,11};
              int number =0;
        for (int index = 0; index < firstArray.length ; index++) {
            for (int index1 = 0; index1 < secondArray.length; index1++) {
                if (firstArray[index] == secondArray[index1]) {
                    number = firstArray[index];
                }
            }
        }
            for (int index3 = 0; index3 < thirdArray.length; index3++) {
                if(thirdArray[index3]==number){
                    System.out.println(number);
                }
            }
        }



   }


        








