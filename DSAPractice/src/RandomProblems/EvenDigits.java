package RandomProblems;




public class EvenDigits {

    public static void main(String[] args) {

        int[] nums = {555, 901, 482, 1771};

        int ans = findNumbers(nums);
        System.out.println(ans);

    }
    static int findNumbers(int[] nums) {
        int evenDigitCount = 0;

        for (int num : nums) {
            if (countDigits(num) % 2 == 0) {
                evenDigitCount++;
            }
        }

        return evenDigitCount;
    }

    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}



