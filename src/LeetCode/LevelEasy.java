package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        int maxFlower = 0;
        if (flowerbed.length == 1) {
            if (n == 0) {
                return true;
            } else if (flowerbed[0] == 1 && n > 0) { return false;}
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    maxFlower++;
                }
            } else if (i == flowerbed.length -1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    maxFlower++;
                }
            } else {
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    maxFlower++;
                }
            }

        }

        return (maxFlower >= n);
    }

//    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int maxFlowers = 0;
//        List<Integer> emptyPlots = new ArrayList<>();
//        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
//            maxFlowers++;
//        }
//        if (flowerbed[(flowerbed.length - 2)] == 0 && (flowerbed[flowerbed.length - 1] == 0)) {
//            maxFlowers++;
//        }
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
//        return (maxFlowers >= n);
//    }

    public static int search(int[] nums, int target) {

        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int leftIndex = 0;
        int rightIndex = nums.length -1;

        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (nums[middleIndex] == target) {
                return middleIndex;
            } else if (nums[middleIndex] > target) {
                rightIndex = middleIndex - 1;
            } else if (nums[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            }
        }

        return -1;
    }


    public static boolean isSubsequence(String s, String t) {
        ArrayList<Integer> charOrder = new ArrayList<>();

        int checkpoint = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = checkpoint; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    charOrder.add(j);
                    checkpoint = j + 1;
                    break;
                }
            }
        }
        ArrayList<Integer> sorted = (ArrayList<Integer>) charOrder.stream().sorted().collect(Collectors.toList());
        if (sorted.size() != s.length()) {return false;}
        for (int i = 0; i < charOrder.size(); i++) {
            if (charOrder.get(i) != sorted.get(i)) {
                return false;
            }
        }
        return true;
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        // 1 1 1    2 2 2
        // 1 1 0    2 2 0
        // 1 0 1    2 0 1

        //               x-1, y
        //   x, y-1      x  , y     x, y+1
        //               x+1, y

        int ogColor = image[sr][sc];

        changeColor(image, sr, sc, ogColor, color);

        return image;
    }

    public void changeColor(int[][] image, int x, int y, int ogColor, int newColor) {
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] != ogColor) {
            return;
        } else {
            image[x][y] = newColor;
            changeColor(image, x - 1, y, ogColor, newColor);
            changeColor(image, x + 1, y, ogColor, newColor);
            changeColor(image, x, y - 1, ogColor, newColor);
            changeColor(image, x, y + 1, ogColor, newColor);
        }

    }


}