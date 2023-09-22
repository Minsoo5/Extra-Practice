package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LevelEasy {


        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> ans = new ArrayList<>();
            int biggestNum = 0;
            for (int i = 0; i < candies.length; i++) {
                if (candies[i] >= biggestNum) {
                    biggestNum = candies[i];
                }
            }

            for (int i = 0; i < candies.length; i++) {
                if (candies[i] + extraCandies >= biggestNum) {
                    ans.add(i, true);
                } else {
                    ans.add(i, false);
                }
            }
            return ans;
        }

}
