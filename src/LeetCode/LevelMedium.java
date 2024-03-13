package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelMedium {

    // 151
    public static String reverseWords(String s) {
        List<String> splitWords = Arrays.asList(s.split("\\s{1,}"));
        StringBuilder sb = new StringBuilder();

        for (int i = splitWords.size() - 1; i >= 0 ; i--) {
            sb.append(splitWords.get(i));
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    // 238
    public static int[] productExceptSelf(int[] nums) {
        // O(n) AND no dividing
        int[] ans = new int[nums.length];
        int numOfZeros = 0;

            for (int i = 0; i < nums.length; i++) {
                int currentNum = nums[i];
                if (currentNum == 0) {
                    numOfZeros++;
                    if (numOfZeros > 1) {
                        return new int[nums.length];
                    }
                }
                ans[i] = (int) Arrays.stream(nums)
                        .asLongStream()
                        .filter(n -> n != currentNum)
                        .reduce(1, (a, b) -> a * b);
            }

        return ans;
    }

    public static int multiply(int ... nums) {
        int ans = 1;
        for (int i : nums) {
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{4, 3, 2, 1, 2})));
    }

}
