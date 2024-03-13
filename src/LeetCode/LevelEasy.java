package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
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

    // 605
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxFlower = 0;

        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            maxFlower ++;
            return n <= maxFlower;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    maxFlower++;
                    flowerbed[i] = 1;
                }
            } else if (i == flowerbed.length -1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    maxFlower++;
                    flowerbed[i] = 1;
                }
            } else {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    maxFlower++;
                    flowerbed[i] = 1;
                }
            }

        }

        return n <= maxFlower;
    }


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

    //1071
    public static String gcdOfStrings(String str1, String str2) {
        // Check and see if the smaller string can fit into large string with 0 remainders
        // Check if it contains it

        String shortest = str1.length() <= str2.length() ? str1 : str2;
        String longest = str1.length() > str2.length() ? str1 : str2;;

        for (int i = shortest.length(); i > 0; i--) {
            String temp = shortest.substring(0, i);
            if (longest.contains(temp) && longest.length() % temp.length() == 0 && shortest.length() % temp.length() == 0) {
               if (longest.equals(temp.repeat(longest.length() / temp.length())) && shortest.equals(temp.repeat(shortest.length() / temp.length()))) {
                   return temp;
               }

            }
        }

        return "";
    }


    //345
    public static String reverseVowels(String s) {
        // Input:   "leetcode"
        // Output:  "leotcede"

        // Find all vowels
        // Make note of their positions
        // reverse it / build it BUT refer to a different chart when building the vowels

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Integer> vowelPlacements = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                vowelPlacements.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        int counter = vowelPlacements.size() - 1;


        for (int i = 0; i < s.length(); i++) {
            if (!vowels.contains(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else {
                sb.append(s.charAt(vowelPlacements.get(counter)));
                counter--;
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

}