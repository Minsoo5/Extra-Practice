package CodeWars.Level7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringManipulation {
    public static String maskify(String str) {
        if (str.length() > 4) {
            String s = "";
            for (int i = 0; i < str.length() - 4; i++) {
                s += "#";
            }
            s += str.substring(str.length()-4);
            return s;
        }
        return str;
    }


    public static String findNeedle(Object[] haystack) {
        String ans = "found the needle at position ";

        for(int i = 0; i < haystack.length; i++) {
            if (haystack[i] == ("needle")) {
                ans += i;
                break;
            }
        }
        return ans;
    }


    public static String accum(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i+1; j++) {
                if (j == 0) {
                    ans += Character.toUpperCase(s.charAt(i));
                } else {
                   ans += Character.toLowerCase(s.charAt(i));
                }
            }
            ans += "-";
        }
        return ans.substring(0, ans.length()-1);
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(o -> o.getClass() == Integer.class).collect(Collectors.toList());
    }

    public static int[] digitize(long n) {
//        String nString = String.valueOf(n);
//        int[] intArray = new int[nString.length()];
//        int counter = 0;
//        for (int i = nString.length()-1; i >= 0; i--) {
//            intArray[counter] = Integer.parseInt(String.valueOf(nString.charAt(i)));
//            counter++;
//        }
//
//
//        return intArray;

        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }


    public static int[] arrayDiff(int[] a, int[] b) {
        // Remove from a if b also has it. Preserve order.
        // Your code here





        return a;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231L)));
    }
}
