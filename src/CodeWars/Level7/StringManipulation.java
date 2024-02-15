package CodeWars.Level7;

public class StringManipulation {
    public static String maskify(String str) {
        if (str.length() > 4) {
            String s = "";
            for (int i = 0; i < str.length() - 4; i++) {
                s += "#";
            }
            s += str.substring(str.length()-4);
            return s;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(maskify("skippy"));
    }
}
