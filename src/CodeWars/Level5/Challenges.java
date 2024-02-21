package CodeWars.Level5;

import java.util.*;

public class Challenges {
    public static String rgb(int r, int g, int b) {
        // Divide number by 16 which then equals the first letter
        // Take the remiander after he decimal point and multiply it by 16 to get the second
        ArrayList<String> hexCode = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"));
        StringBuilder sb = new StringBuilder();

        if (r > 255) { r = 255;}
        if (r < 0) { r = 0;}
        if (g > 255) { g = 255;}
        if (g < 0) { g = 0;}
        if (b > 255) { b = 255;}
        if (b < 0) { b = 0;}

        Double dividedR = (r/16.0);
        String[] splitR = String.valueOf(dividedR).split("\\.");
        sb.append(hexCode.get(Integer.parseInt(splitR[0])));
        sb.append(hexCode.get((int) (Double.parseDouble(("." + splitR[1])) * 16)));

        Double dividedG = (g/16.0);
        String[] splitG = String.valueOf(dividedG).split("\\.");
        sb.append(hexCode.get(Integer.parseInt(splitG[0])));
        sb.append(hexCode.get((int) (Double.parseDouble(("." + splitG[1])) * 16)));

        Double dividedB = (b/16.0);
        String[] splitB = String.valueOf(dividedB).split("\\.");
        sb.append(hexCode.get(Integer.parseInt(splitB[0])));
        sb.append(hexCode.get((int) (Double.parseDouble(("." + splitB[1])) * 16)));

        return sb.toString();
    }



    public static void main(String[] args) {
        System.out.println(rgb(-20, 275, 125));


    }
}
