public class Calculate {




    public int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public int subtract(int z) {
        return z;
    }


    public long factorial(long n) {
        return n == 1 ? 1 : n * factorial(n - 1);
//        return n * factorial(n - 1);
    }


}
