package p10.sumsquaredifference;

/**
 * Created by vincenthoang on 7/12/17.
 */
public class main {
    public static void main(String[] args) {
        long sum = 0;
        long square = 0;
        long difference = 0;

        for (long i = 1; i <= 100; i++) {
            sum += i * i;
        }

        for (long i = 1; i <= 100; i++) {
            square += i;
        }

        square *= square;

        difference = square - sum;

        System.out.println(sum);
        System.out.println(square);
        System.out.println(difference);
    }
}
