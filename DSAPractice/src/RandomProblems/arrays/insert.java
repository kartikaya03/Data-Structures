package RandomProblems.arrays;

public class insert {

    public static void main(String[] args) {
        int [] nums = {1,2,3,5};
        int target = 5;
        insertArray(nums,target);
    }

    static void insertArray( int [] nums , int target){

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==target){
                    int temp  = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.println(nums[i]);
        }
    }
}
