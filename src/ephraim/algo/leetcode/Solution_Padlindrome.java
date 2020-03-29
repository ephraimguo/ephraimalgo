package ephraim.algo.leetcode;

/**
 * leet code 7
 */
public class Solution_Padlindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int y = x;
        int z = 0;

        while (y > 0) {
            int pop = y % 10;

            if (z > Integer.MAX_VALUE / 10 || (z == Integer.MAX_VALUE / 10 && pop > 7)) {
                return false;
            }

            z = z * 10 + pop;
            y /= 10;
        }
        return z == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(123321));

    }
}
