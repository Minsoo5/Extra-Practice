package WhiteBoard;

public class NumberManipulation {

    public static int factorial(int x) {
       if (x == 1) return 1;
       return x * factorial(x - 1);
    }

    public static boolean primeNumCheck (int x) {
        boolean checker = true;
        if (x <= 0) { return false;}
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return checker;
    }


    public static int factorialOneLine(int x) {
        return x == 1 ? 1 : x * factorialOneLine(x - 1);
    }

}
