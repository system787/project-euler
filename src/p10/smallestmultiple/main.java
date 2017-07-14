package p10.smallestmultiple;

/**
 * Created by vincenthoang on 7/12/17.
 */
public class main {
    public static void main(String[] args) {
        int i = 5;
        while (!checkMultiple(i)) {
            i += 5;
        }
        System.out.println(i);
    }

    public static boolean checkMultiple(int input) {
        for (int i = 20; i > 0; i--) {
            if (input % i != 0) {
                return false;
            }
        }
        return true;
    }
}
