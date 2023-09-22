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


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxFlowers = 0;
        List<Integer> emptyPlots = new ArrayList<>();
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            maxFlowers++;
        }
        if (flowerbed[(flowerbed.length - 2)] == 0 && (flowerbed[flowerbed.length - 1] == 0)) {
            maxFlowers++;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int temp = 1;
                for (int j = i + 1; j < flowerbed.length; j++) {
                    if (flowerbed[j] == 0) {
                        temp++;
                        i++;
                    } else {
                        emptyPlots.add(temp);
                        break;
                    }
                }
            }

        }
        for (int i = 0; i < emptyPlots.size(); i++) {
            if (emptyPlots.get(i) >= 3) {
                int temp = emptyPlots.get(i);
                int remainder = temp - 3;
                maxFlowers++;
                if ((remainder / 2) > 0) {
                    maxFlowers += Math.floorDiv(remainder, 2);
                }
            }
        }
        return (maxFlowers >= n);
    }


//    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    // 1 0 0 0 1
//            int maxFlowers = 0;
//            List<Integer> emptyPlots = new ArrayList<>();
//        for (int i = 0; i < flowerbed.length; i++) {
//            if (flowerbed[i] == 0) {
//                int temp = 1;
//                for (int j = i + 1; j < flowerbed.length; j++) {
//                    if (flowerbed[j] == 0) {
//                        temp++;
//                        i++;
//                    } else {
//                        emptyPlots.add(temp);
//                        break;
//                    }
//                }
//            }
//
//        }
//        for (int i = 0; i < emptyPlots.size(); i++) {
//            if (emptyPlots.get(i) >= 3) {
//                int temp = emptyPlots.get(i);
//                int remainder = temp - 3;
//                maxFlowers++;
//                if ((remainder / 2) > 0) {
//                    maxFlowers += Math.floorDiv(remainder, 2);
//                }
//            }
//        }
//            return (maxFlowers >= n);
//    }
//}

}