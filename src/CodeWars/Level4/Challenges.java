package CodeWars.Level4;

import java.math.BigInteger;
import java.util.*;

public class Challenges {

    public static String stripComments(String text, String[] commentSymbols) {
        // First find the comment symbol
        // Then keep track of how long until '\n'
        // Delete everything from comment symbol to \n

        boolean notComment = true;

        ArrayList<String> symbols = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String s : commentSymbols) {
            symbols.add(s);
        }

        for (int i = 0; i < text.length(); i++) {
            if (symbols.contains(String.valueOf(text.charAt(i)))) {
                notComment = false;
            } else if (text.charAt(i) == '\n') {
                notComment = true;
                sb.append("\n");
            } else if (!symbols.contains(String.valueOf(text.charAt(i))) && notComment) {
                sb.append(text.charAt(i));
            }
        }

        return sb.toString().trim().replaceAll(" {1,3}" + "\n", "\n");
    }


    public static String add(String a, String b) {
//        return String.valueOf(new BigInteger(a).add(new BigInteger(b)));

        a = a.trim();
        b = b.trim();

        // 125,748 + 663,874
        // split into 125, 748 and 663, 874
        // 125 + 663 and 748 + 874
        // 788 and 1,622
        // 789 and 622
        // concat into 789622

        List<String> firstNum = new ArrayList<>();

        for (int i = a.length() -1 ; i >= 0; i-=3) {
            if (i >= 2) {
                firstNum.add(a.substring(i - 2, i + 1));
            } else {
                firstNum.add(a.substring(0, i + 1));
            }
        }

        List<String> secondNum = new ArrayList<>();

        for (int i = b.length() -1 ; i >= 0; i-=3) {
            if (i >= 2) {
                secondNum.add(b.substring(i - 2, i + 1));
            } else {
                secondNum.add(b.substring(0, i + 1));
            }
        }

        ArrayList<String> summedNum = new ArrayList<>();

        int shortest = firstNum.size() <= secondNum.size() ? firstNum.size() : secondNum.size();

        boolean carryTheOne = false;
        for (int i = 0; i < shortest; i++) {

            int combinedNum = Integer.parseInt(firstNum.get(i)) + Integer.parseInt(secondNum.get(i));
            if (carryTheOne) {
                combinedNum += 1;
                carryTheOne = false;
            }
            if (combinedNum >= 1000) {
                carryTheOne = true;
                summedNum.add(String.valueOf(combinedNum).substring(1));
            } else {
                summedNum.add(String.valueOf(combinedNum));
            }
        }

        if (firstNum.size() > shortest) {
            for (int i = shortest; i < firstNum.size(); i++) {
                if (carryTheOne) {
                    summedNum.add(String.valueOf(Integer.parseInt(firstNum.get(i)) + 1));
                    carryTheOne = false;
                } else {
                    summedNum.add(firstNum.get(i));
                }
            }
        } else if (secondNum.size() > shortest) {
            for (int i = shortest; i < secondNum.size(); i++) {
                if (carryTheOne) {
                    summedNum.add(String.valueOf(Integer.parseInt(secondNum.get(i)) +1));
                    carryTheOne = false;
                } else {
                    summedNum.add(secondNum.get(i));
                }
            }
        }

        if (carryTheOne) {
            summedNum.add("1");
        }

        StringBuilder sb = new StringBuilder();

        for (int i = summedNum.size() - 1; i >= 0 ; i--) {
            if (summedNum.get(i).length() == 3) {
                sb.append(summedNum.get(i));
            } else {
                sb.append("0" + summedNum.get(i));
            }
        }

        int leadingZeroEnd = -1;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                leadingZeroEnd = i;
            } else {
                i = sb.length();
            }
        }

        if (leadingZeroEnd > -1) {
            return sb.substring(leadingZeroEnd + 1);
        }

        return sb.toString();
    }



    public static void main(String[] args) {


        System.out.println(add("0666135239942288032 ", "718768063846251167004474442 "));

        System.out.println("718768064512386406946762474 -> Answer");
        //91002328220491911630239667963

    }
}
