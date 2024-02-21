package CodeWars.Level6;

import java.util.*;
import java.util.stream.Collectors;

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

    public static int[] arrayDiff(int[] a, int[] b) {
        // Remove from a if b also has it. Preserve order.
        // Your code here

        ArrayList<Integer> ans = new ArrayList<>();
        for (int n : a) {
            ans.add(n);
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    ans.remove(Integer.valueOf(b[i]));
                }
            }
        }

        int[] ans1 = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            ans1[i] = ans.get(i);
        }

        return ans1;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int squareRoot = (int)Math.sqrt(num) + 1;
        for (int i = 2; i < squareRoot; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static String decode(String morseCode) {
        String[] separated = morseCode.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : separated) {
            sb.append(s + "@");
        }
        if (sb.charAt(0) == '@') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static String createPhoneNumber(int[] numbers) {
        String number = "";

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                number += "(";
                number += String.valueOf(numbers[i]);
            }
            if (i == 1) {
                number += String.valueOf(numbers[i]);
            }
            if (i == 2) {
                number += String.valueOf(numbers[i]);
                number += ") ";
            }
            if (i > 2 && i != 5) {
                number += String.valueOf(numbers[i]);
            }
            if (i == 5) {
                number += String.valueOf(numbers[i]);
                number += "-";
            }
        }
        return number;
    }

    public static int digital_root(int n) {
        // Turn to string, turn each string digit into num then add together and return

//        String[] strings = String.valueOf(n).split("");
//        int total = 0;
//
//        for (String s : strings) {
//            total += Integer.parseInt(s);
//        }
//
//        return n < 10 ? n : digital_root(total);

        return n < 10 ? n : digital_root(String.valueOf(n).chars().map(c -> Character.getNumericValue(c)).sum());
    }

    public static int findIt(int[] a) {
        HashMap<Integer, Integer> numOfTimes = new HashMap<>();

        for (int i : a) {
            if (numOfTimes.containsKey(i)) {
                numOfTimes.replace(i, numOfTimes.get(i) + 1);
            } else {
                numOfTimes.put(i, 1);
            }
        }
        Set<Integer> keySet = numOfTimes.keySet();
        for (Integer key : keySet) {
            if (numOfTimes.get(key) % 2 == 1) {
                return key;
            }
        }
        return 0;
    }

    public static int solution(int number) {

        Set<Integer> multiples = new HashSet<>();
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
        }
        return multiples.stream().mapToInt(Integer::intValue).sum();

//        int sum = 0;
//        for (int i = 1; i < number; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                sum += i;
//            }
//        }
//        return sum;
    }

    public static void main(String[] args) {

        System.out.println(solution(10));
    }



}
