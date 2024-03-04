package CodeWars.Level5;

import java.util.*;

public class Challenges {
//    public static String rgb(int r, int g, int b) {
//        // Divide number by 16 which then equals the first letter
//        // Take the remainder after he decimal point and multiply it by 16 to get the second
//        ArrayList<String> hexCode = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"));
//        StringBuilder sb = new StringBuilder();
//
//        hex(r, hexCode, sb);
//        hex(g, hexCode, sb);
//        hex(b, hexCode, sb);
//
//        return sb.toString();
//    }
//
//    public static void hex(int num, List<String> hexCode, StringBuilder sb) {
//        if (num > 255) { num = 255; }
//        if (num < 0) { num = 0; }
//
//        Double dividedNum = (num/16.0);
//        String[] splitR = String.valueOf(dividedNum).split("\\.");
//        sb.append(hexCode.get(Integer.parseInt(splitR[0])));
//        sb.append(hexCode.get((int) (Double.parseDouble(("." + splitR[1])) * 16)));
//
//    }

    public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", verify(r), verify(g), verify(b));
    }

    private static int verify(int i) {
        return i > 0 ? Math.min(255, i) : 0;
    }


    public static void main(String[] args) {
        System.out.println(rgb(-20, 275, 125));

    }
}
