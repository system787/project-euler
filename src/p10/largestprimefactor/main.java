package p10.largestprimefactor;

/**
 * Attempt to implement Pollard's Rho algorithm
 */
public class main {

    public static void main(String[] args) {
        long value = 600851475143L;
        long rho = pollardRho(value);

        System.out.println(rho);
    }

    public static long equation(long input, long factor) {
        long test = (input * input) + 1;
        long test2 = test % factor;
        return test2;
        //return ((long) Math.pow(input, 2) + 1) % number;
    }

    public static long gcd(long input, long value) {
        if (value == 0) {
            return input;
        }
        return gcd(value, input % value);
    }

    public static long pollardRho(long value) {
        long x = 2;
        long y = 2;
        long d = 1;

        while (d == 1) {
            x = equation(x, value);
            y = equation(equation(y, value), value);
            d = gcd((Math.abs(x-y)), value);
        }

        if (value % d == 0 && value > d) {
            return pollardRho((value / d));
        }
        return d;
    }
}
