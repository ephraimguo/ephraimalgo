package ephraim.algo.leetcode;

/**
 * leet code 7
 */
public class Solution_ReverseInteger {
    public static int reverse(int x) {
        int y = x;
        int z = 0;

        while (y != 0) {
            int pop = y % 10;

            if (z > Integer.MAX_VALUE/10 || (z == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;

            }

            if (z < Integer.MIN_VALUE/10 || (z == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;

            }

            z = z * 10 + pop;
            y /= 10;

        }

        return z;
    }

    public static void main(String[] args) {
        System.out.println(reverse(214741111));

        //System.out.println(power(10, 3));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
