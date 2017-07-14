package p10.prime10001st;

import java.util.ArrayList;

/**
 * Created by vincenthoang on 7/12/17.
 */
public class main {
    public static void main(String[] args) {
        ArrayList<Integer> primelist = new ArrayList<>();
        int i = 2;

        if (checkPrime(i)) {
            primelist.add(i);
        }

        i = 3;

        while (primelist.size() < 10002) {
            if (checkPrime(i)) {
                primelist.add(i);
            }
            i += 2;
        }

        System.out.println(primelist.get(10000));
        System.out.println(primelist.get(10001));
    }

    public static boolean checkPrime(int input) {
        if (input <= 1) return false;
        else if (input <= 3) return true;
        else if (input % 2 == 0 || input % 3 ==0) return false;

        for (int i = 5; i * i <= input; i += 6) {
            if (input % i == 0 || input % (i + 2) == 0) return false;
        }

        return true;
    }
}
