package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenges {

    public static String battle(String goodAmounts, String evilAmounts) {
        String[] goodArray = goodAmounts.split(" ");
        String[] evilArray = evilAmounts.split(" ");

        ArrayList<Integer> goodNums = new ArrayList<>();
        ArrayList<Integer> evilNums = new ArrayList<>();
        ArrayList<Integer> goodModified = new ArrayList<>();
        ArrayList<Integer> badModified = new ArrayList<>();

        for (String s : goodArray) {
            goodNums.add(Integer.parseInt(s));
        }
        for (String s : evilArray) {
            evilNums.add(Integer.parseInt(s));
        }
        goodNums.set(0, goodNums.get(0) * 1);
        goodNums.set(1, goodNums.get(1) * 2);
        goodNums.set(2, goodNums.get(2) * 3);
        goodNums.set(3, goodNums.get(3) * 3);
        goodNums.set(4, goodNums.get(4) * 4);
        goodNums.set(5, goodNums.get(5) * 10);

        int goodTotal = 0;
        for (Integer n : goodNums) {
            goodTotal += n;
        }

        evilNums.set(0, evilNums.get(0) * 1);
        evilNums.set(1, evilNums.get(1) * 2);
        evilNums.set(2, evilNums.get(2) * 2);
        evilNums.set(3, evilNums.get(3) * 2);
        evilNums.set(4, evilNums.get(4) * 3);
        evilNums.set(5, evilNums.get(5) * 5);
        evilNums.set(6, evilNums.get(6) * 10);

        int evilTotal = 0;
        for (Integer n : evilNums) {
            evilTotal += n;
        }

        if (goodTotal > evilTotal) {
            return "Battle Result: Good triumphs over Evil";
        } else if (goodTotal < evilTotal) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else
        return "Battle Result: No victor on this battle field";
    }


    public static void main(String[] args) {
        System.out.println(battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }
}
