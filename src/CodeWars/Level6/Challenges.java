package CodeWars.Level6;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenges {


//    Complete the solution so that it splits the string into pairs of two characters.
//    If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//    Examples:
//            * 'abc' =>  ['ab', 'c_']
//            * 'abcdef' => ['ab', 'cd', 'ef']
    public static String[] solution(String s) {
        ArrayList<String> pairs = new ArrayList<>();

        if (s.length() % 2 != 0) {
            s += "_";
        }

        for (int i = 0; i < s.length(); i++) {
            pairs.add(s.substring(i, i+2));
            i++;
        }

        return pairs.toArray(new String[0]);
    }

    public static boolean isValid(char[] walk) {
        return walk.length == 10 && backToStart(walk);
    }

    public static boolean backToStart(char[] directions) {
        int n = 0;
        int s = 0;
        int e = 0;
        int w = 0;

        for (char c : directions) {
            if (c == 'n') {
                n++;
            } else if (c == 's') {
                s++;
            } else if (c == 'e') {
                e++;
            } else if (c == 'w') {
                w++;
            }
        }

        return (n == s && w == e);
    }

    // Are they the "same"?
    public static boolean comp(int[] a, int[] b) {

        if(a == null || b == null || (a.length != b.length)){
            return false;
        }


        for(int i = 0; i < b.length; i++) {
            a[i] = a[i]*a[i];
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++)
            if(a[i] != b[i]) {
                return false;
            }

        return true;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Hello")));
    }



}
