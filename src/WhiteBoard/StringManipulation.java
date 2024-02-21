package WhiteBoard;

import java.util.ArrayList;
import java.util.Arrays;

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

    public static int countOfWordsInString(String string) {
        // No use .trim or .split
        if (!string.contains(" ")) {
            return 1;
        }
        int spaceCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i > 0 && i < string.length() -1) {
                if (string.charAt(i - 1) != ' ' && string.charAt(i) == ' ' && string.charAt(i + 1) != ' ') {
                    spaceCounter++;
                }
            }
        }
        return spaceCounter + 1;
    }

    public static int[] countWordsInStringInArray(String[] stringArray) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Arrays.stream(stringArray)
                .toList()
                .forEach(string -> numbers.add(StringManipulation.countOfWordsInString(string)));

        return numbers.stream().mapToInt(i -> i).toArray();
    }

    public static String solution(int num) {
        return num + "";
    }




    public static void main(String[] args) {

        String[] stringArray = {"one", "two two", "three three thee", "four, four, four, four", "There are five words here"};
        System.out.println(StringManipulation.countOfWordsInString("There are five words here"));

        System.out.println(Arrays.toString(StringManipulation.countWordsInStringInArray(stringArray)));


    }
}
