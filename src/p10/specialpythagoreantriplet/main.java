package p10.specialpythagoreantriplet;

/**
 * Created by vincenthoang on 7/13/17.
 */
public class main {
    public static void main(String[] args) {
        for (int c = 0; c < 1000; c++) {
            for (int b = 0; b < c; b++) {
                for (int a = 0; a < b; a++) {
                    if (checkBoth(a, b, c)) {
                        System.out.println(a * b * c);
                    }
                }
            }
        }

    }

    public static boolean calculate1000(int a, int b, int c) {
        if (a+b+c!=1000) return false;
        return true;
    }

    public static boolean checkValidTriplet(int a, int b, int c) {
        if ((a*a) + (b*b) != (c*c)) return false;
        return true;
    }

    public static boolean checkBoth(int a, int b, int c) {
        if (checkValidTriplet(a, b, c) && calculate1000(a, b, c)) {
            return true;
        }
        return false;
    }
}
