package WhiteBoard;

import java.util.ArrayList;

public class StringManipulation {



    //Reverse each word in a string
    //Hello my name is Min.
    //olleH ym eman si .niM

    //grab each word
    //reverse the char
    //put it back with spaces

    public String wordReverser(String baseString) {
        StringBuilder sb = new StringBuilder();
        String[] words = baseString.split(" ");

        for (int i = 0; i < words.length; i++) {

        }

        return "";
    }

    public static String takeOutSpace(String input) {
        String outPut = input.replaceAll(" ", "");
        return outPut;
    }

    public static boolean isValid(String s) {
        // Valid if the string has correct types of open and closed brackets.
        // "()" == true, "{()}" == true, "(]" == false "([)]" == false
        // when a bracket opens, the right type must close it.

//        if ((s.contains("(") && s.contains(")")) || (s.contains("[") && s.contains("]")) || (s.contains("{")) && s.contains ("}")) {
//            return true;
//        } else return false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == '{') {
                    if (s.charAt(j) == '}') {
                        return true;
                    }
                } else if (s.charAt(i) == '(') {
                    if (s.charAt(j) == ')') {
                        return true;
                    }
                } else if (s.charAt(i) == '[') {
                    if (s.charAt(j) == ']') {
                        return true;
                    }
                }
                return false;
            }
        }

        return false;
    }




    public static void main(String[] args) {

//        String original = "Hello my name is Min.";
//        StringBuilder sb = new StringBuilder();
//
//        String[] splitWords = original.split(" ");
//
//        for (int i = 0; i < splitWords.length; i++) {
//            sb.append(StringManipulation.reverseString(splitWords[i]));
//            sb.append(" ");
//        }
//        String result = sb.toString();
//        System.out.println(result);
//
//    }
//    public static String reverseString(String string) {
//        StringBuilder sb = new StringBuilder();
//        char[] characters = string.toCharArray();
//        for (int i = characters.length -1; i >= 0; i --) {
//            sb.append(characters[i]);
//        }
//        return sb.toString();

//        StringBuilder sb = new StringBuilder();
//        int nums = 123;
//        String singles = Integer.toString(nums);
//
//        String[] stringNum = singles.split("");
//        ArrayList<Integer> numArray = new ArrayList<>();
//
//        for (String s : stringNum) {
//            numArray.add(Integer.parseInt(s));
//        }
//
//        for (int i = 0; i < numArray.size(); i++) {
//            numArray.set(i, numArray.get(i) * numArray.get(i));
//        }
//
//        for (Integer i : numArray) {
//            sb.append(Integer.toString(i));
//        }
//
//        String ans = sb.toString();
//        int result = Integer.parseInt(ans);
//
//        System.out.println(result);
//    }

        String test = "([)]";

        System.out.println(StringManipulation.isValid(test));

        String hi = "subString";

        System.out.println(StringManipulation.takeOutSpace("Hello How Are You"));

        System.out.println(hi.substring(0,3));

    }
}
