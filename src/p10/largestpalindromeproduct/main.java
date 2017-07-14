package p10.largestpalindromeproduct;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by vincenthoang on 7/12/17.
 */
public class main {
    public static void main(String[] args) {
        int product;
        ArrayList<Integer> palindromes = new ArrayList<>();

        for (int x = 999; x > 0; x--) {
            for (int y = 999; y > 0; y--) {
                product = x * y;
                if (isPalindrome(product)) {
                    palindromes.add(product);
                }
            }
        }

        Collections.sort(palindromes);
        System.out.println(palindromes.get(palindromes.size()-1));
    }

    public static boolean isPalindrome(int value) {
        String parse = String.valueOf(value);
        String a;
        String b;
        for (int i = 0, n = parse.length(); i < n; i++) {
            a = parse.substring(i, i + 1);
            b = parse.substring(n - i - 1, n - i);
            if (!a.equals(b)) {
                return false;
            }
        }

        return true;
    }

}
