package CodeWars.Level7;

public class Challenges {

    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }


    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int total = 0;
        for (int score : classPoints) {
            total += score;
        }
        return yourPoints > (total / classPoints.length);
    }


    public static void main(String[] args) {
    }
}


