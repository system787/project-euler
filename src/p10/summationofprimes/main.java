package p10.summationofprimes;

/**
 * Created by vincenthoang on 7/14/17.
 */
public class main {
    public static void main(String[] args) {
        long sum = 2;

        for (int i = 3; i < 2000000; i+=2) {
            if (p10.prime10001st.main.checkPrime(i)) sum += i;
            }
        System.out.println(sum);
    }
}
