package RandomProblems;

public class CountPairs {
    public static void main(String[] args) {
        int [] nums = {1,5,3,4,2};
        int diff = 3;
        CountPairs obj = new CountPairs();
        obj.countPairs(nums,diff);

    }

    void countPairs(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == diff) {
                    count++;

                }
            }

        }
        System.out.println(count);
    }
}
