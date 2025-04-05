package arrays.easy;

public class Problem {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        long result = prblm(nums);
        System.out.println(result);
    }
    static long prblm(int[] nums){

            long prevResult = Integer.MIN_VALUE;

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        long result = (long )(nums[i] - nums[j]) * nums[k];

                        if (result > prevResult) {
                            prevResult = result;
                        }
                    }
                }
            }

            return prevResult;
        }

    }
