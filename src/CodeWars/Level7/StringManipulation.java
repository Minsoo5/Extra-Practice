package CodeWars.Level7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        String[] words = phrase.split(" ");
        String result = "";
        for (String s : words) {
            result += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        return result.trim();
    }

    public String toJadenCase2(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        ArrayList<String> words = new ArrayList<>(Arrays.stream(phrase.split(" ")).toList());
        StringBuilder sb = new StringBuilder();

        words.stream().forEach(w -> sb.append(w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase() + " "));
        return sb.toString().trim();
    }

    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c && b + c > a && c + a > b);
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[] {};
        }

        int pos = 0;
        int neg = 0;

        for (int i : input) {
            if (i > 0) {
                pos++;
            } else {
                neg += i;
            }
        }
        return new int[] {pos, neg};
    }

    public static double find_average(int[] array){
        if (array == null || array.length == 0) {
            return 0;
        }
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return (double) total / array.length;
    }

    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return ChronoUnit.DAYS.between(last, today) > cycleLength;
    }


    public static int TwiceAsOld(int dadYears, int sonYears){
        int dadStart = dadYears - sonYears;
        int sonStart = sonYears - sonYears;

        while ((sonStart * 2) != dadStart) {
            dadStart ++;
            sonStart ++;
        }
        return Math.abs(dadYears - dadStart);
    }

    public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        if (words.length == 0) {
            return original;
        }
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            sb.append(new StringBuilder(s).reverse().append(" "));
        }
        return sb.toString().trim();
    }

    public static String reverseWords2(final String original) {
        String[] words = original.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            sb.append(new StringBuilder(s).reverse().append(" "));
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String [] arr = {"a", "b", "c", "d", "e"};
        System.out.println(String.join("X", arr));
    }
}
