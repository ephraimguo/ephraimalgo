package ephraim.algo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * leet code 13, rome number exchange
 */
public class Solution_RomeInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> rome = new HashMap<>();

        /**
         * I             1
         * V             5
         * X             10
         * L             50
         * C             100
         * D             500
         * M             1000
         */

        rome.put('I', 1);
        rome.put('V', 5);
        rome.put('X', 10);
        rome.put('L', 50);
        rome.put('C', 100);
        rome.put('D', 500);
        rome.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                if (s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    res += s.charAt(i + 1) == 'V' ? 4 : 9;
                    i++;
                    continue;
                }

                if (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    res += s.charAt(i + 1) == 'L' ? 40 : 90;
                    i++;
                    continue;
                }

                if (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    res += s.charAt(i + 1) == 'D' ? 400 : 900;
                    i++;
                    continue;
                }
            }

            res += rome.get(s.charAt(i));
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

    }
}
