package p10.largestprimefactor;

/**
 * Created by vincenthoang on 7/12/17.
 */
public class main2 {
    public static void main(String[] args) {
        long value = 600851475143L;
        long x = 2;
        long y = 0;

        while (value > 1) {
            while (value % x == 0) {
                y = x;
                value = value / x;
            }
            if (x > 2) {
                x += 2;
            } else {
                x += 3;
            }
            System.out.println(value);
        }

    }
}
